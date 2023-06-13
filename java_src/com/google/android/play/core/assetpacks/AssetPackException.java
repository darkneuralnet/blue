package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.AbstractC17969j;
/* loaded from: classes6.dex */
public class AssetPackException extends AbstractC17969j {

    /* renamed from: b */
    public final int f73700b;

    public AssetPackException(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i), OJ6.m92415a(i)));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
        this.f73700b = i;
    }

    @Override // com.google.android.play.core.tasks.AbstractC17969j
    /* renamed from: a */
    public int mo39546a() {
        return this.f73700b;
    }
}
