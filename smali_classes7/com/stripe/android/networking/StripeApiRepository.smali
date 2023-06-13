.class public final Lcom/stripe/android/networking/StripeApiRepository;
.super Lcom/stripe/android/networking/StripeRepository;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/networking/StripeApiRepository$Companion;,
        Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00de\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u0000 \u0091\u00022\u00020\u0001:\u0004\u0091\u0002\u0092\u0002BQ\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0001\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u0012\u000e\u0008\u0001\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011B\u00ad\u0001\u0008\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0018\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c\u0012\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\n\u0012\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010 \u001a\u00020\u0006\u00a2\u0006\u0002\u0010!JK\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00080\u00101JA\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000608H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109JA\u0010:\u001a\u0004\u0018\u00010;2\u0006\u00104\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000608H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109JA\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010@J$\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060B2\u000e\u0008\u0002\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nH\u0002J-\u0010D\u001a\u0004\u0018\u0001032\u0006\u00105\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008F\u0010GJ-\u0010H\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008I\u0010GJ%\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008L\u0010MJ3\u0010N\u001a\u0004\u0018\u0001032\u0006\u0010O\u001a\u00020P2\u0006\u0010E\u001a\u00020/2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000608H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008Q\u0010RJ1\u0010S\u001a\u0004\u0018\u0001032\u0006\u0010O\u001a\u00020P2\u0006\u0010E\u001a\u00020/2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000608H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010RJ3\u0010T\u001a\u0004\u0018\u00010;2\u0006\u0010U\u001a\u00020V2\u0006\u0010E\u001a\u00020/2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000608H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008W\u0010XJY\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010[\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\u00062\u0008\u0010^\u001a\u0004\u0018\u00010\u00062\u0008\u0010_\u001a\u0004\u0018\u00010`2\u0008\u0010a\u001a\u0004\u0018\u00010\u00062\u0006\u0010b\u001a\u00020c2\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJ*\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020g0f2\u0006\u00104\u001a\u00020\u00062\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000608H\u0002J#\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010.\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008l\u0010mJ#\u0010n\u001a\u0004\u0018\u00010o2\u0006\u0010p\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ+\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010p\u001a\u00020\u00062\u0006\u0010s\u001a\u00020t2\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010uJ+\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010p\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ-\u0010w\u001a\u0004\u0018\u00010o2\u0006\u00105\u001a\u00020\u00062\u0006\u0010x\u001a\u00020y2\u0006\u0010.\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008z\u0010{J#\u0010|\u001a\u0004\u0018\u00010>2\u0006\u0010}\u001a\u00020~2\u0006\u0010E\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u007fJ!\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00012\u0006\u0010.\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0083\u0001J/\u0010\u0084\u0001\u001a\u0004\u0018\u00010o2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010x\u001a\u00020y2\u0006\u0010.\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0005\u0008\u0085\u0001\u0010{J*\u0010\u0086\u0001\u001a\u0004\u0018\u00010)2\u0008\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0006\u0010E\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u0089\u0001\u0010\u008a\u0001J+\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u00012\u0008\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0006\u0010E\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u008f\u0001\u0010\u0090\u0001JE\u0010\u0091\u0001\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0005\u0008\u0092\u0001\u0010@J,\u0010\u0093\u0001\u001a\u00030\u0094\u00012\u0006\u0010p\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ;\u0010\u0096\u0001\u001a\u0004\u0018\u00010>2\u0006\u0010+\u001a\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0097\u0001J\n\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0002JM\u0010\u009a\u0001\u001a\u0005\u0018\u0001H\u009b\u0001\"\n\u0008\u0000\u0010\u009b\u0001*\u00030\u009c\u00012\u0008\u0010\u009d\u0001\u001a\u00030\u009e\u00012\u000f\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009b\u00010\u00a0\u00012\u000e\u0010\u00a1\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00a2\u0001J\u0019\u0010\u00a3\u0001\u001a\u00030\u0094\u00012\u0007\u0010x\u001a\u00030\u00a4\u0001H\u0001\u00a2\u0006\u0003\u0008\u00a5\u0001J\u0014\u0010\u00a3\u0001\u001a\u00030\u0094\u00012\u0008\u0010\u00a6\u0001\u001a\u00030\u00a7\u0001H\u0002J\n\u0010\u00a8\u0001\u001a\u00030\u0094\u0001H\u0002J+\u0010\u00a9\u0001\u001a\u0005\u0018\u00010\u00aa\u00012\u0008\u0010\u00ab\u0001\u001a\u00030\u00ac\u00012\u0006\u0010E\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001J\u0017\u0010\u00af\u0001\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0006H\u0001\u00a2\u0006\u0003\u0008\u00b0\u0001J\u001f\u0010\u00b1\u0001\u001a\u00030\u00b2\u00012\u0006\u0010E\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00b3\u0001\u0010\u0083\u0001J\u0017\u0010\u00b4\u0001\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0001\u00a2\u0006\u0003\u0008\u00b5\u0001JA\u0010\u00b6\u0001\u001a\u0008\u0012\u0004\u0012\u00020>082\u0008\u0010\u00b7\u0001\u001a\u00030\u00b8\u00012\u0006\u0010+\u001a\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b9\u0001J\u0017\u0010\u00ba\u0001\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0001\u00a2\u0006\u0003\u0008\u00bb\u0001J\u001a\u0010\u00bc\u0001\u001a\u00030\u0094\u00012\u000e\u0010\u00bd\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u00be\u0001H\u0002J4\u0010\u00bf\u0001\u001a\u0004\u0018\u00010r2\u0006\u0010p\u001a\u00020\u00062\r\u0010\u00c0\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00c1\u0001J.\u0010\u00c2\u0001\u001a\u0004\u0018\u00010Z2\u0006\u0010p\u001a\u00020\u00062\u0008\u0010a\u001a\u0004\u0018\u00010\u00062\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ7\u0010\u00c3\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u00be\u00012\u0008\u0010\u009d\u0001\u001a\u00030\u009e\u00012\u000e\u0010\u00a1\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010\u0005H\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00c4\u0001\u0010\u00c5\u0001JA\u0010\u00c6\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u00be\u00012\u0008\u0010\u00c7\u0001\u001a\u00030\u00c8\u00012\u0018\u0010\u00a1\u0001\u001a\u0013\u0012\u0007\u0012\u0005\u0018\u00010\u00ca\u0001\u0012\u0005\u0012\u00030\u0094\u00010\u00c9\u0001H\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001JA\u0010\u00cd\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020g0f2\u0012\u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020g0f2\u0008\u0010}\u001a\u0004\u0018\u00010~2\u000c\u0008\u0002\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001H\u0002J\'\u0010\u00ce\u0001\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0005\u0008\u00cf\u0001\u0010MJ\u0014\u0010\u00d0\u0001\u001a\u00030\u0094\u00012\u0008\u0010\u00d1\u0001\u001a\u00030\u0099\u0001H\u0002J&\u0010\u00d2\u0001\u001a\u0005\u0018\u00010\u00aa\u00012\u0007\u0010\u00d3\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ4\u0010\u00d4\u0001\u001a\u0005\u0018\u00010\u00d5\u00012\u0006\u0010*\u001a\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00c1\u0001J\'\u0010\u00d6\u0001\u001a\u0005\u0018\u00010\u00d7\u00012\u0007\u0010x\u001a\u00030\u00d8\u00012\u0006\u0010E\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00d9\u0001J3\u0010\u00d6\u0001\u001a\u0005\u0018\u00010\u00d7\u00012\u0007\u0010x\u001a\u00030\u00d8\u00012\u0006\u0010E\u001a\u00020/2\n\u0010\u00da\u0001\u001a\u0005\u0018\u00010\u00a7\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00db\u0001J;\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u00062\u0007\u0010\u00dd\u0001\u001a\u00020\u00062\u0007\u0010\u00de\u0001\u001a\u00020\u00062\u0007\u0010\u00df\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00e0\u0001\u0010\u00e1\u0001J-\u0010\u00e2\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u00be\u00012\u0007\u0010\u00e3\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0005\u0008\u00e4\u0001\u0010MJ3\u0010\u00e5\u0001\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000608H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00e6\u0001JY\u0010\u00e7\u0001\u001a\u0005\u0018\u00010\u00e8\u00012\r\u0010\u00e9\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u0006082\u0008\u0010\u00ea\u0001\u001a\u00030\u00eb\u00012\u0007\u0010\u00ec\u0001\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00062\u0007\u0010\u00ed\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00ee\u0001J3\u0010\u00ef\u0001\u001a\u0004\u0018\u00010;2\u0006\u00104\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000608H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00e6\u0001J/\u0010\u00f0\u0001\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0005\u0008\u00f1\u0001\u0010GJ5\u0010\u00f2\u0001\u001a\u00030\u00f3\u00012\u0006\u00104\u001a\u00020\u00062\u0006\u0010E\u001a\u00020/2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000608H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00f4\u0001\u0010\u00e6\u0001JI\u0010\u00f5\u0001\u001a\u0005\u0018\u00010\u00d5\u00012\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0008\u0010\u00f6\u0001\u001a\u00030\u00f7\u00012\u0006\u0010.\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00f8\u0001\u0010\u00f9\u0001JN\u0010\u00fa\u0001\u001a\u0005\u0018\u00010\u00d5\u00012\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0005\u0008\u00fb\u0001\u00101J*\u0010\u00fc\u0001\u001a\u0004\u0018\u00010K2\u0008\u0010\u00fd\u0001\u001a\u00030\u00fe\u00012\u0006\u0010.\u001a\u00020/H\u0091@\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00ff\u0001\u0010\u0080\u0002JC\u0010\u0081\u0002\u001a\u00030\u0094\u00012\u0007\u0010\u00dd\u0001\u001a\u00020\u00062\u0007\u0010\u0082\u0002\u001a\u00020\u00062\u0007\u0010\u00de\u0001\u001a\u00020\u00062\u0007\u0010\u00df\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u0083\u0002\u0010\u0084\u0002J/\u0010\u0085\u0002\u001a\u0004\u0018\u00010r2\u0006\u0010p\u001a\u00020\u00062\u0008\u0010\u0086\u0002\u001a\u00030\u0087\u00022\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0088\u0002J9\u0010\u0089\u0002\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u00062\u0008\u0010\u008a\u0002\u001a\u00030\u00eb\u00012\u0008\u0010\u008b\u0002\u001a\u00030\u00eb\u00012\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008c\u0002J-\u0010\u0089\u0002\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u00062\u0007\u0010\u008d\u0002\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ9\u0010\u008e\u0002\u001a\u0004\u0018\u00010;2\u0006\u00104\u001a\u00020\u00062\u0008\u0010\u008a\u0002\u001a\u00030\u00eb\u00012\u0008\u0010\u008b\u0002\u001a\u00030\u00eb\u00012\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008c\u0002J-\u0010\u008e\u0002\u001a\u0004\u0018\u00010;2\u0006\u00104\u001a\u00020\u00062\u0007\u0010\u008d\u0002\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ\u001f\u0010\u008f\u0002\u001a\u00020P*\u00020P2\u0006\u0010E\u001a\u00020/H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0090\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010$\u001a\u0004\u0018\u00010%8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0093\u0002"
    }
    d2 = {
        "Lcom/stripe/android/networking/StripeApiRepository;",
        "Lcom/stripe/android/networking/StripeRepository;",
        "appContext",
        "Landroid/content/Context;",
        "publishableKeyProvider",
        "Lkotlin/Function0;",
        "",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "productUsageTokens",
        "",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/Logger;)V",
        "context",
        "appInfo",
        "Lcom/stripe/android/core/AppInfo;",
        "stripeNetworkClient",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "fraudDetectionDataRepository",
        "Lcom/stripe/android/FraudDetectionDataRepository;",
        "cardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
        "fraudDetectionDataParamsUtils",
        "Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;",
        "betas",
        "Lcom/stripe/android/StripeApiBeta;",
        "apiVersion",
        "sdkVersion",
        "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "fraudDetectionData",
        "Lcom/stripe/android/networking/FraudDetectionData;",
        "getFraudDetectionData",
        "()Lcom/stripe/android/networking/FraudDetectionData;",
        "addCustomerSource",
        "Lcom/stripe/android/model/Source;",
        "customerId",
        "publishableKey",
        "sourceId",
        "sourceType",
        "requestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "addCustomerSource$payments_core_release",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attachFinancialConnectionsSessionToPaymentIntent",
        "Lcom/stripe/android/model/PaymentIntent;",
        "clientSecret",
        "paymentIntentId",
        "financialConnectionsSessionId",
        "expandFields",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attachFinancialConnectionsSessionToSetupIntent",
        "Lcom/stripe/android/model/SetupIntent;",
        "setupIntentId",
        "attachPaymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentMethodId",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "buildPaymentUserAgentPair",
        "Lkotlin/Pair;",
        "attribution",
        "cancelPaymentIntentSource",
        "options",
        "cancelPaymentIntentSource$payments_core_release",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cancelSetupIntentSource",
        "cancelSetupIntentSource$payments_core_release",
        "complete3ds2Auth",
        "Lcom/stripe/android/model/Stripe3ds2AuthResult;",
        "complete3ds2Auth$payments_core_release",
        "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "confirmPaymentIntent",
        "confirmPaymentIntentParams",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
        "confirmPaymentIntent$payments_core_release",
        "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "confirmPaymentIntentInternal",
        "confirmSetupIntent",
        "confirmSetupIntentParams",
        "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
        "confirmSetupIntent$payments_core_release",
        "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "consumerSignUp",
        "Lcom/stripe/android/model/ConsumerSession;",
        "email",
        "phoneNumber",
        "country",
        "name",
        "locale",
        "Ljava/util/Locale;",
        "authSessionCookie",
        "consentAction",
        "Lcom/stripe/android/model/ConsumerSignUpConsentAction;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createClientSecretParam",
        "",
        "",
        "createFile",
        "Lcom/stripe/android/core/model/StripeFile;",
        "fileParams",
        "Lcom/stripe/android/core/model/StripeFileParams;",
        "createFile$payments_core_release",
        "(Lcom/stripe/android/core/model/StripeFileParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createLinkFinancialConnectionsSession",
        "Lcom/stripe/android/model/FinancialConnectionsSession;",
        "consumerSessionClientSecret",
        "createPaymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails;",
        "paymentDetailsCreateParams",
        "Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;",
        "(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "financialConnectionsAccountId",
        "createPaymentIntentFinancialConnectionsSession",
        "params",
        "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;",
        "createPaymentIntentFinancialConnectionsSession$payments_core_release",
        "(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createPaymentMethod",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createRadarSession",
        "Lcom/stripe/android/model/RadarSession;",
        "createRadarSession$payments_core_release",
        "(Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createSetupIntentFinancialConnectionsSession",
        "createSetupIntentFinancialConnectionsSession$payments_core_release",
        "createSource",
        "sourceParams",
        "Lcom/stripe/android/model/SourceParams;",
        "createSource$payments_core_release",
        "(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createToken",
        "Lcom/stripe/android/model/Token;",
        "tokenParams",
        "Lcom/stripe/android/model/TokenParams;",
        "createToken$payments_core_release",
        "(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "deleteCustomerSource",
        "deleteCustomerSource$payments_core_release",
        "deletePaymentDetails",
        "",
        "paymentDetailsId",
        "detachPaymentMethod",
        "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "disableDnsCache",
        "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;",
        "fetchStripeModel",
        "ModelType",
        "Lcom/stripe/android/core/model/StripeModel;",
        "apiRequest",
        "Lcom/stripe/android/core/networking/ApiRequest;",
        "jsonParser",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "onResponse",
        "(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fireAnalyticsRequest",
        "Lcom/stripe/android/core/networking/AnalyticsRequest;",
        "fireAnalyticsRequest$payments_core_release",
        "event",
        "Lcom/stripe/android/networking/PaymentAnalyticsEvent;",
        "fireFraudDetectionDataRequest",
        "getCardMetadata",
        "Lcom/stripe/android/model/CardMetadata;",
        "bin",
        "Lcom/stripe/android/cards/Bin;",
        "getCardMetadata$payments_core_release",
        "(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getDetachPaymentMethodUrl",
        "getDetachPaymentMethodUrl$payments_core_release",
        "getFpxBankStatus",
        "Lcom/stripe/android/model/BankStatuses;",
        "getFpxBankStatus$payments_core_release",
        "getPaymentIntentFinancialConnectionsSessionUrl",
        "getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release",
        "getPaymentMethods",
        "listPaymentMethodsParams",
        "Lcom/stripe/android/model/ListPaymentMethodsParams;",
        "(Lcom/stripe/android/model/ListPaymentMethodsParams;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getSetupIntentFinancialConnectionsSessionUrl",
        "getSetupIntentFinancialConnectionsSessionUrl$payments_core_release",
        "handleApiError",
        "response",
        "Lcom/stripe/android/core/networking/StripeResponse;",
        "listPaymentDetails",
        "paymentMethodTypes",
        "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "logoutConsumer",
        "makeApiRequest",
        "makeApiRequest$payments_core_release",
        "(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "makeFileUploadRequest",
        "fileUploadRequest",
        "Lcom/stripe/android/core/networking/FileUploadRequest;",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/core/networking/RequestId;",
        "makeFileUploadRequest$payments_core_release",
        "(Lcom/stripe/android/core/networking/FileUploadRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "maybeAddPaymentUserAgent",
        "refreshPaymentIntent",
        "refreshPaymentIntent$payments_core_release",
        "resetDnsCache",
        "dnsCacheData",
        "retrieveCardMetadata",
        "cardNumber",
        "retrieveCustomer",
        "Lcom/stripe/android/model/Customer;",
        "retrieveElementsSession",
        "Lcom/stripe/android/model/ElementsSession;",
        "Lcom/stripe/android/model/ElementsSessionParams;",
        "(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "analyticsEvent",
        "(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveIssuingCardPin",
        "cardId",
        "verificationId",
        "userOneTimeCode",
        "retrieveIssuingCardPin$payments_core_release",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveObject",
        "url",
        "retrieveObject$payments_core_release",
        "retrievePaymentIntent",
        "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrievePaymentMethodMessage",
        "Lcom/stripe/android/model/PaymentMethodMessage;",
        "paymentMethods",
        "amount",
        "",
        "currency",
        "logoColor",
        "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveSetupIntent",
        "retrieveSource",
        "retrieveSource$payments_core_release",
        "retrieveStripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "retrieveStripeIntent$payments_core_release",
        "setCustomerShippingInfo",
        "shippingInformation",
        "Lcom/stripe/android/model/ShippingInformation;",
        "setCustomerShippingInfo$payments_core_release",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "setDefaultCustomerSource",
        "setDefaultCustomerSource$payments_core_release",
        "start3ds2Auth",
        "authParams",
        "Lcom/stripe/android/model/Stripe3ds2AuthParams;",
        "start3ds2Auth$payments_core_release",
        "(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateIssuingCardPin",
        "newPin",
        "updateIssuingCardPin$payments_core_release",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updatePaymentDetails",
        "paymentDetailsUpdateParams",
        "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;",
        "(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "verifyPaymentIntentWithMicrodeposits",
        "firstAmount",
        "secondAmount",
        "(Ljava/lang/String;IILcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "descriptorCode",
        "verifySetupIntentWithMicrodeposits",
        "maybeForDashboard",
        "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
        "DnsCacheData",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStripeApiRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeApiRepository.kt\ncom/stripe/android/networking/StripeApiRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2166:1\n1549#2:2167\n1620#2,3:2168\n1559#2:2172\n1590#2,4:2173\n1#3:2171\n*S KotlinDebug\n*F\n+ 1 StripeApiRepository.kt\ncom/stripe/android/networking/StripeApiRepository\n*L\n134#1:2167\n134#1:2168,3\n1567#1:2172\n1567#1:2173,4\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

.field private static final DNS_CACHE_TTL_PROPERTY_NAME:Ljava/lang/String; = "networkaddress.cache.ttl"

.field private static final PAYMENT_USER_AGENT:Ljava/lang/String; = "payment_user_agent"


# instance fields
.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private final apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

.field private final appInfo:Lcom/stripe/android/core/AppInfo;

.field private final cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

.field private final context:Landroid/content/Context;

.field private final fraudDetectionDataParamsUtils:Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;

.field private final fraudDetectionDataRepository:Lcom/stripe/android/FraudDetectionDataRepository;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private final productUsageTokens:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final publishableKeyProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/networking/StripeApiRepository;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "context"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "publishableKeyProvider"

    move-object/from16 v4, p2

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7ffc

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "context"

    move-object/from16 v5, p1

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "publishableKeyProvider"

    move-object/from16 v5, p2

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7ff8

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "context"

    move-object/from16 v6, p1

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "publishableKeyProvider"

    move-object/from16 v6, p2

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "logger"

    move-object/from16 v6, p4

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7ff0

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    const-string v6, "context"

    move-object/from16 v7, p1

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "publishableKeyProvider"

    move-object/from16 v7, p2

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "logger"

    move-object/from16 v7, p4

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "workContext"

    move-object/from16 v7, p5

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7fe0

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    const-string v7, "context"

    move-object/from16 v8, p1

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "publishableKeyProvider"

    move-object/from16 v8, p2

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "logger"

    move-object/from16 v8, p4

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "workContext"

    move-object/from16 v8, p5

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "productUsageTokens"

    move-object/from16 v8, p6

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7fc0

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    const-string v8, "context"

    move-object/from16 v9, p1

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "publishableKeyProvider"

    move-object/from16 v9, p2

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "logger"

    move-object/from16 v9, p4

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "workContext"

    move-object/from16 v9, p5

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "productUsageTokens"

    move-object/from16 v9, p6

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "stripeNetworkClient"

    move-object/from16 v9, p7

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7f80

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    const-string v9, "context"

    move-object/from16 v10, p1

    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "publishableKeyProvider"

    move-object/from16 v10, p2

    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "logger"

    move-object/from16 v10, p4

    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "workContext"

    move-object/from16 v10, p5

    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "productUsageTokens"

    move-object/from16 v10, p6

    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "stripeNetworkClient"

    move-object/from16 v10, p7

    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "analyticsRequestExecutor"

    move-object/from16 v10, p8

    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7f00

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/FraudDetectionDataRepository;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    const-string v10, "context"

    move-object/from16 v11, p1

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "publishableKeyProvider"

    move-object/from16 v11, p2

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "logger"

    move-object/from16 v11, p4

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "workContext"

    move-object/from16 v11, p5

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "productUsageTokens"

    move-object/from16 v11, p6

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "stripeNetworkClient"

    move-object/from16 v11, p7

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "analyticsRequestExecutor"

    move-object/from16 v11, p8

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "fraudDetectionDataRepository"

    move-object/from16 v11, p9

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7e00

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/FraudDetectionDataRepository;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    const-string v11, "context"

    move-object/from16 v12, p1

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "publishableKeyProvider"

    move-object/from16 v12, p2

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "logger"

    move-object/from16 v12, p4

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "workContext"

    move-object/from16 v12, p5

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "productUsageTokens"

    move-object/from16 v12, p6

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "stripeNetworkClient"

    move-object/from16 v12, p7

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "analyticsRequestExecutor"

    move-object/from16 v12, p8

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "fraudDetectionDataRepository"

    move-object/from16 v12, p9

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "cardAccountRangeRepositoryFactory"

    move-object/from16 v12, p10

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7c00

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/FraudDetectionDataRepository;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    const-string v12, "context"

    move-object/from16 v13, p1

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "publishableKeyProvider"

    move-object/from16 v13, p2

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "logger"

    move-object/from16 v13, p4

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "workContext"

    move-object/from16 v13, p5

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "productUsageTokens"

    move-object/from16 v13, p6

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "stripeNetworkClient"

    move-object/from16 v13, p7

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "analyticsRequestExecutor"

    move-object/from16 v13, p8

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "fraudDetectionDataRepository"

    move-object/from16 v13, p9

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "cardAccountRangeRepositoryFactory"

    move-object/from16 v13, p10

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "paymentAnalyticsRequestFactory"

    move-object/from16 v13, p11

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7800

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/FraudDetectionDataRepository;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    const-string v13, "context"

    move-object/from16 v14, p1

    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "publishableKeyProvider"

    move-object/from16 v14, p2

    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "logger"

    move-object/from16 v14, p4

    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "workContext"

    move-object/from16 v14, p5

    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "productUsageTokens"

    move-object/from16 v14, p6

    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "stripeNetworkClient"

    move-object/from16 v14, p7

    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "analyticsRequestExecutor"

    move-object/from16 v14, p8

    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "fraudDetectionDataRepository"

    move-object/from16 v14, p9

    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "cardAccountRangeRepositoryFactory"

    move-object/from16 v14, p10

    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "paymentAnalyticsRequestFactory"

    move-object/from16 v14, p11

    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "fraudDetectionDataParamsUtils"

    move-object/from16 v14, p12

    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7000

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/FraudDetectionDataRepository;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/StripeApiBeta;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    const-string v14, "context"

    move-object/from16 v15, p1

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "publishableKeyProvider"

    move-object/from16 v15, p2

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "logger"

    move-object/from16 v15, p4

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "workContext"

    move-object/from16 v15, p5

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "productUsageTokens"

    move-object/from16 v15, p6

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "stripeNetworkClient"

    move-object/from16 v15, p7

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "analyticsRequestExecutor"

    move-object/from16 v15, p8

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "fraudDetectionDataRepository"

    move-object/from16 v15, p9

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "cardAccountRangeRepositoryFactory"

    move-object/from16 v15, p10

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "paymentAnalyticsRequestFactory"

    move-object/from16 v15, p11

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "fraudDetectionDataParamsUtils"

    move-object/from16 v15, p12

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "betas"

    move-object/from16 v15, p13

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x6000

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/FraudDetectionDataRepository;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/StripeApiBeta;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    const-string v15, "context"

    move-object/from16 v18, v0

    move-object/from16 v0, p1

    invoke-static {v0, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v15, p2

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v15, p4

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v15, p5

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    move-object/from16 v15, p6

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeNetworkClient"

    move-object/from16 v15, p7

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    move-object/from16 v15, p8

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataRepository"

    move-object/from16 v15, p9

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccountRangeRepositoryFactory"

    move-object/from16 v15, p10

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    move-object/from16 v15, p11

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataParamsUtils"

    move-object/from16 v15, p12

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "betas"

    move-object/from16 v15, p13

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiVersion"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v15, 0x0

    const/16 v16, 0x4000

    const/16 v17, 0x0

    move-object/from16 v0, v18

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/FraudDetectionDataRepository;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/StripeApiBeta;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    const-string v15, "context"

    invoke-static {v1, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "publishableKeyProvider"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "logger"

    invoke-static {v4, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "workContext"

    invoke-static {v5, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "productUsageTokens"

    invoke-static {v6, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "stripeNetworkClient"

    invoke-static {v7, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "analyticsRequestExecutor"

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "fraudDetectionDataRepository"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "cardAccountRangeRepositoryFactory"

    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "paymentAnalyticsRequestFactory"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "fraudDetectionDataParamsUtils"

    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "betas"

    move-object/from16 v12, p13

    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "apiVersion"

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "sdkVersion"

    invoke-static {v14, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/networking/StripeRepository;-><init>()V

    iput-object v1, v0, Lcom/stripe/android/networking/StripeApiRepository;->context:Landroid/content/Context;

    iput-object v2, v0, Lcom/stripe/android/networking/StripeApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iput-object v3, v0, Lcom/stripe/android/networking/StripeApiRepository;->appInfo:Lcom/stripe/android/core/AppInfo;

    iput-object v4, v0, Lcom/stripe/android/networking/StripeApiRepository;->logger:Lcom/stripe/android/core/Logger;

    iput-object v5, v0, Lcom/stripe/android/networking/StripeApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    iput-object v6, v0, Lcom/stripe/android/networking/StripeApiRepository;->productUsageTokens:Ljava/util/Set;

    iput-object v7, v0, Lcom/stripe/android/networking/StripeApiRepository;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    iput-object v8, v0, Lcom/stripe/android/networking/StripeApiRepository;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iput-object v9, v0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataRepository:Lcom/stripe/android/FraudDetectionDataRepository;

    iput-object v10, v0, Lcom/stripe/android/networking/StripeApiRepository;->cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    iput-object v11, v0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-object/from16 v1, p12

    iput-object v1, v0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataParamsUtils:Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;

    new-instance v1, Lcom/stripe/android/core/networking/ApiRequest$Factory;

    invoke-direct {v1, v3, v13, v14}, Lcom/stripe/android/core/networking/ApiRequest$Factory;-><init>(Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    invoke-static/range {p5 .. p5}, LaD0;->a(Lkotlin/coroutines/CoroutineContext;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/networking/StripeApiRepository$2;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Lcom/stripe/android/networking/StripeApiRepository$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object/from16 p1, v1

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    invoke-static/range {p1 .. p6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move-object/from16 v1, p1

    move/from16 v0, p16

    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_0

    sget-object v2, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/Stripe$Companion;->getAppInfo()Lcom/stripe/android/core/AppInfo;

    move-result-object v2

    move-object v3, v2

    goto :goto_0

    :cond_0
    move-object/from16 v3, p3

    :goto_0
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_1

    sget-object v2, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/core/Logger$Companion;->noop()Lcom/stripe/android/core/Logger;

    move-result-object v2

    move-object v12, v2

    goto :goto_1

    :cond_1
    move-object/from16 v12, p4

    :goto_1
    and-int/lit8 v2, v0, 0x10

    if-eqz v2, :cond_2

    invoke-static {}, LT41;->b()LSC0;

    move-result-object v2

    move-object v13, v2

    goto :goto_2

    :cond_2
    move-object/from16 v13, p5

    :goto_2
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_3

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v2

    move-object v14, v2

    goto :goto_3

    :cond_3
    move-object/from16 v14, p6

    :goto_3
    and-int/lit8 v2, v0, 0x40

    if-eqz v2, :cond_4

    new-instance v2, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v10, 0xe

    const/4 v11, 0x0

    move-object v4, v2

    move-object v5, v13

    move-object v9, v12

    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v2

    goto :goto_4

    :cond_4
    move-object/from16 v7, p7

    :goto_4
    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_5

    new-instance v2, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    invoke-direct {v2, v12, v13}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;-><init>(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V

    move-object v8, v2

    goto :goto_5

    :cond_5
    move-object/from16 v8, p8

    :goto_5
    and-int/lit16 v2, v0, 0x100

    if-eqz v2, :cond_6

    new-instance v2, Lcom/stripe/android/DefaultFraudDetectionDataRepository;

    invoke-direct {v2, v1, v13}, Lcom/stripe/android/DefaultFraudDetectionDataRepository;-><init>(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V

    move-object v9, v2

    goto :goto_6

    :cond_6
    move-object/from16 v9, p9

    :goto_6
    and-int/lit16 v2, v0, 0x200

    if-eqz v2, :cond_7

    new-instance v2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;

    invoke-direct {v2, v1, v8}, Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;-><init>(Landroid/content/Context;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)V

    move-object v10, v2

    goto :goto_7

    :cond_7
    move-object/from16 v10, p10

    :goto_7
    and-int/lit16 v2, v0, 0x400

    if-eqz v2, :cond_8

    new-instance v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-object/from16 v4, p2

    invoke-direct {v2, v1, v4, v14}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V

    move-object v11, v2

    goto :goto_8

    :cond_8
    move-object/from16 v4, p2

    move-object/from16 v11, p11

    :goto_8
    and-int/lit16 v2, v0, 0x800

    if-eqz v2, :cond_9

    new-instance v2, Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;

    invoke-direct {v2}, Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;-><init>()V

    move-object v15, v2

    goto :goto_9

    :cond_9
    move-object/from16 v15, p12

    :goto_9
    and-int/lit16 v2, v0, 0x1000

    if-eqz v2, :cond_a

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v2

    move-object v6, v2

    goto :goto_a

    :cond_a
    move-object/from16 v6, p13

    :goto_a
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_c

    new-instance v2, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v6, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/stripe/android/StripeApiBeta;

    invoke-virtual/range {v16 .. v16}, Lcom/stripe/android/StripeApiBeta;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p1

    goto :goto_b

    :cond_b
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/core/ApiVersion;

    invoke-direct {v2, v1}, Lcom/stripe/android/core/ApiVersion;-><init>(Ljava/util/Set;)V

    invoke-virtual {v2}, Lcom/stripe/android/core/ApiVersion;->getCode()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v16, v1

    goto :goto_c

    :cond_c
    move-object/from16 v16, p14

    :goto_c
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_d

    const-string v0, "AndroidBindings/20.21.0"

    move-object/from16 v17, v0

    goto :goto_d

    :cond_d
    move-object/from16 v17, p15

    :goto_d
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object v4, v12

    move-object v5, v13

    move-object v13, v6

    move-object v6, v14

    move-object v12, v15

    move-object/from16 v14, v16

    move-object/from16 v15, v17

    invoke-direct/range {v0 .. v15}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/Logger;)V
    .locals 18
    .param p3    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/core/Logger;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v11, p5

    move-object/from16 v8, p6

    move-object/from16 v4, p7

    const-string v3, "appContext"

    move-object/from16 v7, p1

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "publishableKeyProvider"

    move-object/from16 v7, p2

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "workContext"

    move-object/from16 v7, p3

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "productUsageTokens"

    move-object/from16 v7, p4

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "paymentAnalyticsRequestFactory"

    move-object/from16 v7, p5

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "analyticsRequestExecutor"

    move-object/from16 v7, p6

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "logger"

    move-object/from16 v7, p7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7b44

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static final synthetic access$confirmPaymentIntentInternal(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->confirmPaymentIntentInternal(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchStripeModel(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fireAnalyticsRequest(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V

    return-void
.end method

.method public static final synthetic access$getContext$p(Lcom/stripe/android/networking/StripeApiRepository;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/networking/StripeApiRepository;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/networking/StripeApiRepository;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    return-object p0
.end method

.method public static final synthetic access$maybeForDashboard(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/networking/StripeApiRepository;->maybeForDashboard(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveElementsSession(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->retrieveElementsSession(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "stripe-android/20.21.0"

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/networking/StripeApiRepository;->productUsageTokens:Ljava/util/Set;

    invoke-static {v0, v1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    const-string v2, ";"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "payment_user_agent"

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic buildPaymentUserAgentPair$default(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;ILjava/lang/Object;)Lkotlin/Pair;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private final confirmPaymentIntentInternal(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataParamsUtils:Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->toParamMap()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsUserKey()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "client_secret"

    invoke-static {v1, v2}, Lkotlin/collections/MapsKt;->minus(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getSourceParams()Lcom/stripe/android/model/SourceParams;

    move-result-object v3

    invoke-direct {p0, v1, v2, v3}, Lcom/stripe/android/networking/StripeApiRepository;->maybeAddPaymentUserAgent(Ljava/util/Map;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/SourceParams;)Ljava/util/Map;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-static {v2, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object p3

    invoke-static {v1, p3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p3

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->getFraudDetectionData()Lcom/stripe/android/networking/FraudDetectionData;

    move-result-object v1

    invoke-virtual {v0, p3, v1}, Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;->addFraudDetectionData$payments_core_release(Ljava/util/Map;Lcom/stripe/android/networking/FraudDetectionData;)Ljava/util/Map;

    move-result-object v6

    new-instance p3, Lcom/stripe/android/model/PaymentIntent$ClientSecret;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getClientSecret()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->getPaymentIntentId$payments_core_release()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getConfirmPaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    iget-object v3, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    const/4 v7, 0x0

    const/16 v8, 0x8

    const/4 v9, 0x0

    move-object v5, p2

    invoke-static/range {v3 .. v9}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p2

    new-instance p3, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p3, v1, v0, v1}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>(Lcom/stripe/android/model/LuxePostConfirmActionRepository;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntentInternal$2;

    invoke-direct {v0, p1, p0}, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntentInternal$2;-><init>(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/StripeApiRepository;)V

    invoke-direct {p0, p2, p3, v0, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final createClientSecretParam(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "client_secret"

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-static {v0, p2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final disableDnsCache()Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;
    .locals 3

    const-string v0, "networkaddress.cache.ttl"

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Ljava/security/Security;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-static {v0, v2}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;

    invoke-direct {v0, v1}, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_0
    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;

    return-object v0
.end method

.method private final fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ModelType::",
            "Lcom/stripe/android/core/model/StripeModel;",
            ">(",
            "Lcom/stripe/android/core/networking/ApiRequest;",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "+TModelType;>;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TModelType;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModel$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModel$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModel$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModel$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModel$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModel$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModel$1;->L$0:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iput-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModel$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModel$1;->label:I

    invoke-virtual {p0, p1, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->makeApiRequest$payments_core_release(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Lcom/stripe/android/core/networking/StripeResponse;

    invoke-static {p4}, Lcom/stripe/android/core/networking/ResponseJsonKt;->responseJson(Lcom/stripe/android/core/networking/StripeResponse;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;

    move-result-object p1

    return-object p1
.end method

.method private final fireAnalyticsRequest(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    return-void
.end method

.method private final fireFraudDetectionDataRequest()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataRepository:Lcom/stripe/android/FraudDetectionDataRepository;

    invoke-interface {v0}, Lcom/stripe/android/FraudDetectionDataRepository;->refresh()V

    return-void
.end method

.method private final getFraudDetectionData()Lcom/stripe/android/networking/FraudDetectionData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataRepository:Lcom/stripe/android/FraudDetectionDataRepository;

    invoke-interface {v0}, Lcom/stripe/android/FraudDetectionDataRepository;->getCached()Lcom/stripe/android/networking/FraudDetectionData;

    move-result-object v0

    return-object v0
.end method

.method private final handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeResponse;->getRequestId()Lcom/stripe/android/core/networking/RequestId;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/RequestId;->getValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v3, v0

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeResponse;->getCode()I

    move-result v4

    new-instance v0, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;-><init>()V

    invoke-static {p1}, Lcom/stripe/android/core/networking/ResponseJsonKt;->responseJson(Lcom/stripe/android/core/networking/StripeResponse;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/StripeError;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->context:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/stripe/android/networking/StripeErrorMappingKt;->withLocalizedMessage(Lcom/stripe/android/core/StripeError;Landroid/content/Context;)Lcom/stripe/android/core/StripeError;

    move-result-object v2

    const/16 p1, 0x1ad

    if-eq v4, p1, :cond_1

    packed-switch v4, :pswitch_data_0

    new-instance p1, Lcom/stripe/android/core/exception/APIException;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :pswitch_0
    new-instance p1, Lcom/stripe/android/core/exception/PermissionException;

    invoke-direct {p1, v2, v3}, Lcom/stripe/android/core/exception/PermissionException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;)V

    throw p1

    :pswitch_1
    new-instance p1, Lcom/stripe/android/exception/CardException;

    invoke-direct {p1, v2, v3}, Lcom/stripe/android/exception/CardException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;)V

    throw p1

    :pswitch_2
    new-instance p1, Lcom/stripe/android/core/exception/AuthenticationException;

    invoke-direct {p1, v2, v3}, Lcom/stripe/android/core/exception/AuthenticationException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;)V

    throw p1

    :pswitch_3
    new-instance p1, Lcom/stripe/android/core/exception/InvalidRequestException;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/stripe/android/core/exception/RateLimitException;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/exception/RateLimitException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x190
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method private final maybeAddPaymentUserAgent(Ljava/util/Map;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/SourceParams;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lcom/stripe/android/model/SourceParams;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "payment_method_data"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/util/Map;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Ljava/util/Map;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_4

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getAttribution$payments_core_release()Ljava/util/Set;

    move-result-object p2

    if-nez p2, :cond_2

    :cond_1
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p2

    :cond_2
    invoke-direct {p0, p2}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {v1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    invoke-static {v0, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, p2

    goto :goto_2

    :cond_4
    :goto_1
    const-string p2, "source_data"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_5

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    :cond_5
    if-eqz v3, :cond_8

    if-eqz p3, :cond_6

    invoke-virtual {p3}, Lcom/stripe/android/model/SourceParams;->getAttribution$payments_core_release()Ljava/util/Set;

    move-result-object p3

    if-nez p3, :cond_7

    :cond_6
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p3

    :cond_7
    invoke-direct {p0, p3}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;

    move-result-object p3

    invoke-static {v3, p3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    :cond_8
    :goto_2
    return-object p1
.end method

.method public static synthetic maybeAddPaymentUserAgent$default(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/SourceParams;ILjava/lang/Object;)Ljava/util/Map;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/networking/StripeApiRepository;->maybeAddPaymentUserAgent(Ljava/util/Map;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/SourceParams;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private final maybeForDashboard(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsUserKey()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p3

    if-nez p3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p3

    iput-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->label:I

    invoke-virtual {p0, p3, p2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->createPaymentMethod(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p3, Lcom/stripe/android/model/PaymentMethod;

    if-eqz p3, :cond_5

    iget-object p2, p3, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    goto :goto_2

    :cond_5
    const/4 p2, 0x0

    :goto_2
    if-eqz p2, :cond_6

    sget-object p3, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->Companion:Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getClientSecret()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1, p2}, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;->createForDashboard$payments_core_release(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_3
    return-object p1
.end method

.method private final resetDnsCache(Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;)V
    .locals 1

    instance-of v0, p1, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;

    invoke-virtual {p1}, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;->getOriginalDnsCacheTtl()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "-1"

    :cond_0
    const-string v0, "networkaddress.cache.ttl"

    invoke-static {v0, p1}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private final retrieveElementsSession(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSessionParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lcom/stripe/android/networking/PaymentAnalyticsEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ElementsSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsUserKey()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    new-instance v0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;

    invoke-virtual {p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKey()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v0

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;-><init>(Lcom/stripe/android/model/ElementsSessionParams;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1}, Lcom/stripe/android/model/ElementsSessionParams;->getType()Ljava/lang/String;

    move-result-object v3

    const-string v4, "type"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/stripe/android/model/ElementsSessionParams;->getClientSecret()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    const-string v4, "client_secret"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {p1}, Lcom/stripe/android/model/ElementsSessionParams;->getLocale()Ljava/lang/String;

    move-result-object v3

    const-string v4, "locale"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v3, p1, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    if-eqz v3, :cond_2

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getDeferredIntentParams()Lcom/stripe/android/model/DeferredIntentParams;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/model/DeferredIntentParams;->toQueryParams()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_3
    invoke-static {v2}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v3, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v4, "elements/sessions"

    invoke-static {v3, v4}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1}, Lcom/stripe/android/model/ElementsSessionParams;->getExpandFields()Ljava/util/List;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object v3, v4

    move-object v4, p2

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$3;

    invoke-direct {p2, p3, p0}, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$3;-><init>(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lcom/stripe/android/networking/StripeApiRepository;)V

    invoke-direct {p0, p1, v0, p2, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public addCustomerSource$payments_core_release(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/Source;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object p2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getAddCustomerSourceUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string p1, "source"

    invoke-static {p1, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p6

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/SourceJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SourceJsonParser;-><init>()V

    new-instance p4, Lcom/stripe/android/networking/StripeApiRepository$addCustomerSource$2;

    invoke-direct {p4, p0, p3, p5}, Lcom/stripe/android/networking/StripeApiRepository$addCustomerSource$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p4, p7}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public attachFinancialConnectionsSessionToPaymentIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1, p2, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getAttachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "client_secret"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v1, p5}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object p3

    invoke-static {p1, p3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v1, p2

    move-object v2, p4

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    const/4 p3, 0x0

    const/4 p4, 0x1

    invoke-direct {p2, p3, p4, p3}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>(Lcom/stripe/android/model/LuxePostConfirmActionRepository;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$2;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$2;

    invoke-direct {p0, p1, p2, p3, p6}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public attachFinancialConnectionsSessionToSetupIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1, p2, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getAttachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "client_secret"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v1, p5}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object p3

    invoke-static {p1, p3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v1, p2

    move-object v2, p4

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$2;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$2;

    invoke-direct {p0, p1, p2, p3, p6}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public attachPaymentMethod(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object p2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p2, p4}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getAttachPaymentMethodUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string p2, "customer"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p5

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    new-instance p4, Lcom/stripe/android/networking/StripeApiRepository$attachPaymentMethod$2;

    invoke-direct {p4, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$attachPaymentMethod$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;)V

    invoke-direct {p0, p1, p2, p4, p6}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public cancelPaymentIntentSource$payments_core_release(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getCancelPaymentIntentSourceUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string p1, "source"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    const/4 p3, 0x0

    const/4 v0, 0x1

    invoke-direct {p2, p3, v0, p3}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>(Lcom/stripe/android/model/LuxePostConfirmActionRepository;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$cancelPaymentIntentSource$2;

    invoke-direct {p3, p0}, Lcom/stripe/android/networking/StripeApiRepository$cancelPaymentIntentSource$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public cancelSetupIntentSource$payments_core_release(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getCancelSetupIntentSourceUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string p1, "source"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$cancelSetupIntentSource$2;

    invoke-direct {p3, p0}, Lcom/stripe/android/networking/StripeApiRepository$cancelSetupIntentSource$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public complete3ds2Auth$payments_core_release(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/Stripe3ds2AuthResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v2, "3ds2/challenge_complete"

    invoke-static {v1, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "source"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser;-><init>()V

    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository$complete3ds2Auth$2;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$complete3ds2Auth$2;

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public confirmPaymentIntent$payments_core_release(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/networking/StripeApiRepository;

    iget-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$1:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Ljava/util/List;

    iget-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iput-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$1:Ljava/lang/Object;

    iput-object p0, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->label:I

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->maybeForDashboard(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    :goto_1
    check-cast p4, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->label:I

    invoke-direct {p1, p4, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->confirmPaymentIntentInternal(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    return-object p4
.end method

.method public confirmSetupIntent$payments_core_release(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/model/SetupIntent$ClientSecret;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/model/SetupIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/model/SetupIntent$ClientSecret;->getSetupIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    iget-object v1, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v2, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getConfirmSetupIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataParamsUtils:Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->toParamMap()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->getPaymentMethodCreateParams$payments_core_release()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v9}, Lcom/stripe/android/networking/StripeApiRepository;->maybeAddPaymentUserAgent$default(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/SourceParams;ILjava/lang/Object;)Ljava/util/Map;

    move-result-object v4

    invoke-static {v2, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object p3

    invoke-static {v4, p3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p3

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->getFraudDetectionData()Lcom/stripe/android/networking/FraudDetectionData;

    move-result-object v2

    invoke-virtual {v3, p3, v2}, Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;->addFraudDetectionData$payments_core_release(Ljava/util/Map;Lcom/stripe/android/networking/FraudDetectionData;)Ljava/util/Map;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x8

    move-object v2, v0

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p2

    new-instance p3, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$2;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/ConfirmSetupIntentParams;)V

    invoke-direct {p0, p2, p3, v0, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public consumerSignUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/ConsumerSignUpConsentAction;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getConsumerSignUpUrl$payments_core_release()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "request_surface"

    const-string v4, "android_payment_element"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v3, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "email_address"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v3, 0x1

    aput-object p1, v2, v3

    const-string p1, "phone_number"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v2, p2

    const-string p1, "country"

    invoke-static {p1, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v2, p2

    const-string p1, "consent_action"

    invoke-virtual {p7}, Lcom/stripe/android/model/ConsumerSignUpConsentAction;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v2, p2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    if-eqz p6, :cond_0

    const-string p2, "verification_session_client_secrets"

    invoke-static {p6}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    const-string p3, "cookies"

    invoke-static {p3, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    if-nez p2, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :cond_1
    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    if-eqz p5, :cond_2

    const-string p2, "locale"

    invoke-virtual {p5}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    if-nez p2, :cond_3

    :cond_2
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :cond_3
    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    if-eqz p4, :cond_4

    const-string p2, "legal_name"

    invoke-static {p2, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    if-nez p2, :cond_5

    :cond_4
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :cond_5
    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p4

    const/4 p5, 0x0

    const/16 p6, 0x8

    const/4 p7, 0x0

    move-object p1, v0

    move-object p2, v1

    move-object p3, p8

    invoke-static/range {p1 .. p7}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser;-><init>()V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$consumerSignUp$5;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$consumerSignUp$5;

    invoke-direct {p0, p1, p2, p3, p9}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createFile$payments_core_release(Lcom/stripe/android/core/model/StripeFileParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/model/StripeFileParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/model/StripeFile;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p3, Lcom/stripe/android/core/networking/FileUploadRequest;

    iget-object v7, p0, Lcom/stripe/android/networking/StripeApiRepository;->appInfo:Lcom/stripe/android/core/AppInfo;

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    move-object v4, p3

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/core/networking/FileUploadRequest;-><init>(Lcom/stripe/android/core/model/StripeFileParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, Lcom/stripe/android/networking/StripeApiRepository$createFile$response$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/networking/StripeApiRepository$createFile$response$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;->label:I

    invoke-virtual {p0, p3, p1, v0}, Lcom/stripe/android/networking/StripeApiRepository;->makeFileUploadRequest$payments_core_release(Lcom/stripe/android/core/networking/FileUploadRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lcom/stripe/android/core/networking/StripeResponse;

    new-instance p1, Lcom/stripe/android/core/model/parsers/StripeFileJsonParser;

    invoke-direct {p1}, Lcom/stripe/android/core/model/parsers/StripeFileJsonParser;-><init>()V

    invoke-static {p3}, Lcom/stripe/android/core/networking/ResponseJsonKt;->responseJson(Lcom/stripe/android/core/networking/StripeResponse;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/core/model/parsers/StripeFileJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeFile;

    move-result-object p1

    return-object p1
.end method

.method public createLinkFinancialConnectionsSession(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/FinancialConnectionsSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getLinkFinancialConnectionsSessionUrl$payments_core_release()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "request_surface"

    const-string v4, "android_payment_element"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "consumer_session_client_secret"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string v3, "credentials"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/FinancialConnectionsSessionJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/FinancialConnectionsSessionJsonParser;-><init>()V

    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository$createLinkFinancialConnectionsSession$2;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$createLinkFinancialConnectionsSession$2;

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createPaymentDetails(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getConsumerPaymentDetailsUrl$payments_core_release()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "request_surface"

    const-string v4, "android_payment_element"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "consumer_session_client_secret"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string v3, "credentials"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v3, 0x1

    aput-object p1, v2, v3

    const-string p1, "active"

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v3, 0x2

    aput-object p1, v2, v3

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;->toParamMap()Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;-><init>()V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$createPaymentDetails$4;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$createPaymentDetails$4;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createPaymentDetails(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getConsumerPaymentDetailsUrl$payments_core_release()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "request_surface"

    const-string v4, "android_payment_element"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "consumer_session_client_secret"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string v3, "credentials"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v3, 0x1

    aput-object p1, v2, v3

    const-string p1, "type"

    const-string v4, "bank_account"

    invoke-static {p1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v5, 0x2

    aput-object p1, v2, v5

    const-string p1, "account"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v2, p2

    const-string p1, "is_default"

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v2, p2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;-><init>()V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$createPaymentDetails$2;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$createPaymentDetails$2;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createPaymentIntentFinancialConnectionsSession$payments_core_release(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/FinancialConnectionsSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;->toMap()Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/FinancialConnectionsSessionJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/FinancialConnectionsSessionJsonParser;-><init>()V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$createPaymentIntentFinancialConnectionsSession$2;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$createPaymentIntentFinancialConnectionsSession$2;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createPaymentMethod(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getPaymentMethodsUrl$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->toParamMap()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getAttribution$payments_core_release()Ljava/util/Set;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->getFraudDetectionData()Lcom/stripe/android/networking/FraudDetectionData;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/stripe/android/networking/FraudDetectionData;->getParams()Ljava/util/Map;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    :cond_1
    invoke-static {v2, v3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p2

    new-instance v0, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$createPaymentMethod$2;

    invoke-direct {v1, p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$createPaymentMethod$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/PaymentMethodCreateParams;)V

    invoke-direct {p0, p2, v0, v1, p3}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createRadarSession$payments_core_release(Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/RadarSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v2, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/networking/StripeApiRepository;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {p2}, Lcom/stripe/android/Stripe$Companion;->getAdvancedFraudSignalsEnabled()Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataRepository:Lcom/stripe/android/FraudDetectionDataRepository;

    iput-object p0, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->label:I

    invoke-interface {p2, v0}, Lcom/stripe/android/FraudDetectionDataRepository;->getLatest(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    if-eqz p2, :cond_5

    :try_start_2
    check-cast p2, Lcom/stripe/android/networking/FraudDetectionData;

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_3

    :cond_5
    const-string p2, "Could not obtain fraud data required to create a Radar Session."

    new-instance v5, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v5, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_6
    :try_start_3
    const-string p2, "Stripe.advancedFraudSignalsEnabled must be set to \'true\' to create a Radar Session."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p2

    move-object v2, p0

    :goto_2
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_3
    move-object v7, p1

    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    check-cast p2, Lcom/stripe/android/networking/FraudDetectionData;

    invoke-virtual {p2}, Lcom/stripe/android/networking/FraudDetectionData;->getParams()Ljava/util/Map;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {v2, p2, v4, p2}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair$default(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;ILjava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-static {p1, v4}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    iget-object v5, v2, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object p1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v4, "radar/session"

    invoke-static {p1, v4}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x0

    const/16 v10, 0x8

    const/4 v11, 0x0

    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance v4, Lcom/stripe/android/model/parsers/RadarSessionJsonParser;

    invoke-direct {v4}, Lcom/stripe/android/model/parsers/RadarSessionJsonParser;-><init>()V

    new-instance v5, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$3$1;

    invoke-direct {v5, v2}, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$3$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->label:I

    invoke-direct {v2, p1, v4, v5, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    :goto_4
    check-cast p2, Lcom/stripe/android/model/RadarSession;

    :cond_8
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_9

    return-object p1

    :cond_9
    sget-object p1, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p1

    throw p1
.end method

.method public createSetupIntentFinancialConnectionsSession$payments_core_release(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/FinancialConnectionsSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->getSetupIntentFinancialConnectionsSessionUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;->toMap()Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/FinancialConnectionsSessionJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/FinancialConnectionsSessionJsonParser;-><init>()V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$createSetupIntentFinancialConnectionsSession$2;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$createSetupIntentFinancialConnectionsSession$2;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createSource$payments_core_release(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/SourceParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/Source;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getSourcesUrl$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/SourceParams;->toParamMap()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/model/SourceParams;->getAttribution$payments_core_release()Ljava/util/Set;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->getFraudDetectionData()Lcom/stripe/android/networking/FraudDetectionData;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/stripe/android/networking/FraudDetectionData;->getParams()Ljava/util/Map;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    :cond_1
    invoke-static {v2, v3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p2

    new-instance v0, Lcom/stripe/android/model/parsers/SourceJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/SourceJsonParser;-><init>()V

    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$createSource$2;

    invoke-direct {v1, p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$createSource$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/SourceParams;)V

    invoke-direct {p0, p2, v0, v1, p3}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createToken$payments_core_release(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/TokenParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getTokensUrl$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/TokenParams;->toParamMap()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/model/TokenParams;->getAttribution()Ljava/util/Set;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->getFraudDetectionData()Lcom/stripe/android/networking/FraudDetectionData;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/stripe/android/networking/FraudDetectionData;->getParams()Ljava/util/Map;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    :cond_1
    invoke-static {v2, v3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p2

    new-instance v0, Lcom/stripe/android/model/parsers/TokenJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/TokenJsonParser;-><init>()V

    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$createToken$2;

    invoke-direct {v1, p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$createToken$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/TokenParams;)V

    invoke-direct {p0, p2, v0, v1, p3}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deleteCustomerSource$payments_core_release(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/Source;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object p2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p2, p1, p4}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getDeleteCustomerSourceUrl$payments_core_release(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v2, p5

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createDelete$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/SourceJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SourceJsonParser;-><init>()V

    new-instance p4, Lcom/stripe/android/networking/StripeApiRepository$deleteCustomerSource$2;

    invoke-direct {p4, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$deleteCustomerSource$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;)V

    invoke-direct {p0, p1, p2, p4, p6}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deletePaymentDetails(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1, p2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getConsumerPaymentDetailsUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x2

    new-array v1, v1, [Lkotlin/Pair;

    const-string v2, "request_surface"

    const-string v3, "android_payment_element"

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "consumer_session_client_secret"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string v2, "credentials"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p2, p3, p1}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createDelete(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    sget-object p2, Lcom/stripe/android/networking/StripeApiRepository$deletePaymentDetails$2;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$deletePaymentDetails$2;

    invoke-virtual {p0, p1, p2, p4}, Lcom/stripe/android/networking/StripeApiRepository;->makeApiRequest$payments_core_release(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public detachPaymentMethod(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    invoke-virtual {p0, p3}, Lcom/stripe/android/networking/StripeApiRepository;->getDetachPaymentMethodUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    move-object v2, p4

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p3, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    new-instance p4, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$2;

    invoke-direct {p4, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;)V

    invoke-direct {p0, p1, p3, p4, p5}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V
    .locals 1

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    invoke-interface {v0, p1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    return-void
.end method

.method public getCardMetadata$payments_core_release(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/cards/Bin;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/CardMetadata;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/networking/StripeApiRepository;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v2, "card-metadata"

    invoke-static {p3, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getEdgeUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x5

    const/4 v11, 0x0

    move-object v6, p2

    invoke-static/range {v6 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Options;->copy$default(Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 p3, 0x2

    new-array p3, p3, [Lkotlin/Pair;

    const-string v2, "key"

    invoke-virtual {p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKey()Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v2, 0x0

    aput-object p2, p3, v2

    const-string p2, "bin_prefix"

    invoke-virtual {p1}, Lcom/stripe/android/cards/Bin;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    aput-object p2, p3, v3

    invoke-static {p3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p2

    new-instance p3, Lcom/stripe/android/model/parsers/CardMetadataJsonParser;

    invoke-direct {p3, p1}, Lcom/stripe/android/model/parsers/CardMetadataJsonParser;-><init>(Lcom/stripe/android/cards/Bin;)V

    sget-object p1, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$2$1;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$2$1;

    iput-object p0, v0, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->label:I

    invoke-direct {p0, p2, p3, p1, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    :try_start_2
    check-cast p3, Lcom/stripe/android/model/CardMetadata;

    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception p2

    move-object p1, p0

    :goto_2
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_3
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    if-eqz p3, :cond_4

    sget-object p3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataLoadFailure:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-direct {p1, p3}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V

    :cond_4
    invoke-static {p2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p2, 0x0

    :cond_5
    return-object p2
.end method

.method public final getDetachPaymentMethodUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "paymentMethodId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "payment_methods/%s/detach"

    invoke-static {v0, p1, v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getFpxBankStatus$payments_core_release(Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/BankStatuses;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object p2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v2, "fpx/bank_statuses"

    invoke-static {p2, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x5

    const/4 v11, 0x0

    move-object v6, p1

    invoke-static/range {v6 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Options;->copy$default(Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const-string p1, "account_holder_type"

    const-string p2, "individual"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/FpxBankStatusesJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/FpxBankStatusesJsonParser;-><init>()V

    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$2$fpxBankStatuses$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$2$fpxBankStatuses$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;->label:I

    invoke-direct {p0, p1, p2, v2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lcom/stripe/android/model/BankStatuses;

    if-eqz p2, :cond_4

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_4
    const-string p1, "Required value was null."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    new-instance p2, Lcom/stripe/android/model/BankStatuses;

    const/4 v0, 0x0

    invoke-direct {p2, v0, v3, v0}, Lcom/stripe/android/model/BankStatuses;-><init>(Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object p1, p2

    :cond_5
    return-object p1
.end method

.method public final synthetic getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "paymentIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "payment_intents/%s/link_account_sessions"

    invoke-static {v0, p1, v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getPaymentMethods(Lcom/stripe/android/model/ListPaymentMethodsParams;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ListPaymentMethodsParams;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    instance-of p2, p5, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;

    if-eqz p2, :cond_0

    move-object p2, p5

    check-cast p2, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;

    iget v0, p2, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;->label:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p2, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;

    invoke-direct {p2, p0, p5}, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p5, p2, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p2, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object p5, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p5}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getPaymentMethodsUrl$payments_core_release()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/stripe/android/model/ListPaymentMethodsParams;->toParamMap()Ljava/util/Map;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, 0x8

    const/4 v9, 0x0

    move-object v5, p4

    invoke-static/range {v3 .. v9}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p4, Lcom/stripe/android/model/parsers/PaymentMethodsListJsonParser;

    invoke-direct {p4}, Lcom/stripe/android/model/parsers/PaymentMethodsListJsonParser;-><init>()V

    new-instance p5, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$paymentMethodsList$1;

    invoke-direct {p5, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$paymentMethodsList$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;)V

    iput v2, p2, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;->label:I

    invoke-direct {p0, p1, p4, p5, p2}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    check-cast p5, Lcom/stripe/android/model/PaymentMethodsList;

    if-eqz p5, :cond_4

    invoke-virtual {p5}, Lcom/stripe/android/model/PaymentMethodsList;->getPaymentMethods()Ljava/util/List;

    move-result-object p1

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_5
    return-object p1
.end method

.method public final synthetic getSetupIntentFinancialConnectionsSessionUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "setupIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "setup_intents/%s/link_account_sessions"

    invoke-static {v0, p1, v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public listPaymentDetails(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getListConsumerPaymentDetailsUrl$payments_core_release()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "request_surface"

    const-string v4, "android_payment_element"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "consumer_session_client_secret"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string v3, "credentials"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v3, 0x1

    aput-object p1, v2, v3

    const-string p1, "types"

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v2, p2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;-><init>()V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$listPaymentDetails$2;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$listPaymentDetails$2;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public logoutConsumer(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getLogoutConsumerUrl$payments_core_release()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "request_surface"

    const-string v4, "android_payment_element"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "consumer_session_client_secret"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string v3, "credentials"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    if-eqz p2, :cond_0

    const-string v2, "verification_session_client_secrets"

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    const-string v2, "cookies"

    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    if-nez p2, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :cond_1
    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser;-><init>()V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$logoutConsumer$3;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$logoutConsumer$3;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final makeApiRequest$payments_core_release(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/ApiRequest;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;

    iget-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$2:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/functions/Function0;

    iget-object v1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/core/networking/ApiRequest;

    iget-object v0, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, p3

    move-object p3, p1

    move-object p1, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_1

    :catchall_0
    move-exception p3

    move-object v4, p3

    move-object p3, p1

    move-object p1, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->disableDnsCache()Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;

    move-result-object p3

    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v2, p0, Lcom/stripe/android/networking/StripeApiRepository;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    iput-object p0, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->label:I

    invoke-interface {v2, p1, v0}, Lcom/stripe/android/core/networking/StripeNetworkClient;->executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p0

    :goto_1
    :try_start_2
    check-cast v0, Lcom/stripe/android/core/networking/StripeResponse;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v1, p0

    :goto_2
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_5

    check-cast v0, Lcom/stripe/android/core/networking/StripeResponse;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/StripeResponse;->isError()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-direct {v1, v0}, Lcom/stripe/android/networking/StripeApiRepository;->handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)V

    :cond_4
    invoke-direct {v1, p3}, Lcom/stripe/android/networking/StripeApiRepository;->resetDnsCache(Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;)V

    return-object v0

    :cond_5
    instance-of p3, p2, Ljava/io/IOException;

    if-eqz p3, :cond_6

    sget-object p3, Lcom/stripe/android/core/exception/APIConnectionException;->Companion:Lcom/stripe/android/core/exception/APIConnectionException$Companion;

    check-cast p2, Ljava/io/IOException;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/ApiRequest;->getBaseUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p2, p1}, Lcom/stripe/android/core/exception/APIConnectionException$Companion;->create(Ljava/io/IOException;Ljava/lang/String;)Lcom/stripe/android/core/exception/APIConnectionException;

    move-result-object p2

    :cond_6
    throw p2
.end method

.method public final makeFileUploadRequest$payments_core_release(Lcom/stripe/android/core/networking/FileUploadRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/FileUploadRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/core/networking/RequestId;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;

    iget-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$2:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/core/networking/FileUploadRequest;

    iget-object v0, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, p3

    move-object p3, p1

    move-object p1, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_1

    :catchall_0
    move-exception p3

    move-object v4, p3

    move-object p3, p1

    move-object p1, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->disableDnsCache()Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;

    move-result-object p3

    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v2, p0, Lcom/stripe/android/networking/StripeApiRepository;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    iput-object p0, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->label:I

    invoke-interface {v2, p1, v0}, Lcom/stripe/android/core/networking/StripeNetworkClient;->executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p0

    :goto_1
    :try_start_2
    check-cast v0, Lcom/stripe/android/core/networking/StripeResponse;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v1, p0

    :goto_2
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    move-object v2, v3

    goto :goto_4

    :cond_4
    move-object v2, v0

    :goto_4
    check-cast v2, Lcom/stripe/android/core/networking/StripeResponse;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/stripe/android/core/networking/StripeResponse;->getRequestId()Lcom/stripe/android/core/networking/RequestId;

    move-result-object v3

    :cond_5
    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_7

    check-cast v0, Lcom/stripe/android/core/networking/StripeResponse;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/StripeResponse;->isError()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-direct {v1, v0}, Lcom/stripe/android/networking/StripeApiRepository;->handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)V

    :cond_6
    invoke-direct {v1, p3}, Lcom/stripe/android/networking/StripeApiRepository;->resetDnsCache(Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;)V

    return-object v0

    :cond_7
    instance-of p3, p2, Ljava/io/IOException;

    if-eqz p3, :cond_8

    sget-object p3, Lcom/stripe/android/core/exception/APIConnectionException;->Companion:Lcom/stripe/android/core/exception/APIConnectionException$Companion;

    check-cast p2, Ljava/io/IOException;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/FileUploadRequest;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p2, p1}, Lcom/stripe/android/core/exception/APIConnectionException$Companion;->create(Ljava/io/IOException;Ljava/lang/String;)Lcom/stripe/android/core/exception/APIConnectionException;

    move-result-object p2

    :cond_8
    throw p2
.end method

.method public refreshPaymentIntent$payments_core_release(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/model/PaymentIntent$ClientSecret;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->getPaymentIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    iget-object v1, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v2, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRefreshPaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/networking/StripeApiRepository;->createClientSecretParam(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p2, v0, v1, v0}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>(Lcom/stripe/android/model/LuxePostConfirmActionRepository;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$refreshPaymentIntent$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/networking/StripeApiRepository$refreshPaymentIntent$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrieveCardMetadata(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/CardMetadata;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p3, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;

    if-eqz p2, :cond_0

    move-object p2, p3

    check-cast p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;

    iget v0, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->label:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;

    invoke-direct {p2, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/cards/Bin;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p3, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    invoke-direct {p3, p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getBin()Lcom/stripe/android/cards/Bin;

    move-result-object p1

    if-nez p1, :cond_3

    const/4 p1, 0x0

    return-object p1

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/networking/StripeApiRepository;->cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    iget-object v3, p0, Lcom/stripe/android/networking/StripeApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1, p0, v3}, Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;->createWithStripeRepository(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;)Lcom/stripe/android/cards/CardAccountRangeRepository;

    move-result-object v1

    iput-object p1, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->L$0:Ljava/lang/Object;

    iput v2, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->label:I

    invoke-interface {v1, p3, p2}, Lcom/stripe/android/cards/CardAccountRangeRepository;->getAccountRanges(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    check-cast p3, Ljava/util/List;

    if-nez p3, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    :cond_5
    new-instance p2, Lcom/stripe/android/model/CardMetadata;

    invoke-direct {p2, p1, p3}, Lcom/stripe/android/model/CardMetadata;-><init>(Lcom/stripe/android/cards/Bin;Ljava/util/List;)V

    return-object p2
.end method

.method public retrieveCustomer(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/Customer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRetrieveCustomerUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p3, Lcom/stripe/android/model/parsers/CustomerJsonParser;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/CustomerJsonParser;-><init>()V

    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveCustomer$2;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$retrieveCustomer$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;)V

    invoke-direct {p0, p1, p3, v0, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrieveElementsSession(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSessionParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ElementsSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/stripe/android/networking/StripeApiRepository;->retrieveElementsSession(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrieveIssuingCardPin$payments_core_release(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;,
            Lorg/json/JSONException;
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p5

    instance-of v2, v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;

    iget v3, v2, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;

    invoke-direct {v2, p0, v1}, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v6, v0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    move-object v4, p1

    invoke-virtual {v1, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getIssuingCardPinUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v4, "verification"

    move-object v8, p2

    move-object/from16 v9, p3

    invoke-static {v1, p2, v9}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createVerificationParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v9

    const/4 v10, 0x0

    const/16 v11, 0x8

    const/4 v12, 0x0

    move-object/from16 v8, p4

    invoke-static/range {v6 .. v12}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v1

    new-instance v4, Lcom/stripe/android/model/parsers/IssuingCardPinJsonParser;

    invoke-direct {v4}, Lcom/stripe/android/model/parsers/IssuingCardPinJsonParser;-><init>()V

    new-instance v6, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$issuingCardPin$1;

    invoke-direct {v6, p0}, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$issuingCardPin$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v5, v2, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;->label:I

    invoke-direct {p0, v1, v4, v6, v2}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    :goto_1
    check-cast v1, Lcom/stripe/android/model/IssuingCardPin;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/stripe/android/model/IssuingCardPin;->getPin()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    return-object v1
.end method

.method public retrieveObject$payments_core_release(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/AuthenticationException;
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    sget-object p3, Lcom/stripe/android/utils/StripeUrlUtils;->INSTANCE:Lcom/stripe/android/utils/StripeUrlUtils;

    invoke-virtual {p3, p1}, Lcom/stripe/android/utils/StripeUrlUtils;->isStripeUrl$payments_core_release(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_4

    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xc

    const/4 v10, 0x0

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$response$1;

    invoke-direct {p2, p0}, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$response$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;->label:I

    invoke-virtual {p0, p1, p2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->makeApiRequest$payments_core_release(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lcom/stripe/android/core/networking/StripeResponse;

    return-object p3

    :cond_4
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unrecognized domain: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public retrievePaymentIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/model/PaymentIntent$ClientSecret;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->getPaymentIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsUserKey()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-static {p1, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/stripe/android/networking/StripeApiRepository;->createClientSecretParam(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    :goto_0
    move-object v4, p1

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    iget-object v1, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object p1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p1, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRetrievePaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    const/4 p3, 0x1

    const/4 v0, 0x0

    invoke-direct {p2, v0, p3, v0}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>(Lcom/stripe/android/model/LuxePostConfirmActionRepository;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentIntent$2;

    invoke-direct {p3, p0}, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentIntent$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrievePaymentMethodMessage(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/PaymentMethodMessage;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    const-string v1, "https://ppm.stripe.com/content"

    const/4 v2, 0x6

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "amount"

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v3, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const-string p2, "client"

    const-string v4, "android"

    invoke-static {p2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v4, 0x1

    aput-object p2, v2, v4

    const-string p2, "country"

    invoke-static {p2, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p4, 0x2

    aput-object p2, v2, p4

    const-string p2, "currency"

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p3, 0x3

    aput-object p2, v2, p3

    const-string p2, "locale"

    invoke-static {p2, p5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p3, 0x4

    aput-object p2, v2, p3

    const-string p2, "logo_color"

    invoke-static {p2, p6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p3, 0x5

    aput-object p2, v2, p3

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    check-cast p1, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p1, p4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    add-int/lit8 p5, v3, 0x1

    if-gez v3, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast p4, Ljava/lang/String;

    new-instance p6, Lkotlin/Pair;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "payment_methods["

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p6, v2, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p3, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v3, p5

    goto :goto_0

    :cond_1
    invoke-static {p2, p3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p7

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/PaymentMethodMessageJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/PaymentMethodMessageJsonParser;-><init>()V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentMethodMessage$3;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentMethodMessage$3;

    invoke-direct {p0, p1, p2, p3, p8}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrieveSetupIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/model/SetupIntent$ClientSecret;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/SetupIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/model/SetupIntent$ClientSecret;->getSetupIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    iget-object v1, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v2, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRetrieveSetupIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, p3}, Lcom/stripe/android/networking/StripeApiRepository;->createClientSecretParam(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$retrieveSetupIntent$2;

    invoke-direct {p3, p0}, Lcom/stripe/android/networking/StripeApiRepository$retrieveSetupIntent$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrieveSource$payments_core_release(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/Source;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRetrieveSourceApiUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object p1, Lcom/stripe/android/model/SourceParams;->Companion:Lcom/stripe/android/model/SourceParams$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/model/SourceParams$Companion;->createRetrieveSourceParams(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/SourceJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SourceJsonParser;-><init>()V

    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$retrieveSource$2;

    invoke-direct {p3, p0}, Lcom/stripe/android/networking/StripeApiRepository$retrieveSource$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrieveStripeIntent$payments_core_release(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    sget-object p4, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->Companion:Lcom/stripe/android/model/PaymentIntent$ClientSecret$Companion;

    invoke-virtual {p4, p1}, Lcom/stripe/android/model/PaymentIntent$ClientSecret$Companion;->isMatch(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_6

    iput v4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;->label:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->retrievePaymentIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    if-eqz p4, :cond_5

    check-cast p4, Lcom/stripe/android/model/StripeIntent;

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Could not retrieve PaymentIntent."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    sget-object p4, Lcom/stripe/android/model/SetupIntent$ClientSecret;->Companion:Lcom/stripe/android/model/SetupIntent$ClientSecret$Companion;

    invoke-virtual {p4, p1}, Lcom/stripe/android/model/SetupIntent$ClientSecret$Companion;->isMatch(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_9

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;->label:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->retrieveSetupIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    if-eqz p4, :cond_8

    check-cast p4, Lcom/stripe/android/model/StripeIntent;

    :goto_3
    return-object p4

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Could not retrieve SetupIntent."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Invalid client secret."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setCustomerShippingInfo$payments_core_release(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/model/ShippingInformation;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/Customer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object p2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRetrieveCustomerUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string p1, "shipping"

    invoke-virtual {p4}, Lcom/stripe/android/model/ShippingInformation;->toParamMap()Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p5

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/CustomerJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/CustomerJsonParser;-><init>()V

    new-instance p4, Lcom/stripe/android/networking/StripeApiRepository$setCustomerShippingInfo$2;

    invoke-direct {p4, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$setCustomerShippingInfo$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;)V

    invoke-direct {p0, p1, p2, p4, p6}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public setDefaultCustomerSource$payments_core_release(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/Customer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object p2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRetrieveCustomerUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string p1, "default_source"

    invoke-static {p1, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p6

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/CustomerJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/CustomerJsonParser;-><init>()V

    new-instance p4, Lcom/stripe/android/networking/StripeApiRepository$setDefaultCustomerSource$2;

    invoke-direct {p4, p0, p3, p5}, Lcom/stripe/android/networking/StripeApiRepository$setDefaultCustomerSource$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p4, p7}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public start3ds2Auth$payments_core_release(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/Stripe3ds2AuthParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/Stripe3ds2AuthResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v2, "3ds2/authenticate"

    invoke-static {v1, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/Stripe3ds2AuthParams;->toParamMap()Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser;-><init>()V

    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$start3ds2Auth$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/networking/StripeApiRepository$start3ds2Auth$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateIssuingCardPin$payments_core_release(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v1, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getIssuingCardPinUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "verification"

    invoke-static {v1, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createVerificationParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p3

    invoke-static {v3, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 p4, 0x0

    aput-object p3, v2, p4

    const-string p3, "pin"

    invoke-static {p3, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, v2, p3

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p5

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/networking/StripeApiRepository$updateIssuingCardPin$2;

    invoke-direct {p2, p0}, Lcom/stripe/android/networking/StripeApiRepository$updateIssuingCardPin$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    invoke-virtual {p0, p1, p2, p6}, Lcom/stripe/android/networking/StripeApiRepository;->makeApiRequest$payments_core_release(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public updatePaymentDetails(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getConsumerPaymentDetailsUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "request_surface"

    const-string v4, "android_payment_element"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "consumer_session_client_secret"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string v3, "credentials"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;->toParamMap()Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;-><init>()V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentDetails$2;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$updatePaymentDetails$2;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public verifyPaymentIntentWithMicrodeposits(Ljava/lang/String;IILcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    new-instance v2, Lcom/stripe/android/model/PaymentIntent$ClientSecret;

    invoke-direct {v2, p1}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->getPaymentIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "client_secret"

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    new-array p1, v2, [Ljava/lang/Integer;

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v4

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, p1, p3

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string p2, "amounts"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v3, p3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p4

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    const/4 p4, 0x0

    invoke-direct {p2, p4, p3, p4}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>(Lcom/stripe/android/model/LuxePostConfirmActionRepository;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$2;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$2;

    invoke-direct {p0, p1, p2, p3, p5}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public verifyPaymentIntentWithMicrodeposits(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    new-instance v2, Lcom/stripe/android/model/PaymentIntent$ClientSecret;

    invoke-direct {v2, p1}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->getPaymentIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "client_secret"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "descriptor_code"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v2, p2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p3, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    const/4 v0, 0x0

    invoke-direct {p3, v0, p2, v0}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>(Lcom/stripe/android/model/LuxePostConfirmActionRepository;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p2, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$4;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$4;

    invoke-direct {p0, p1, p3, p2, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public verifySetupIntentWithMicrodeposits(Ljava/lang/String;IILcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    new-instance v2, Lcom/stripe/android/model/SetupIntent$ClientSecret;

    invoke-direct {v2, p1}, Lcom/stripe/android/model/SetupIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/stripe/android/model/SetupIntent$ClientSecret;->getSetupIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "client_secret"

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    new-array p1, v2, [Ljava/lang/Integer;

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v4

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, p1, p3

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string p2, "amounts"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v3, p3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p4

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$2;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$2;

    invoke-direct {p0, p1, p2, p3, p5}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public verifySetupIntentWithMicrodeposits(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    new-instance v2, Lcom/stripe/android/model/SetupIntent$ClientSecret;

    invoke-direct {v2, p1}, Lcom/stripe/android/model/SetupIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/stripe/android/model/SetupIntent$ClientSecret;->getSetupIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "client_secret"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "descriptor_code"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v2, p2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$4;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$4;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModel(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
