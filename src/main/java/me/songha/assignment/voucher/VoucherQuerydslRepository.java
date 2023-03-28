package me.songha.assignment.voucher;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static me.songha.assignment.voucher.QVoucher.voucher;

@Repository
@RequiredArgsConstructor
public class VoucherQuerydslRepository {
    private final JPAQueryFactory jpaQueryFactory;

    public VoucherDto getVoucherDto(Long id) {
        return jpaQueryFactory.select(new me.songha.assignment.voucher.QVoucherDto(
                        voucher.id,
                        voucher.name,
                        voucher.price,
                        voucher.period
                ))
                .from(voucher)
                .where(voucher.id.eq(id))
                .fetchFirst();
    }
}
