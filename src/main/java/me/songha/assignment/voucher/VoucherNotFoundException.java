package me.songha.assignment.voucher;

import lombok.Getter;

@Getter
public class VoucherNotFoundException extends RuntimeException {
    private final Long id;

    public VoucherNotFoundException(Long id) {
        super(id + "is not found.");
        this.id = id;
    }
}
