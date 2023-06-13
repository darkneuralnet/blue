package p000;
/* renamed from: K94 */
/* loaded from: classes6.dex */
public @interface K94 {

    /* renamed from: K94$a */
    /* loaded from: classes6.dex */
    public enum EnumC4366a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    EnumC4366a intEncoding() default EnumC4366a.DEFAULT;

    int tag();
}
