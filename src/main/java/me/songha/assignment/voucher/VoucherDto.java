package me.songha.assignment.voucher;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class VoucherDto {
    private Long id;
    private String name;
    private int price;
    private int period;

    @Builder
    public VoucherDto(Voucher voucher) {
        this.id = voucher.getId();
        this.name = voucher.getName();
        this.price = voucher.getPrice();
        this.period = voucher.getPeriod();
    }

    @QueryProjection
    public VoucherDto(Long id, String name, int price, int period) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.period = period;
    }
}
