package me.songha.assignment.coupon;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import me.songha.assignment.common.model.DateTime;
import me.songha.assignment.common.model.ExpirationDateTime;
import me.songha.assignment.voucher.Voucher;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
@Table(name = "coupon")
@Entity
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 32)
    @Column(name = "name", length = 32)
    private String name;

    @OneToOne
    @JoinColumn(name = "voucher_id")
    private Voucher voucher;

    @Embedded
    private ExpirationDateTime expirationDateTime;

    @Embedded
    private DateTime dateTime;
}
