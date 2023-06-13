.class public abstract Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;
.super Lie;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Companion;,
        Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c0\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008 \u0018\u0000 \u00e1\u00012\u00020\u0001:\u0004\u00e1\u0001\u00e2\u0001Bg\u0012\u0008\u0010\u00de\u0001\u001a\u00030\u00dd\u0001\u0012\u0008\u0010I\u001a\u0004\u0018\u00010H\u0012\u0006\u0010N\u001a\u00020M\u0012\u0006\u0010S\u001a\u00020R\u0012\u0006\u0010X\u001a\u00020W\u0012\u0008\u0008\u0002\u0010]\u001a\u00020\\\u0012\u0006\u0010b\u001a\u00020a\u0012\u0006\u0010g\u001a\u00020f\u0012\u0006\u0010l\u001a\u00020k\u0012\u0006\u0010q\u001a\u00020p\u0012\u0006\u0010v\u001a\u00020u\u00a2\u0006\u0006\u0008\u00df\u0001\u0010\u00e0\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002J3\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0008\u0010\u0015\u001a\u00020\u0005H\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H&J\u0008\u0010\u0019\u001a\u00020\u0005H&J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\nH\u0004J\u0006\u0010\u001c\u001a\u00020\u0005J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nH\u0004J\u0012\u0010\u001f\u001a\u00020\u00052\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0004J\u0008\u0010 \u001a\u00020\u0005H&J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!J\u0006\u0010$\u001a\u00020\u0005J\u001e\u0010\'\u001a\u00020\u00052\u0016\u0010&\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070%J\u0006\u0010(\u001a\u00020\u0005J\u000e\u0010*\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020)J\u0010\u0010,\u001a\u00020\u00052\u0008\u0010+\u001a\u0004\u0018\u00010\u0003J\u0012\u0010/\u001a\u00020\u00052\u0008\u0010.\u001a\u0004\u0018\u00010-H&J\u0010\u00100\u001a\u00020\u00052\u0008\u0010.\u001a\u0004\u0018\u00010-J\u0006\u00101\u001a\u00020\u0005J\u000e\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u000cJ\u000e\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u000204J\u0010\u00109\u001a\u00020\u00052\u0008\u00108\u001a\u0004\u0018\u000107J\u0016\u0010>\u001a\u00020=2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u000cJ\u0006\u0010?\u001a\u00020\u0005J\u0008\u0010@\u001a\u00020\u0005H&J\u0010\u0010C\u001a\u00020\u00052\u0006\u0010B\u001a\u00020AH&J\u0008\u0010D\u001a\u00020\u0005H&J\u001b\u0010F\u001a\u00020\u00052\n\u0008\u0003\u0010E\u001a\u0004\u0018\u00010\u0012H&\u00a2\u0006\u0004\u0008F\u0010GJ\u0014\u0010F\u001a\u00020\u00052\n\u0008\u0002\u0010E\u001a\u0004\u0018\u00010\u0003H&R\u001c\u0010I\u001a\u0004\u0018\u00010H8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008I\u0010J\u001a\u0004\u0008K\u0010LR\u001a\u0010N\u001a\u00020M8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008N\u0010O\u001a\u0004\u0008P\u0010QR\u001a\u0010S\u001a\u00020R8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008S\u0010T\u001a\u0004\u0008U\u0010VR\u001a\u0010X\u001a\u00020W8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008X\u0010Y\u001a\u0004\u0008Z\u0010[R\u001a\u0010]\u001a\u00020\\8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008]\u0010^\u001a\u0004\u0008_\u0010`R\u001a\u0010b\u001a\u00020a8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008b\u0010c\u001a\u0004\u0008d\u0010eR\u0017\u0010g\u001a\u00020f8\u0006\u00a2\u0006\u000c\n\u0004\u0008g\u0010h\u001a\u0004\u0008i\u0010jR\u0017\u0010l\u001a\u00020k8\u0006\u00a2\u0006\u000c\n\u0004\u0008l\u0010m\u001a\u0004\u0008n\u0010oR\u0017\u0010q\u001a\u00020p8\u0006\u00a2\u0006\u000c\n\u0004\u0008q\u0010r\u001a\u0004\u0008s\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008v\u0010wR\"\u0010y\u001a\u00020x8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008y\u0010z\u001a\u0004\u0008{\u0010|\"\u0004\u0008}\u0010~R!\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001R\u001f\u0010\u0084\u0001\u001a\u00020\u00038\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0084\u0001\u0010\u0085\u0001\u001a\u0006\u0008\u0086\u0001\u0010\u0087\u0001R+\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00168\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0088\u0001\u0010\u0089\u0001\u001a\u0006\u0008\u008a\u0001\u0010\u008b\u0001\"\u0006\u0008\u008c\u0001\u0010\u008d\u0001R$\u0010\u000f\u001a\t\u0012\u0004\u0012\u00020\u000e0\u008e\u00018\u0000X\u0080\u0004\u00a2\u0006\u000f\n\u0005\u0008\u000f\u0010\u008f\u0001\u001a\u0006\u0008\u0090\u0001\u0010\u0091\u0001R \u0010\u0093\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0092\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001R&\u0010\u0011\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u008e\u00018\u0000X\u0080\u0004\u00a2\u0006\u000f\n\u0005\u0008\u0011\u0010\u008f\u0001\u001a\u0006\u0008\u0095\u0001\u0010\u0091\u0001R>\u0010\u0097\u0001\u001a\u0008\u0012\u0004\u0012\u00020:0\u00022\r\u0010\u0096\u0001\u001a\u0008\u0012\u0004\u0012\u00020:0\u00028\u0000@@X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0097\u0001\u0010\u0098\u0001\u001a\u0006\u0008\u0099\u0001\u0010\u009a\u0001\"\u0006\u0008\u009b\u0001\u0010\u009c\u0001R)\u0010\u009e\u0001\u001a\u0014\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0003j\u0003`\u009d\u00010\u00020\u0092\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009e\u0001\u0010\u0094\u0001R1\u0010\u009f\u0001\u001a\u0014\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0003j\u0003`\u009d\u00010\u00020\u008e\u00018\u0004X\u0084\u0004\u00a2\u0006\u0010\n\u0006\u0008\u009f\u0001\u0010\u008f\u0001\u001a\u0006\u0008\u00a0\u0001\u0010\u0091\u0001R.\u0010\u00a1\u0001\u001a\u0011\u0012\u000c\u0012\n\u0012\u0004\u0012\u000204\u0018\u00010\u00020\u008e\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00a1\u0001\u0010\u008f\u0001\u001a\u0006\u0008\u00a2\u0001\u0010\u0091\u0001R!\u0010\u00a4\u0001\u001a\u000c\u0012\u0007\u0012\u0005\u0018\u00010\u00a3\u00010\u0092\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a4\u0001\u0010\u0094\u0001R)\u0010\u00a5\u0001\u001a\u000c\u0012\u0007\u0012\u0005\u0018\u00010\u00a3\u00010\u008e\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00a5\u0001\u0010\u008f\u0001\u001a\u0006\u0008\u00a6\u0001\u0010\u0091\u0001R!\u0010\u00a8\u0001\u001a\u000c\u0012\u0007\u0012\u0005\u0018\u00010\u00a7\u00010\u008e\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a8\u0001\u0010\u008f\u0001R,\u0010\u00a9\u0001\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00020\u0092\u00018\u0004X\u0084\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00a9\u0001\u0010\u0094\u0001\u001a\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001R!\u0010\u001d\u001a\t\u0012\u0004\u0012\u00020\n0\u008e\u00018\u0006\u00a2\u0006\u000f\n\u0005\u0008\u001d\u0010\u008f\u0001\u001a\u0006\u0008\u00ac\u0001\u0010\u0091\u0001R(\u0010\u00ae\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00ad\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00ae\u0001\u0010\u00af\u0001\u001a\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001R&\u0010.\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0\u008e\u00018\u0000X\u0080\u0004\u00a2\u0006\u000f\n\u0005\u0008.\u0010\u008f\u0001\u001a\u0006\u0008\u00b2\u0001\u0010\u0091\u0001R\u001e\u0010\u00b3\u0001\u001a\t\u0012\u0004\u0012\u00020\u000c0\u0092\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b3\u0001\u0010\u0094\u0001R&\u0010\u00b4\u0001\u001a\t\u0012\u0004\u0012\u00020\u000c0\u008e\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00b4\u0001\u0010\u008f\u0001\u001a\u0006\u0008\u00b5\u0001\u0010\u0091\u0001R#\u0010\u00b6\u0001\u001a\t\u0012\u0004\u0012\u00020\u000c0\u008e\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00b6\u0001\u0010\u008f\u0001\u001a\u0006\u0008\u00b7\u0001\u0010\u0091\u0001R\u001e\u0010\u00b8\u0001\u001a\t\u0012\u0004\u0012\u00020\u000c0\u0092\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b8\u0001\u0010\u0094\u0001R&\u0010\u00b9\u0001\u001a\t\u0012\u0004\u0012\u00020\u000c0\u008e\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00b9\u0001\u0010\u008f\u0001\u001a\u0006\u0008\u00ba\u0001\u0010\u0091\u0001R \u0010\u00bb\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010)0\u0092\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00bb\u0001\u0010\u0094\u0001R%\u0010\u00bc\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010)0\u008e\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00bc\u0001\u0010\u008f\u0001\u001a\u0006\u0008\u00bd\u0001\u0010\u0091\u0001R(\u0010\u00be\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0092\u00018\u0004X\u0084\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00be\u0001\u0010\u0094\u0001\u001a\u0006\u0008\u00bf\u0001\u0010\u00ab\u0001R \u0010\u00c0\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0092\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c0\u0001\u0010\u0094\u0001R(\u0010\u00c1\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u008e\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00c1\u0001\u0010\u008f\u0001\u001a\u0006\u0008\u00c2\u0001\u0010\u0091\u0001R#\u0010\u00c3\u0001\u001a\t\u0012\u0004\u0012\u00020\u000c0\u00ad\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00c3\u0001\u0010\u00af\u0001\u001a\u0006\u0008\u00c4\u0001\u0010\u00b1\u0001R+\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00c5\u0001\u0010\u0085\u0001\u001a\u0006\u0008\u00c6\u0001\u0010\u0087\u0001\"\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001R!\u0010\u00ce\u0001\u001a\u00030\u00c9\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00ca\u0001\u0010\u00cb\u0001\u001a\u0006\u0008\u00cc\u0001\u0010\u00cd\u0001R$\u0010\u00d0\u0001\u001a\n\u0012\u0005\u0012\u00030\u00cf\u00010\u008e\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00d0\u0001\u0010\u008f\u0001\u001a\u0006\u0008\u00d1\u0001\u0010\u0091\u0001R \u0010\u00d3\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u008e\u00018&X\u00a6\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00d2\u0001\u0010\u0091\u0001R$\u0010\u00d9\u0001\u001a\u0005\u0018\u00010\u00d4\u00018&@&X\u00a6\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00d5\u0001\u0010\u00d6\u0001\"\u0006\u0008\u00d7\u0001\u0010\u00d8\u0001R\u0017\u0010\u00dc\u0001\u001a\u00020\u000c8&X\u00a6\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00da\u0001\u0010\u00db\u0001\u00a8\u0006\u00e3\u0001"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "Lie;",
        "",
        "",
        "unactivatedPaymentMethodTypes",
        "",
        "warnUnactivatedIfNeeded",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "state",
        "updateLinkPrimaryButtonUiState",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
        "screen",
        "",
        "isLinkAvailable",
        "Lcom/stripe/android/paymentsheet/state/GooglePayState;",
        "googlePayState",
        "Lcom/stripe/android/model/StripeIntent;",
        "stripeIntent",
        "",
        "mapToHeaderTextResource",
        "(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/state/GooglePayState;Lcom/stripe/android/model/StripeIntent;)Ljava/lang/Integer;",
        "onUserBack",
        "",
        "throwable",
        "onFatal",
        "transitionToFirstScreen",
        "target",
        "transitionTo",
        "transitionToAddPaymentScreen",
        "currentScreen",
        "reportNavigationEvent",
        "setStripeIntent",
        "clearErrorMessages",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
        "viewState",
        "updatePrimaryButtonForLinkSignup",
        "updatePrimaryButtonForLinkInline",
        "Lkotlin/Function1;",
        "block",
        "updateCustomPrimaryButtonUiState",
        "resetUSBankPrimaryButton",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
        "updatePrimaryButtonState",
        "text",
        "updateBelowButtonText",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "selection",
        "handlePaymentMethodSelected",
        "updateSelection",
        "toggleEditing",
        "visible",
        "setContentVisible",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentMethod",
        "removePaymentMethod",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        "userInput",
        "payWithLinkInline",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
        "selectedItem",
        "showLinkInlineSignup",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "createFormArguments",
        "handleBackPressed",
        "onUserCancel",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "paymentResult",
        "onPaymentResult",
        "onFinish",
        "error",
        "onError",
        "(Ljava/lang/Integer;)V",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "config",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "getConfig$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "getEventReporter$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "customerRepository",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "getCustomerRepository",
        "()Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "Lcom/stripe/android/paymentsheet/PrefsRepository;",
        "prefsRepository",
        "Lcom/stripe/android/paymentsheet/PrefsRepository;",
        "getPrefsRepository",
        "()Lcom/stripe/android/paymentsheet/PrefsRepository;",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "getWorkContext",
        "()Lkotlin/coroutines/CoroutineContext;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "getLogger",
        "()Lcom/stripe/android/core/Logger;",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
        "lpmRepository",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
        "getLpmRepository",
        "()Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
        "Landroidx/lifecycle/p;",
        "savedStateHandle",
        "Landroidx/lifecycle/p;",
        "getSavedStateHandle",
        "()Landroidx/lifecycle/p;",
        "Lcom/stripe/android/paymentsheet/LinkHandler;",
        "linkHandler",
        "Lcom/stripe/android/paymentsheet/LinkHandler;",
        "getLinkHandler",
        "()Lcom/stripe/android/paymentsheet/LinkHandler;",
        "Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;",
        "headerTextFactory",
        "Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "injector",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "getInjector",
        "()Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "setInjector",
        "(Lcom/stripe/android/core/injection/NonFallbackInjector;)V",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
        "customerConfig",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
        "getCustomerConfig$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
        "merchantName",
        "Ljava/lang/String;",
        "getMerchantName$paymentsheet_release",
        "()Ljava/lang/String;",
        "mostRecentError",
        "Ljava/lang/Throwable;",
        "getMostRecentError",
        "()Ljava/lang/Throwable;",
        "setMostRecentError",
        "(Ljava/lang/Throwable;)V",
        "LtP5;",
        "LtP5;",
        "getGooglePayState$paymentsheet_release",
        "()LtP5;",
        "LGX2;",
        "_stripeIntent",
        "LGX2;",
        "getStripeIntent$paymentsheet_release",
        "value",
        "supportedPaymentMethods",
        "Ljava/util/List;",
        "getSupportedPaymentMethods$paymentsheet_release",
        "()Ljava/util/List;",
        "setSupportedPaymentMethods$paymentsheet_release",
        "(Ljava/util/List;)V",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "_supportedPaymentMethodsFlow",
        "supportedPaymentMethodsFlow",
        "getSupportedPaymentMethodsFlow",
        "paymentMethods",
        "getPaymentMethods$paymentsheet_release",
        "Lcom/stripe/android/ui/core/Amount;",
        "_amount",
        "amount",
        "getAmount$paymentsheet_release",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "savedSelection",
        "backStack",
        "getBackStack",
        "()LGX2;",
        "getCurrentScreen",
        "LEu1;",
        "headerText",
        "LEu1;",
        "getHeaderText$paymentsheet_release",
        "()LEu1;",
        "getSelection$paymentsheet_release",
        "_editing",
        "editing",
        "getEditing$paymentsheet_release",
        "processing",
        "getProcessing",
        "_contentVisible",
        "contentVisible",
        "getContentVisible$paymentsheet_release",
        "_primaryButtonState",
        "primaryButtonState",
        "getPrimaryButtonState",
        "customPrimaryButtonUiState",
        "getCustomPrimaryButtonUiState",
        "_notesText",
        "notesText",
        "getNotesText$paymentsheet_release",
        "buttonsEnabled",
        "getButtonsEnabled",
        "lpmServerSpec",
        "getLpmServerSpec$paymentsheet_release",
        "setLpmServerSpec$paymentsheet_release",
        "(Ljava/lang/String;)V",
        "Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;",
        "paymentOptionsStateMapper$delegate",
        "Lkotlin/Lazy;",
        "getPaymentOptionsStateMapper",
        "()Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;",
        "paymentOptionsStateMapper",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsState;",
        "paymentOptionsState",
        "getPaymentOptionsState",
        "getPrimaryButtonUiState",
        "primaryButtonUiState",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "getNewPaymentSelection",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "setNewPaymentSelection",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V",
        "newPaymentSelection",
        "getShouldCompleteLinkFlowInline",
        "()Z",
        "shouldCompleteLinkFlowInline",
        "Landroid/app/Application;",
        "application",
        "<init>",
        "(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;)V",
        "Companion",
        "UserErrorMessage",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSheetViewModel.kt\ncom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,527:1\n47#2:528\n49#2:532\n50#3:529\n55#3:531\n106#4:530\n1549#5:533\n1620#5,3:534\n1549#5:542\n1620#5,3:543\n230#6,5:537\n230#6,5:546\n230#6,5:551\n*S KotlinDebug\n*F\n+ 1 BaseSheetViewModel.kt\ncom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel\n*L\n131#1:528\n131#1:532\n131#1:529\n131#1:531\n131#1:530\n99#1:533\n99#1:534,3\n286#1:542\n286#1:543,3\n241#1:537,5\n373#1:546,5\n502#1:551,5\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Companion;

