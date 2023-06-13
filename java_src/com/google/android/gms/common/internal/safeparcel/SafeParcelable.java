package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
/* loaded from: classes5.dex */
public interface SafeParcelable extends Parcelable {
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* loaded from: classes5.dex */
    public @interface Class {
        String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* loaded from: classes5.dex */
    public @interface Constructor {
    }

    /* loaded from: classes5.dex */
    public @interface Field {
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int m51606id();

        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* loaded from: classes5.dex */
    public @interface Indicator {
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* loaded from: classes5.dex */
    public @interface Param {
        /* renamed from: id */
        int m51605id();
    }

    /* loaded from: classes5.dex */
    public @interface RemovedParam {
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int m51604id();
    }

    /* loaded from: classes5.dex */
    public @interface Reserved {
        int[] value();
    }

    /* loaded from: classes5.dex */
    public @interface VersionField {
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int m51603id();

        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
