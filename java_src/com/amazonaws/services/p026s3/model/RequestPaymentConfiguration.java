package com.amazonaws.services.p026s3.model;
/* renamed from: com.amazonaws.services.s3.model.RequestPaymentConfiguration */
/* loaded from: classes3.dex */
public class RequestPaymentConfiguration {
    private Payer payer;

    /* renamed from: com.amazonaws.services.s3.model.RequestPaymentConfiguration$Payer */
    /* loaded from: classes3.dex */
    public enum Payer {
        Requester,
        BucketOwner
    }

    public RequestPaymentConfiguration(Payer payer) {
        this.payer = payer;
    }

    public Payer getPayer() {
        return this.payer;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }
}