.field public static final SAVE_GOOGLE_PAY_STATE:Ljava/lang/String; = "google_pay_state"

.field public static final SAVE_PAYMENT_METHODS:Ljava/lang/String; = "customer_payment_methods"

.field public static final SAVE_PROCESSING:Ljava/lang/String; = "processing"

.field public static final SAVE_SAVED_SELECTION:Ljava/lang/String; = "saved_selection"

.field public static final SAVE_SELECTION:Ljava/lang/String; = "selection"


# instance fields
.field private final _amount:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/ui/core/Amount;",
            ">;"
        }
    .end annotation
.end field

.field private final _contentVisible:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _editing:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _notesText:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final _primaryButtonState:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
            ">;"
        }
    .end annotation
.end field

.field private final _stripeIntent:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;"
        }
    .end annotation
.end field

.field private final _supportedPaymentMethodsFlow:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final amount:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/ui/core/Amount;",
            ">;"
        }
    .end annotation
.end field

.field private final backStack:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
            ">;>;"
        }
    .end annotation
.end field

.field private final buttonsEnabled:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

.field private final contentVisible:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final currentScreen:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
            ">;"
        }
    .end annotation
.end field

.field private final customPrimaryButtonUiState:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;"
        }
    .end annotation
.end field

.field private final customerConfig:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

