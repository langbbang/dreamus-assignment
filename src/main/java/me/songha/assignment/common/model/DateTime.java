package me.songha.assignment.common.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.ZonedDateTime;

@Getter
@ToString
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DateTime {
    @CreatedDate
    @NotNull
    @Column(name = "CREATE_AT", updatable = false)
    private ZonedDateTime createAt;

    @LastModifiedDate
    @Column(name = "UPDATE_AT")
    private ZonedDateTime updateAt;
}
