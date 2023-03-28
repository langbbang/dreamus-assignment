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
public class ExpirationDateTime {
    @CreatedDate
    @NotNull
    @Column(name = "start_at", updatable = false)
    private ZonedDateTime startAt;

    @LastModifiedDate
    @Column(name = "end_at")
    private ZonedDateTime endAt;
}