.field private final customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

.field private final editing:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final googlePayState:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/state/GooglePayState;",
            ">;"
        }
    .end annotation
.end field

.field private final headerText:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final headerTextFactory:Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;

.field public injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

.field private final linkHandler:Lcom/stripe/android/paymentsheet/LinkHandler;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final lpmRepository:Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

.field private lpmServerSpec:Ljava/lang/String;

.field private final merchantName:Ljava/lang/String;

.field private mostRecentError:Ljava/lang/Throwable;

.field private final notesText:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentMethods:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;"
        }
    .end annotation
.end field

.field private final paymentOptionsState:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsState;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentOptionsStateMapper$delegate:Lkotlin/Lazy;

.field private final prefsRepository:Lcom/stripe/android/paymentsheet/PrefsRepository;

.field private final primaryButtonState:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
            ">;"
        }
    .end annotation
.end field

.field private final processing:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final savedSelection:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;"
        }
    .end annotation
.end field

.field private final savedStateHandle:Landroidx/lifecycle/p;

.field private final selection:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeIntent:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;"
        }
    .end annotation
.end field

.field private supportedPaymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final supportedPaymentMethodsFlow:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->Companion:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;)V
    .locals 17

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

    const-string v12, "application"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "eventReporter"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "customerRepository"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "prefsRepository"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "workContext"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "logger"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "lpmRepository"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "savedStateHandle"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "linkHandler"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "headerTextFactory"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p1}, Lie;-><init>(Landroid/app/Application;)V

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->prefsRepository:Lcom/stripe/android/paymentsheet/PrefsRepository;

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    iput-object v7, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    iput-object v8, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->lpmRepository:Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    iput-object v9, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    iput-object v10, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->linkHandler:Lcom/stripe/android/paymentsheet/LinkHandler;

    iput-object v11, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->headerTextFactory:Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    iput-object v4, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->customerConfig:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    if-eqz v2, :cond_1

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getMerchantDisplayName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    iput-object v2, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->merchantName:Ljava/lang/String;

    const-string v2, "google_pay_state"

    sget-object v4, Lcom/stripe/android/paymentsheet/state/GooglePayState$Indeterminate;->INSTANCE:Lcom/stripe/android/paymentsheet/state/GooglePayState$Indeterminate;

    invoke-virtual {v9, v2, v4}, Landroidx/lifecycle/p;->i(Ljava/lang/String;Ljava/lang/Object;)LtP5;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->googlePayState:LtP5;

    invoke-static {v3}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_stripeIntent:LGX2;

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->stripeIntent:LtP5;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->supportedPaymentMethods:Ljava/util/List;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v5

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_supportedPaymentMethodsFlow:LGX2;

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->supportedPaymentMethodsFlow:LtP5;

    const-string v5, "customer_payment_methods"

    invoke-virtual {v9, v5, v3}, Landroidx/lifecycle/p;->i(Ljava/lang/String;Ljava/lang/Object;)LtP5;

    move-result-object v5

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->paymentMethods:LtP5;

    invoke-static {v3}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v5

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_amount:LGX2;

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->amount:LtP5;

    const-string v5, "saved_selection"

    invoke-virtual {v9, v5, v3}, Landroidx/lifecycle/p;->i(Ljava/lang/String;Ljava/lang/Object;)LtP5;

    move-result-object v5

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->savedSelection:LtP5;

    sget-object v5, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v6

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->backStack:LGX2;

    new-instance v7, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$special$$inlined$map$1;

    invoke-direct {v7, v6}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$special$$inlined$map$1;-><init>(LEu1;)V

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v6

    sget-object v8, Ljz5;->a:Ljz5$a;

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x3

    const/16 v16, 0x0

    move-object/from16 p2, v8

    move-wide/from16 p3, v11

    move-wide/from16 p5, v13

    move/from16 p7, v15

    move-object/from16 p8, v16

    invoke-static/range {p2 .. p8}, Ljz5$a;->b(Ljz5$a;JJILjava/lang/Object;)Ljz5;

    move-result-object v11

    invoke-static {v7, v6, v11, v5}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object v5

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->currentScreen:LtP5;

    invoke-virtual/range {p10 .. p10}, Lcom/stripe/android/paymentsheet/LinkHandler;->isLinkEnabled()LtP5;

    move-result-object v6

    invoke-static {v6}, LVu1;->v(LEu1;)LEu1;

    move-result-object v6

    invoke-static {v4}, LVu1;->v(LEu1;)LEu1;

    move-result-object v4

    new-instance v7, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$headerText$1;

    invoke-direct {v7, v0, v3}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$headerText$1;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-static {v5, v6, v2, v4, v7}, LVu1;->l(LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function5;)LEu1;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->headerText:LEu1;

    const-string v2, "selection"

    invoke-virtual {v9, v2, v3}, Landroidx/lifecycle/p;->i(Ljava/lang/String;Ljava/lang/Object;)LtP5;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->selection:LtP5;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_editing:LGX2;

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->editing:LtP5;

    const-string v5, "processing"

    invoke-virtual {v9, v5, v2}, Landroidx/lifecycle/p;->i(Ljava/lang/String;Ljava/lang/Object;)LtP5;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->processing:LtP5;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v5

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_contentVisible:LGX2;

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->contentVisible:LtP5;

    invoke-static {v3}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v5

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_primaryButtonState:LGX2;

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->primaryButtonState:LtP5;

    invoke-static {v3}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v5

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->customPrimaryButtonUiState:LGX2;

    invoke-static {v3}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v5

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_notesText:LGX2;

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->notesText:LtP5;

    new-instance v5, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$buttonsEnabled$1;

    invoke-direct {v5, v3}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$buttonsEnabled$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v2, v4, v5}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v2

    invoke-static {v2}, LVu1;->p(LEu1;)LEu1;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->buttonsEnabled:LEu1;

    new-instance v2, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Landroid/app/Application;)V

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->paymentOptionsStateMapper$delegate:Lkotlin/Lazy;

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPaymentOptionsStateMapper()Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->invoke()LEu1;

    move-result-object v1

    invoke-static {v1}, LVu1;->v(LEu1;)LEu1;

    move-result-object v1

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v2

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v9, 0x3

    const/4 v10, 0x0

    move-object/from16 p1, v8

    move-wide/from16 p2, v4

    move-wide/from16 p4, v6

    move/from16 p6, v9

    move-object/from16 p7, v10

    invoke-static/range {p1 .. p7}, Ljz5$a;->b(Ljz5$a;JJILjava/lang/Object;)Ljz5;

    move-result-object v4

    new-instance v5, Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    const/4 v6, 0x0

    const/4 v7, 0x3

    invoke-direct {v5, v3, v6, v7, v3}, Lcom/stripe/android/paymentsheet/PaymentOptionsState;-><init>(Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v2, v4, v5}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->paymentOptionsState:LtP5;

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$1;

    invoke-direct {v5, v0, v3}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$1;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object/from16 p1, v1

    move-object/from16 p2, v2

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move/from16 p5, v6

    move-object/from16 p6, v7

    invoke-static/range {p1 .. p6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    new-instance v5, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$2;

    invoke-direct {v5, v0, v3}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$2;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v3, 0x3

    const/4 v6, 0x0

    move-object/from16 p1, v1

    move-object/from16 p4, v5

    move/from16 p5, v3

    move-object/from16 p6, v6

    invoke-static/range {p1 .. p6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    and-int/lit8 v0, p12, 0x20

    if-eqz v0, :cond_0

    invoke-static {}, LT41;->b()LSC0;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :cond_0
    move-object/from16 v7, p6

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;-><init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;)V

    return-void
.end method

.method public static final synthetic access$getSavedSelection$p(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)LtP5;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->savedSelection:LtP5;

    return-object p0
.end method

.method public static final synthetic access$mapToHeaderTextResource(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/state/GooglePayState;Lcom/stripe/android/model/StripeIntent;)Ljava/lang/Integer;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->mapToHeaderTextResource(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/state/GooglePayState;Lcom/stripe/android/model/StripeIntent;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private final getPaymentOptionsStateMapper()Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->paymentOptionsStateMapper$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;

    return-object v0
.end method

.method private final mapToHeaderTextResource(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/state/GooglePayState;Lcom/stripe/android/model/StripeIntent;)Ljava/lang/Integer;
    .locals 1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->headerTextFactory:Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;

    if-nez p2, :cond_1

    instance-of p2, p3, Lcom/stripe/android/paymentsheet/state/GooglePayState$Available;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    :goto_1
    instance-of p3, p4, Lcom/stripe/android/model/PaymentIntent;

    invoke-interface {p4}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object p4

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;->create(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZZLjava/util/List;)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return-object p1
.end method

.method public static synthetic onError$default(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Ljava/lang/Integer;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->onError(Ljava/lang/Integer;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onError"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic onError$default(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->onError(Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onError"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final onUserBack()V
    .locals 4

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->clearErrorMessages()V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->backStack:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/List;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->dropLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->paymentOptionsState:LtP5;

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsState;->getSelectedItem()Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt;->toPaymentSelection(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    return-void
.end method

.method private final updateLinkPrimaryButtonUiState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->customPrimaryButtonUiState:LGX2;

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final warnUnactivatedIfNeeded(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->warning(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public abstract clearErrorMessages()V
.end method

.method public final createFormArguments(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Z)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;
    .locals 9

    const-string v0, "selectedItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->stripeIntent:LtP5;

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/model/StripeIntent;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->merchantName:Ljava/lang/String;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->amount:LtP5;

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/ui/core/Amount;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getNewPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object v7

    move-object v2, p1

    move v8, p2

    invoke-virtual/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;->create(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Ljava/lang/String;Lcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;Z)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getAmount$paymentsheet_release()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/ui/core/Amount;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->amount:LtP5;

    return-object v0
.end method

.method public final getBackStack()LGX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGX2<",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->backStack:LGX2;

    return-object v0
.end method

.method public final getButtonsEnabled()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->buttonsEnabled:LEu1;

    return-object v0
.end method

.method public final getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    return-object v0
.end method

.method public final getContentVisible$paymentsheet_release()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->contentVisible:LtP5;

    return-object v0
.end method

.method public final getCurrentScreen()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->currentScreen:LtP5;

    return-object v0
.end method

.method public final getCustomPrimaryButtonUiState()LGX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGX2<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->customPrimaryButtonUiState:LGX2;

    return-object v0
.end method

.method public final getCustomerConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->customerConfig:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    return-object v0
.end method

.method public final getCustomerRepository()Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    return-object v0
.end method

.method public final getEditing$paymentsheet_release()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->editing:LtP5;

    return-object v0
.end method

.method public final getEventReporter$paymentsheet_release()Lcom/stripe/android/paymentsheet/analytics/EventReporter;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    return-object v0
.end method

.method public final getGooglePayState$paymentsheet_release()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/state/GooglePayState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->googlePayState:LtP5;

    return-object v0
.end method

.method public final getHeaderText$paymentsheet_release()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->headerText:LEu1;

    return-object v0
.end method

.method public final getInjector()Lcom/stripe/android/core/injection/NonFallbackInjector;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "injector"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->linkHandler:Lcom/stripe/android/paymentsheet/LinkHandler;

    return-object v0
.end method

.method public final getLogger()Lcom/stripe/android/core/Logger;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object v0
.end method

.method public final getLpmRepository()Lcom/stripe/android/ui/core/forms/resources/LpmRepository;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->lpmRepository:Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    return-object v0
.end method

.method public final getLpmServerSpec$paymentsheet_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->lpmServerSpec:Ljava/lang/String;

    return-object v0
.end method

.method public final getMerchantName$paymentsheet_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMostRecentError()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->mostRecentError:Ljava/lang/Throwable;

    return-object v0
.end method

.method public abstract getNewPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;
.end method

.method public final getNotesText$paymentsheet_release()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->notesText:LtP5;

    return-object v0
.end method

.method public final getPaymentMethods$paymentsheet_release()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->paymentMethods:LtP5;

    return-object v0
.end method

.method public final getPaymentOptionsState()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->paymentOptionsState:LtP5;

    return-object v0
.end method

.method public final getPrefsRepository()Lcom/stripe/android/paymentsheet/PrefsRepository;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->prefsRepository:Lcom/stripe/android/paymentsheet/PrefsRepository;

    return-object v0
.end method

.method public final getPrimaryButtonState()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->primaryButtonState:LtP5;

    return-object v0
.end method

.method public abstract getPrimaryButtonUiState()LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;"
        }
    .end annotation
.end method

.method public final getProcessing()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->processing:LtP5;

    return-object v0
.end method

.method public final getSavedStateHandle()Landroidx/lifecycle/p;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    return-object v0
.end method

.method public final getSelection$paymentsheet_release()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->selection:LtP5;

    return-object v0
.end method

.method public abstract getShouldCompleteLinkFlowInline()Z
.end method

.method public final getStripeIntent$paymentsheet_release()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->stripeIntent:LtP5;

    return-object v0
.end method

.method public final getSupportedPaymentMethods$paymentsheet_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->supportedPaymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getSupportedPaymentMethodsFlow()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->supportedPaymentMethodsFlow:LtP5;

    return-object v0
.end method

.method public final getWorkContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public final handleBackPressed()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->processing:LtP5;

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->backStack:LGX2;

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->onUserBack()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->onUserCancel()V

    :goto_0
    return-void
.end method

.method public abstract handlePaymentMethodSelected(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
.end method

.method public abstract onError(Ljava/lang/Integer;)V
.end method

.method public abstract onError(Ljava/lang/String;)V
.end method

.method public abstract onFatal(Ljava/lang/Throwable;)V
.end method

.method public abstract onFinish()V
.end method

.method public abstract onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
.end method

.method public abstract onUserCancel()V
.end method

.method public final payWithLinkInline(Lcom/stripe/android/link/ui/inline/UserInput;)V
    .locals 6

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$payWithLinkInline$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$payWithLinkInline$1;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 6

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$removePaymentMethod$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$removePaymentMethod$1;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final reportNavigationEvent(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V
    .locals 4

    const-string v0, "currentScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->linkHandler:Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/LinkHandler;->isLinkEnabled()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->linkHandler:Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/LinkHandler;->getActiveLinkSession()LtP5;

    move-result-object v2

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->stripeIntent:LtP5;

    invoke-interface {v3}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/model/StripeIntent;

    if-eqz v3, :cond_0

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/model/IntentKt;->getCurrency(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-interface {p1, v0, v2, v1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onShowExistingPaymentOptions(ZZLjava/lang/String;)V

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddFirstPaymentMethod;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddFirstPaymentMethod;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddAnotherPaymentMethod;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddAnotherPaymentMethod;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->linkHandler:Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/LinkHandler;->isLinkEnabled()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->linkHandler:Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/LinkHandler;->getActiveLinkSession()LtP5;

    move-result-object v2

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->stripeIntent:LtP5;

    invoke-interface {v3}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/model/StripeIntent;

    if-eqz v3, :cond_3

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/model/IntentKt;->getCurrency(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-interface {p1, v0, v2, v1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onShowNewPaymentOptionForm(ZZLjava/lang/String;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final resetUSBankPrimaryButton()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->customPrimaryButtonUiState:LGX2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setContentVisible(Z)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_contentVisible:LGX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setInjector(Lcom/stripe/android/core/injection/NonFallbackInjector;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

    return-void
.end method

.method public final setLpmServerSpec$paymentsheet_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->lpmServerSpec:Ljava/lang/String;

    return-void
.end method

.method public final setMostRecentError(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->mostRecentError:Ljava/lang/Throwable;

    return-void
.end method

.method public abstract setNewPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V
.end method

.method public final setStripeIntent(Lcom/stripe/android/model/StripeIntent;)V
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_stripeIntent:LGX2;

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->lpmRepository:Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    invoke-static {p1, v0, v1}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->getPMsToAdd(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setSupportedPaymentMethods$paymentsheet_release(Ljava/util/List;)V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->supportedPaymentMethods:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->lpmRepository:Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "None of the requested payment methods ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ") match the supported payment types ("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->onFatal(Ljava/lang/Throwable;)V

    :cond_1
    instance-of v0, p1, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v0, :cond_4

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_amount:LGX2;

    new-instance v1, Lcom/stripe/android/ui/core/Amount;

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {v2}, Lcom/stripe/android/model/PaymentIntent;->getAmount()Ljava/lang/Long;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, "Required value was null."

    if-eqz v2, :cond_3

    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {v2}, Lcom/stripe/android/model/PaymentIntent;->getCurrency()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-direct {v1, v4, v5, v2}, Lcom/stripe/android/ui/core/Amount;-><init>(JLjava/lang/String;)V

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PaymentIntent must contain amount and currency."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->onFatal(Ljava/lang/Throwable;)V

    :cond_4
    if-eqz p1, :cond_5

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getUnactivatedPaymentMethods()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->warnUnactivatedIfNeeded(Ljava/util/List;)V

    :cond_5
    return-void
.end method

.method public final setSupportedPaymentMethods$paymentsheet_release(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->supportedPaymentMethods:Ljava/util/List;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_supportedPaymentMethodsFlow:LGX2;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1}, LBX2;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public final toggleEditing()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_editing:LGX2;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->editing:LtP5;

    invoke-interface {v1}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final transitionTo(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V
    .locals 4

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->clearErrorMessages()V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->backStack:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    sget-object v3, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->minus(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->reportNavigationEvent(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V

    return-void
.end method

.method public final transitionToAddPaymentScreen()V
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddAnotherPaymentMethod;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddAnotherPaymentMethod;

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->transitionTo(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V

    return-void
.end method

.method public abstract transitionToFirstScreen()V
.end method

.method public final updateBelowButtonText(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_notesText:LGX2;

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final updateCustomPrimaryButtonUiState(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;)V"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->customPrimaryButtonUiState:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final updatePrimaryButtonForLinkInline()V
    .locals 5

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPrimaryButtonUiState()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getLabel()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$updatePrimaryButtonForLinkInline$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$updatePrimaryButtonForLinkInline$1;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)V

    const/4 v3, 0x1

    instance-of v4, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZ)V

    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updateLinkPrimaryButtonUiState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)V

    return-void
.end method

.method public final updatePrimaryButtonForLinkSignup(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V
    .locals 4

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPrimaryButtonUiState()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getUseLink()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getUserInput()Lcom/stripe/android/link/ui/inline/UserInput;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->selection:LtP5;

    invoke-interface {v1}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    if-eqz p1, :cond_1

    if-eqz v1, :cond_1

    new-instance v1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getLabel()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$updatePrimaryButtonForLinkSignup$1;

    invoke-direct {v2, p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$updatePrimaryButtonForLinkSignup$1;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/link/ui/inline/UserInput;)V

    const/4 p1, 0x1

    instance-of v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-direct {v1, v0, v2, p1, v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZ)V

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getLabel()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$updatePrimaryButtonForLinkSignup$2;->INSTANCE:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$updatePrimaryButtonForLinkSignup$2;

    const/4 v2, 0x0

    instance-of v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-direct {v1, p1, v0, v2, v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZ)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updateLinkPrimaryButtonUiState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)V

    return-void
.end method

.method public final updatePrimaryButtonState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->_primaryButtonState:LGX2;

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 2

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setNewPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    const-string v1, "selection"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lie;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-string v1, "getApplication()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection;->mandateText(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updateBelowButtonText(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->clearErrorMessages()V

    return-void
.end method
