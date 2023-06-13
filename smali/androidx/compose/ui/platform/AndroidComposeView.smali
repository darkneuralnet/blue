.class public final Landroidx/compose/ui/platform/AndroidComposeView;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements LjD3;
.implements Landroidx/compose/ui/platform/l;
.implements LDY3;
.implements LVX0;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor",
        "VisibleForTests"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/AndroidComposeView$a;,
        Landroidx/compose/ui/platform/AndroidComposeView$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f8\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0002\u0083\u0003\u0008\u0001\u0018\u0000 y2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002SeB\u0013\u0012\u0008\u0010\u00a5\u0003\u001a\u00030\u00a4\u0003\u00a2\u0006\u0006\u0008\u00a6\u0003\u0010\u00a7\u0003J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u000c\u0010\r\u001a\u00020\u000c*\u00020\tH\u0002J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0008\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J \u0010 \u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008 \u0010\u001cJ*\u0010%\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\u0008\u0008\u0002\u0010$\u001a\u00020\u000cH\u0002J\u0010\u0010&\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\u0008\u0010\'\u001a\u00020\u0007H\u0002J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\u0008\u0010)\u001a\u00020\u0007H\u0002J\u0008\u0010*\u001a\u00020\u000cH\u0002J\u0010\u0010+\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010,\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u001a\u00100\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.H\u0002J\u0010\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u000201H\u0016J\u0010\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u000204H\u0016J\"\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u000c2\u0006\u00108\u001a\u00020\u000e2\u0008\u00109\u001a\u0004\u0018\u000101H\u0014J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u000cH\u0016J\u001d\u0010?\u001a\u00020\u000c2\u0006\u0010>\u001a\u00020=H\u0016\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008?\u0010@J\u0010\u0010B\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020AH\u0016J\u0010\u0010C\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010D\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0006\u0010E\u001a\u00020\u0007J\u0008\u0010F\u001a\u00020\u0007H\u0016J\u0016\u0010I\u001a\u00020\u00072\u000c\u0010H\u001a\u0008\u0012\u0004\u0012\u00020\u00070GH\u0016J\u0016\u0010M\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\tJ\u000e\u0010N\u001a\u00020\u00072\u0006\u0010K\u001a\u00020JJ\u0016\u0010Q\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\u0006\u0010P\u001a\u00020OJ\u0010\u0010S\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u000cH\u0016J%\u0010V\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\t2\u0006\u0010U\u001a\u00020TH\u0016\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008V\u0010WJ\u0010\u0010X\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\tH\u0016J \u0010[\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\u000c2\u0006\u0010Z\u001a\u00020\u000cH\u0016J \u0010\\\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\u000c2\u0006\u0010Z\u001a\u00020\u000cH\u0016J\u0010\u0010]\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\tH\u0016J\u0018\u0010`\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u000eH\u0014J0\u0010f\u001a\u00020\u00072\u0006\u0010a\u001a\u00020\u000c2\u0006\u0010b\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020\u000eH\u0014J\u0010\u0010g\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0014J*\u0010m\u001a\u00020l2\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020\u00070h2\u000c\u0010k\u001a\u0008\u0012\u0004\u0012\u00020\u00070GH\u0016J\u0017\u0010o\u001a\u00020\u000c2\u0006\u0010n\u001a\u00020lH\u0000\u00a2\u0006\u0004\u0008o\u0010pJ\u0008\u0010q\u001a\u00020\u0007H\u0016J\u0010\u0010c\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\tH\u0016J\u0010\u0010s\u001a\u00020\u00072\u0006\u0010H\u001a\u00020rH\u0016J\u001f\u0010u\u001a\u0004\u0018\u00010t2\u0006\u0010>\u001a\u00020=H\u0016\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008u\u0010vJ\u0010\u0010w\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0014J\u001f\u0010y\u001a\u00020\u00072\u0006\u0010n\u001a\u00020l2\u0006\u0010x\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008y\u0010zJ\u001a\u0010}\u001a\u00020\u00072\u0012\u0010|\u001a\u000e\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u00070hJ\u0013\u0010~\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008~\u0010\u007fJ\t\u0010\u0080\u0001\u001a\u00020\u0007H\u0016J\t\u0010\u0081\u0001\u001a\u00020\u0007H\u0014J\t\u0010\u0082\u0001\u001a\u00020\u0007H\u0014J\u001e\u0010\u0086\u0001\u001a\u00020\u00072\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u000eH\u0016J\u001a\u0010\u008a\u0001\u001a\u00020\u00072\u000f\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u0087\u0001H\u0016J\u0011\u0010\u008b\u0001\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0011\u0010\u008c\u0001\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0011\u0010\u008d\u0001\u001a\u00020\u000c2\u0006\u00108\u001a\u00020\u000eH\u0016J\u0011\u0010\u008e\u0001\u001a\u00020\u000c2\u0006\u00108\u001a\u00020\u000eH\u0016J#\u0010\u0091\u0001\u001a\u00030\u008f\u00012\u0008\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0016\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u0008\u0091\u0001\u0010\u0092\u0001J#\u0010\u0094\u0001\u001a\u00030\u008f\u00012\u0008\u0010\u0093\u0001\u001a\u00030\u008f\u0001H\u0016\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u0008\u0094\u0001\u0010\u0092\u0001J\t\u0010\u0095\u0001\u001a\u00020\u000cH\u0016J\u0016\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00012\u0008\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0016J#\u0010\u009b\u0001\u001a\u00030\u008f\u00012\u0008\u0010\u009a\u0001\u001a\u00030\u008f\u0001H\u0016\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u0008\u009b\u0001\u0010\u0092\u0001J#\u0010\u009c\u0001\u001a\u00030\u008f\u00012\u0008\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0016\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u0008\u009c\u0001\u0010\u0092\u0001J\u0013\u0010\u009f\u0001\u001a\u00020\u00072\u0008\u0010\u009e\u0001\u001a\u00030\u009d\u0001H\u0014J\u0012\u0010\u00a1\u0001\u001a\u00020\u00072\u0007\u0010\u00a0\u0001\u001a\u00020\u000eH\u0016J\u0011\u0010\u00a2\u0001\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0011\u0010\u00a3\u0001\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020\u000eJ\t\u0010\u00a4\u0001\u001a\u00020\u000cH\u0016R\"\u0010\u00a6\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0007\n\u0005\u0008e\u0010\u00a5\u0001R\u0019\u0010\u00a9\u0001\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a7\u0001\u0010\u00a8\u0001R \u0010\u00af\u0001\u001a\u00030\u00aa\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001\u001a\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001R*\u0010\u00b4\u0001\u001a\u00030\u00b0\u00012\u0008\u0010\u00b1\u0001\u001a\u00030\u00b0\u00018\u0016@RX\u0096\u000e\u00a2\u0006\u000e\n\u0005\u0008C\u0010\u00b2\u0001\u001a\u0005\u0008e\u0010\u00b3\u0001R\u0018\u0010\u00b8\u0001\u001a\u00030\u00b5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001R \u0010\u00be\u0001\u001a\u00030\u00b9\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001\u001a\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001R\u0018\u0010\u00c2\u0001\u001a\u00030\u00bf\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001R\u0018\u0010\u00c6\u0001\u001a\u00030\u00c3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c4\u0001\u0010\u00c5\u0001R\u0018\u0010\u00c8\u0001\u001a\u00030\u00c3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c7\u0001\u0010\u00c5\u0001R\u0018\u0010\u00cc\u0001\u001a\u00030\u00c9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ca\u0001\u0010\u00cb\u0001R\u001e\u0010\u00d0\u0001\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008b\u0010\u00cd\u0001\u001a\u0006\u0008\u00ce\u0001\u0010\u00cf\u0001R \u0010\u00d6\u0001\u001a\u00030\u00d1\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00d2\u0001\u0010\u00d3\u0001\u001a\u0006\u0008\u00d4\u0001\u0010\u00d5\u0001R \u0010\u00dc\u0001\u001a\u00030\u00d7\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00d8\u0001\u0010\u00d9\u0001\u001a\u0006\u0008\u00da\u0001\u0010\u00db\u0001R\u0018\u0010\u00e0\u0001\u001a\u00030\u00dd\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00de\u0001\u0010\u00df\u0001R \u0010\u00e6\u0001\u001a\u00030\u00e1\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00e2\u0001\u0010\u00e3\u0001\u001a\u0006\u0008\u00e4\u0001\u0010\u00e5\u0001R\u001e\u0010\u00e9\u0001\u001a\t\u0012\u0004\u0012\u00020l0\u00e7\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0094\u0001\u0010\u00e8\u0001R!\u0010\u00ea\u0001\u001a\u000b\u0012\u0004\u0012\u00020l\u0018\u00010\u00e7\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008d\u0010\u00e8\u0001R\u0019\u0010\u00ec\u0001\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00eb\u0001\u0010\u00a8\u0001R\u0017\u0010\u00ef\u0001\u001a\u00030\u00ed\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008c\u0010\u00ee\u0001R\u0017\u0010\u00f2\u0001\u001a\u00030\u00f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008D\u0010\u00f1\u0001R6\u0010\u00f9\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u009d\u0001\u0012\u0004\u0012\u00020\u00070h8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00f3\u0001\u0010\u00f4\u0001\u001a\u0006\u0008\u00f5\u0001\u0010\u00f6\u0001\"\u0006\u0008\u00f7\u0001\u0010\u00f8\u0001R\u001a\u0010\u00fc\u0001\u001a\u0005\u0018\u00010\u00fa\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009b\u0001\u0010\u00fb\u0001R\u0018\u0010\u00fd\u0001\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008m\u0010\u00a8\u0001R\u001f\u0010\u0082\u0002\u001a\u00030\u00fe\u00018\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008F\u0010\u00ff\u0001\u001a\u0006\u0008\u0080\u0002\u0010\u0081\u0002R \u0010\u0087\u0002\u001a\u00030\u0083\u00028\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00e4\u0001\u0010\u0084\u0002\u001a\u0006\u0008\u0085\u0002\u0010\u0086\u0002R\u001f\u0010\u008c\u0002\u001a\u00030\u0088\u00028\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0006\u0008\u0089\u0002\u0010\u008a\u0002\u001a\u0005\u0008b\u0010\u008b\u0002R1\u0010\u0092\u0002\u001a\u00020\u000c8\u0016@\u0016X\u0096\u000e\u00a2\u0006 \n\u0006\u0008\u00bc\u0001\u0010\u00a8\u0001\u0012\u0006\u0008\u0090\u0002\u0010\u0091\u0002\u001a\u0006\u0008\u0089\u0002\u0010\u008d\u0002\"\u0006\u0008\u008e\u0002\u0010\u008f\u0002R\u001c\u0010\u0095\u0002\u001a\u0005\u0018\u00010\u0093\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009c\u0001\u0010\u0094\u0002R\u001c\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u0096\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0097\u0002\u0010\u0098\u0002R#\u0010\u009b\u0002\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0007\n\u0005\u0008s\u0010\u009a\u0002R\u0019\u0010\u009d\u0002\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009c\u0002\u0010\u00a8\u0001R\u0017\u0010\u00a0\u0002\u001a\u00030\u009e\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008]\u0010\u009f\u0002R \u0010\u00a5\u0002\u001a\u00030\u00a1\u00028\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00a2\u0002\u0010\u00a3\u0002\u001a\u0006\u0008\u00eb\u0001\u0010\u00a4\u0002R#\u0010\u00a8\u0002\u001a\u00030\u00a6\u00028\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0008\n\u0006\u0008\u00a7\u0002\u0010\u00a5\u0001R\u0018\u0010\u00ab\u0002\u001a\u00030\u00a9\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a5\u0001\u0010\u00aa\u0002R!\u0010\u00af\u0002\u001a\u00030\u00ac\u00028\u0002X\u0082\u0004\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0008\n\u0006\u0008\u00ad\u0002\u0010\u00ae\u0002R \u0010\u00b0\u0002\u001a\u00030\u00ac\u00028\u0002X\u0082\u0004\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0007\n\u0005\u0008[\u0010\u00ae\u0002R1\u0010\u00b6\u0002\u001a\u00020\"8\u0000@\u0000X\u0081\u000e\u00a2\u0006 \n\u0006\u0008\u00ad\u0001\u0010\u00a5\u0001\u0012\u0006\u0008\u00b5\u0002\u0010\u0091\u0002\u001a\u0006\u0008\u00b1\u0002\u0010\u00b2\u0002\"\u0006\u0008\u00b3\u0002\u0010\u00b4\u0002R\u0019\u0010\u00b8\u0002\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b7\u0002\u0010\u00a8\u0001R#\u0010\u00b9\u0002\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0008\n\u0006\u0008\u0091\u0001\u0010\u00a5\u0001R\u0018\u0010\u00ba\u0002\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008I\u0010\u00a8\u0001R7\u0010\u00c1\u0002\u001a\u0004\u0018\u00010{2\t\u0010\u00b1\u0001\u001a\u0004\u0018\u00010{8F@BX\u0086\u008e\u0002\u00a2\u0006\u0018\n\u0006\u0008\u00bb\u0002\u0010\u00bc\u0002\u001a\u0006\u0008\u00bd\u0002\u0010\u00be\u0002\"\u0006\u0008\u00bf\u0002\u0010\u00c0\u0002R\'\u0010\u00c3\u0002\u001a\u0010\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u0007\u0018\u00010h8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c2\u0002\u0010\u00f4\u0001R\u0017\u0010\u00c6\u0002\u001a\u00030\u00c4\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0008\u0010\u00c5\u0002R\u0017\u0010\u00c9\u0002\u001a\u00030\u00c7\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0011\u0010\u00c8\u0002R\u0017\u0010\u00cc\u0002\u001a\u00030\u00ca\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008Q\u0010\u00cb\u0002R\u001f\u0010\u00d1\u0002\u001a\u00030\u00cd\u00028\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u00080\u0010\u00ce\u0002\u001a\u0006\u0008\u00cf\u0002\u0010\u00d0\u0002R \u0010\u00d5\u0002\u001a\u00030\u00d2\u00028\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0085\u0002\u0010\u00d3\u0002\u001a\u0006\u0008\u00ad\u0002\u0010\u00d4\u0002R(\u0010\u00dc\u0002\u001a\u00030\u00d6\u00028\u0016X\u0097\u0004\u00a2\u0006\u0018\n\u0006\u0008\u00d7\u0002\u0010\u00d8\u0002\u0012\u0006\u0008\u00db\u0002\u0010\u0091\u0002\u001a\u0006\u0008\u00d9\u0002\u0010\u00da\u0002R5\u0010\u00e1\u0002\u001a\u00030\u00dd\u00022\u0008\u0010\u00b1\u0001\u001a\u00030\u00dd\u00028V@RX\u0096\u008e\u0002\u00a2\u0006\u0018\n\u0006\u0008\u0080\u0002\u0010\u00bc\u0002\u001a\u0006\u0008\u00a5\u0001\u0010\u00de\u0002\"\u0006\u0008\u00df\u0002\u0010\u00e0\u0002R\u0018\u0010\u00e2\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008u\u0010\u00a7\u0002R5\u0010\u00a0\u0001\u001a\u00030\u00e3\u00022\u0008\u0010\u00b1\u0001\u001a\u00030\u00e3\u00028V@RX\u0096\u008e\u0002\u00a2\u0006\u0018\n\u0006\u0008\u00e4\u0002\u0010\u00bc\u0002\u001a\u0006\u0008\u00e5\u0002\u0010\u00e6\u0002\"\u0006\u0008\u00e7\u0002\u0010\u00e8\u0002R \u0010\u00ec\u0002\u001a\u00030\u00e9\u00028\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00cf\u0002\u0010\u00ea\u0002\u001a\u0006\u0008\u00bb\u0002\u0010\u00eb\u0002R\u0018\u0010\u00ef\u0002\u001a\u00030\u00ed\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ce\u0001\u0010\u00ee\u0002R \u0010\u00f3\u0002\u001a\u00030\u00f0\u00028\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00da\u0001\u0010\u00f1\u0002\u001a\u0006\u0008\u00de\u0001\u0010\u00f2\u0002R \u0010\u00f8\u0002\u001a\u00030\u00f4\u00028\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00f5\u0002\u0010\u00f6\u0002\u001a\u0006\u0008\u00e2\u0001\u0010\u00f7\u0002R\u001b\u0010\u00fa\u0002\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00bd\u0002\u0010\u00f9\u0002R\u0019\u0010\u00fc\u0002\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00fb\u0002\u0010\u00a5\u0001R\u001d\u0010\u00ff\u0002\u001a\t\u0012\u0004\u0012\u00020l0\u00fd\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001b\u0010\u00fe\u0002R%\u0010\u0082\u0003\u001a\u0011\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010G0\u0080\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0018\u0010\u0081\u0003R\u0017\u0010\u0085\u0003\u001a\u00030\u0083\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001e\u0010\u0084\u0003R\u0018\u0010\u0088\u0003\u001a\u00030\u0086\u00038\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0080\u0001\u0010\u0087\u0003R\u0018\u0010\u0089\u0003\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0015\u0010\u00a8\u0001R\u001c\u0010\u008b\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00070G8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0014\u0010\u008a\u0003R\u0017\u0010\u008e\u0003\u001a\u00030\u008c\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008+\u0010\u008d\u0003R\u0018\u0010\u008f\u0003\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u001f\u0010\u00a8\u0001R\u001b\u0010\u0092\u0003\u001a\u0005\u0018\u00010\u0090\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008&\u0010\u0091\u0003R\u001f\u0010\u0096\u0003\u001a\u00030\u0093\u00038\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008,\u0010\u0094\u0003\u001a\u0006\u0008\u0097\u0002\u0010\u0095\u0003R\u001c\u0010\u0098\u0003\u001a\u00020\u000e*\u00030\u009d\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00e4\u0002\u0010\u0097\u0003R\u0016\u0010K\u001a\u00020.8VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00f5\u0002\u0010\u0099\u0003R\u0018\u0010\u009c\u0003\u001a\u00030\u009a\u00038VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b7\u0002\u0010\u009b\u0003R\u001a\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u009d\u00038VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b6\u0001\u0010\u009e\u0003R\u0018\u0010\u00a0\u0003\u001a\u00030\u0093\u00028@X\u0080\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00d7\u0002\u0010\u009f\u0003R\u0018\u0010\u00a3\u0003\u001a\u00030\u00a1\u00038VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00ca\u0001\u0010\u00a2\u0003\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u00a8\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/platform/AndroidComposeView;",
        "Landroid/view/ViewGroup;",
        "LjD3;",
        "Landroidx/compose/ui/platform/l;",
        "LDY3;",
        "LVX0;",
        "viewGroup",
        "",
        "p0",
        "LJm2;",
        "nodeToRemeasure",
        "V0",
        "",
        "o0",
        "",
        "measureSpec",
        "Lkotlin/Pair;",
        "q0",
        "h1",
        "node",
        "J0",
        "I0",
        "Landroid/view/MotionEvent;",
        "event",
        "F0",
        "motionEvent",
        "LP64;",
        "E0",
        "(Landroid/view/MotionEvent;)I",
        "lastEvent",
        "G0",
        "L0",
        "a1",
        "action",
        "",
        "eventTime",
        "forceHover",
        "b1",
        "M0",
        "P0",
        "Q0",
        "R0",
        "m0",
        "K0",
        "N0",
        "accessibilityId",
        "Landroid/view/View;",
        "currentView",
        "s0",
        "Landroid/graphics/Rect;",
        "rect",
        "getFocusedRect",
        "LLifecycleOwner;",
        "owner",
        "onResume",
        "gainFocus",
        "direction",
        "previouslyFocusedRect",
        "onFocusChanged",
        "hasWindowFocus",
        "onWindowFocusChanged",
        "Lik2;",
        "keyEvent",
        "Z0",
        "(Landroid/view/KeyEvent;)Z",
        "Landroid/view/KeyEvent;",
        "dispatchKeyEvent",
        "e",
        "u",
        "U0",
        "y",
        "Lkotlin/Function0;",
        "listener",
        "T",
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
        "view",
        "layoutNode",
        "l0",
        "T0",
        "Landroid/graphics/Canvas;",
        "canvas",
        "r0",
        "sendPointerUpdate",
        "a",
        "Lkz0;",
        "constraints",
        "O",
        "(LJm2;J)V",
        "N",
        "affectsLookahead",
        "forceRequest",
        "P",
        "L",
        "G",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "changed",
        "l",
        "t",
        "r",
        "b",
        "onLayout",
        "onDraw",
        "Lkotlin/Function1;",
        "Lme0;",
        "drawBlock",
        "invalidateParentLayer",
        "LiD3;",
        "x",
        "layer",
        "S0",
        "(LiD3;)Z",
        "V",
        "LjD3$b;",
        "E",
        "Landroidx/compose/ui/focus/c;",
        "w0",
        "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/c;",
        "dispatchDraw",
        "isDirty",
        "O0",
        "(LiD3;Z)V",
        "Landroidx/compose/ui/platform/AndroidComposeView$b;",
        "callback",
        "setOnViewTreeOwnersAvailable",
        "n0",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "H0",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "Landroid/view/ViewStructure;",
        "structure",
        "flags",
        "onProvideAutofillVirtualStructure",
        "Landroid/util/SparseArray;",
        "Landroid/view/autofill/AutofillValue;",
        "values",
        "autofill",
        "dispatchGenericMotionEvent",
        "dispatchTouchEvent",
        "canScrollHorizontally",
        "canScrollVertically",
        "LCe3;",
        "localPosition",
        "S",
        "(J)J",
        "positionOnScreen",
        "q",
        "onCheckIsTextEditor",
        "Landroid/view/inputmethod/EditorInfo;",
        "outAttrs",
        "Landroid/view/inputmethod/InputConnection;",
        "onCreateInputConnection",
        "positionInWindow",
        "w",
        "C",
        "Landroid/content/res/Configuration;",
        "newConfig",
        "onConfigurationChanged",
        "layoutDirection",
        "onRtlPropertiesChanged",
        "dispatchHoverEvent",
        "findViewByAccessibilityIdTraversal",
        "shouldDelayChildPressedState",
        "J",
        "lastDownPointerPosition",
        "c",
        "Z",
        "superclassInitComplete",
        "LLm2;",
        "d",
        "LLm2;",
        "Q",
        "()LLm2;",
        "sharedDrawScope",
        "Lg01;",
        "<set-?>",
        "Lg01;",
        "()Lg01;",
        "density",
        "Les5;",
        "f",
        "Les5;",
        "semanticsModifier",
        "LQv1;",
        "g",
        "LQv1;",
        "B",
        "()LQv1;",
        "focusOwner",
        "LoB6;",
        "h",
        "LoB6;",
        "_windowInfo",
        "LgV2;",
        "i",
        "LgV2;",
        "keyInputModifier",
        "j",
        "rotaryInputModifier",
        "Lqe0;",
        "k",
        "Lqe0;",
        "canvasHolder",
        "LJm2;",
        "z0",
        "()LJm2;",
        "root",
        "LLb5;",
        "m",
        "LLb5;",
        "getRootForTest",
        "()LLb5;",
        "rootForTest",
        "Lls5;",
        "n",
        "Lls5;",
        "A0",
        "()Lls5;",
        "semanticsOwner",
        "Landroidx/compose/ui/platform/f;",
        "o",
        "Landroidx/compose/ui/platform/f;",
        "accessibilityDelegate",
        "LQu;",
        "p",
        "LQu;",
        "z",
        "()LQu;",
        "autofillTree",
        "",
        "Ljava/util/List;",
        "dirtyLayers",
        "postponedDirtyLayers",
        "s",
        "isDrawingContent",
        "LRV2;",
        "LRV2;",
        "motionEventAdapter",
        "LnX3;",
        "LnX3;",
        "pointerInputEventProcessor",
        "v",
        "Lkotlin/jvm/functions/Function1;",
        "getConfigurationChangeObserver",
        "()Lkotlin/jvm/functions/Function1;",
        "setConfigurationChangeObserver",
        "(Lkotlin/jvm/functions/Function1;)V",
        "configurationChangeObserver",
        "Lrb;",
        "Lrb;",
        "_autofill",
        "observationClearRequested",
        "Ldc;",
        "Ldc;",
        "v0",
        "()Ldc;",
        "clipboardManager",
        "Ljb;",
        "Ljb;",
        "t0",
        "()Ljb;",
        "accessibilityManager",
        "LmD3;",
        "A",
        "LmD3;",
        "()LmD3;",
        "snapshotObserver",
        "()Z",
        "setShowLayoutBounds",
        "(Z)V",
        "getShowLayoutBounds$annotations",
        "()V",
        "showLayoutBounds",
        "Landroidx/compose/ui/platform/AndroidViewsHandler;",
        "Landroidx/compose/ui/platform/AndroidViewsHandler;",
        "_androidViewsHandler",
        "Landroidx/compose/ui/platform/DrawChildContainer;",
        "D",
        "Landroidx/compose/ui/platform/DrawChildContainer;",
        "viewLayersContainer",
        "Lkz0;",
        "onMeasureConstraints",
        "F",
        "wasMeasuredWithMultipleConstraints",
        "LwO2;",
        "LwO2;",
        "measureAndLayoutDelegate",
        "LJq6;",
        "H",
        "LJq6;",
        "()LJq6;",
        "viewConfiguration",
        "LA52;",
        "I",
        "globalPosition",
        "",
        "[I",
        "tmpPositionArray",
        "LhN2;",
        "K",
        "[F",
        "viewToWindowMatrix",
        "windowToViewMatrix",
        "getLastMatrixRecalculationAnimationTime$ui_release",
        "()J",
        "setLastMatrixRecalculationAnimationTime$ui_release",
        "(J)V",
        "getLastMatrixRecalculationAnimationTime$ui_release$annotations",
        "lastMatrixRecalculationAnimationTime",
        "R",
        "forceUseMatrixCache",
        "windowPosition",
        "isRenderNodeCompatible",
        "U",
        "LEX2;",
        "C0",
        "()Landroidx/compose/ui/platform/AndroidComposeView$b;",
        "f1",
        "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V",
        "viewTreeOwners",
        "W",
        "onViewTreeOwnersAvailable",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "globalLayoutListener",
        "Landroid/view/ViewTreeObserver$OnScrollChangedListener;",
        "Landroid/view/ViewTreeObserver$OnScrollChangedListener;",
        "scrollChangedListener",
        "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;",
        "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;",
        "touchModeChangeListener",
        "LjW3;",
        "LjW3;",
        "y0",
        "()LjW3;",
        "platformTextInputPluginRegistry",
        "LU16;",
        "LU16;",
        "()LU16;",
        "textInputService",
        "Lew1$b;",
        "u0",
        "Lew1$b;",
        "M",
        "()Lew1$b;",
        "getFontLoader$annotations",
        "fontLoader",
        "Lkw1$b;",
        "()Lkw1$b;",
        "d1",
        "(Lkw1$b;)V",
        "fontFamilyResolver",
        "currentFontWeightAdjustment",
        "Lpm2;",
        "x0",
        "getLayoutDirection",
        "()Lpm2;",
        "e1",
        "(Lpm2;)V",
        "LWE1;",
        "LWE1;",
        "()LWE1;",
        "hapticFeedBack",
        "Ln32;",
        "Ln32;",
        "_inputModeManager",
        "LkV2;",
        "LkV2;",
        "()LkV2;",
        "modifierLocalManager",
        "LI26;",
        "B0",
        "LI26;",
        "()LI26;",
        "textToolbar",
        "Landroid/view/MotionEvent;",
        "previousMotionEvent",
        "D0",
        "relayoutTime",
        "Luz6;",
        "Luz6;",
        "layerCache",
        "LLX2;",
        "LLX2;",
        "endApplyChangesListeners",
        "androidx/compose/ui/platform/AndroidComposeView$l",
        "Landroidx/compose/ui/platform/AndroidComposeView$l;",
        "resendMotionEventRunnable",
        "Ljava/lang/Runnable;",
        "Ljava/lang/Runnable;",
        "sendHoverExitEvent",
        "hoverExitReceived",
        "Lkotlin/jvm/functions/Function0;",
        "resendMotionEventOnLayout",
        "Ll80;",
        "Ll80;",
        "matrixToWindow",
        "keyboardModifiersRequireUpdate",
        "LdX3;",
        "LdX3;",
        "desiredPointerIcon",
        "LgX3;",
        "LgX3;",
        "()LgX3;",
        "pointerIconService",
        "(Landroid/content/res/Configuration;)I",
        "fontWeightAdjustmentCompat",
        "()Landroid/view/View;",
        "LnB6;",
        "()LnB6;",
        "windowInfo",
        "Lzu;",
        "()Lzu;",
        "()Landroidx/compose/ui/platform/AndroidViewsHandler;",
        "androidViewsHandler",
        "Lm32;",
        "()Lm32;",
        "inputModeManager",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "ui_release"
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
        "SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 6 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 9 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1941:1\n1182#2:1942\n1161#2,2:1943\n76#3:1945\n102#3,2:1946\n76#3:1948\n102#3,2:1949\n76#3:1951\n102#3,2:1952\n523#4:1954\n728#4,2:1955\n460#4,11:1979\n460#4,11:1991\n26#5,5:1957\n26#5,5:1962\n26#5,5:1967\n26#5,5:2006\n47#6,5:1972\n1#7:1977\n163#8:1978\n163#8:1990\n20#9,2:2002\n20#9,2:2004\n533#10,6:2011\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n481#1:1942\n481#1:1943,2\n348#1:1945\n348#1:1946,2\n405#1:1948\n405#1:1949,2\n419#1:1951\n419#1:1952,2\n673#1:1954\n686#1:1955,2\n1115#1:1979,11\n1123#1:1991,11\n803#1:1957,5\n814#1:1962,5\n864#1:1967,5\n1273#1:2006,5\n1041#1:1972,5\n1115#1:1978\n1123#1:1990\n1135#1:2002,2\n1190#1:2004,2\n1357#1:2011,6\n*E\n"
    }
.end annotation


# static fields
.field public static final O0:Landroidx/compose/ui/platform/AndroidComposeView$a;

.field public static P0:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static Q0:Ljava/lang/reflect/Method;


# instance fields
.field public final A:LmD3;

.field public final A0:LkV2;

.field public B:Z

.field public final B0:LI26;

.field public C:Landroidx/compose/ui/platform/AndroidViewsHandler;

.field public C0:Landroid/view/MotionEvent;

.field public D:Landroidx/compose/ui/platform/DrawChildContainer;

.field public D0:J

.field public E:Lkz0;

.field public final E0:Luz6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Luz6<",
            "LiD3;",
            ">;"
        }
    .end annotation
.end field

.field public F:Z

.field public final F0:LLX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LLX2<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field public final G:LwO2;

.field public final G0:Landroidx/compose/ui/platform/AndroidComposeView$l;

.field public final H:LJq6;

.field public final H0:Ljava/lang/Runnable;

.field public I:J

.field public I0:Z

.field public final J:[I

.field public final J0:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final K:[F

.field public final K0:Ll80;

.field public L0:Z

.field public M0:LdX3;

.field public final N0:LgX3;

.field public final P:[F

.field public Q:J

.field public R:Z

.field public S:J

.field public T:Z

.field public final U:LEX2;

.field public W:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/platform/AndroidComposeView$b;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public b:J

.field public c:Z

.field public final d:LLm2;

.field public e:Lg01;

.field public final f:Les5;

.field public final g:LQv1;

.field public final h:LoB6;

.field public final i:LgV2;

.field public final j:LgV2;

.field public final k:Lqe0;

.field public final l:LJm2;

.field public final m:LLb5;

.field public final n:Lls5;

.field public final o:Landroidx/compose/ui/platform/f;

.field public final p:LQu;

.field public final p0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LiD3;",
            ">;"
        }
    .end annotation
.end field

.field public final q0:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field public r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LiD3;",
            ">;"
        }
    .end annotation
.end field

.field public final r0:Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;

.field public s:Z

.field public final s0:LjW3;

.field public final t:LRV2;

.field public final t0:LU16;

.field public final u:LnX3;

.field public final u0:Lew1$b;

.field public v:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/res/Configuration;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final v0:LEX2;

.field public final w:Lrb;

.field public w0:I

.field public x:Z

.field public final x0:LEX2;

.field public final y:Ldc;

.field public final y0:LWE1;

.field public final z:Ljb;

.field public final z0:Ln32;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/AndroidComposeView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->O0:Landroidx/compose/ui/platform/AndroidComposeView$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 11

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    sget-object v0, LCe3;->b:LCe3$a;

    invoke-virtual {v0}, LCe3$a;->b()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b:J

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c:Z

    new-instance v2, LLm2;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v1, v3}, LLm2;-><init>(Loe0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d:LLm2;

    invoke-static {p1}, LAc;->a(Landroid/content/Context;)Lg01;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e:Lg01;

    new-instance v2, Les5;

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v7, Landroidx/compose/ui/platform/AndroidComposeView$n;->g:Landroidx/compose/ui/platform/AndroidComposeView$n;

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, Les5;-><init>(ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->f:Les5;

    new-instance v4, Landroidx/compose/ui/focus/FocusOwnerImpl;

    new-instance v5, Landroidx/compose/ui/platform/AndroidComposeView$f;

    invoke-direct {v5, p0}, Landroidx/compose/ui/platform/AndroidComposeView$f;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    invoke-direct {v4, v5}, Landroidx/compose/ui/focus/FocusOwnerImpl;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g:LQv1;

    new-instance v4, LoB6;

    invoke-direct {v4}, LoB6;-><init>()V

    iput-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h:LoB6;

    sget-object v4, LgV2;->b0:LgV2$a;

    new-instance v5, Landroidx/compose/ui/platform/AndroidComposeView$g;

    invoke-direct {v5, p0}, Landroidx/compose/ui/platform/AndroidComposeView$g;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    invoke-static {v4, v5}, Lqk2;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v5

    iput-object v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i:LgV2;

    sget-object v6, Landroidx/compose/ui/platform/AndroidComposeView$m;->g:Landroidx/compose/ui/platform/AndroidComposeView$m;

    invoke-static {v4, v6}, LNb5;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v6

    iput-object v6, p0, Landroidx/compose/ui/platform/AndroidComposeView;->j:LgV2;

    new-instance v7, Lqe0;

    invoke-direct {v7}, Lqe0;-><init>()V

    iput-object v7, p0, Landroidx/compose/ui/platform/AndroidComposeView;->k:Lqe0;

    new-instance v7, LJm2;

    const/4 v8, 0x3

    const/4 v9, 0x0

    invoke-direct {v7, v9, v9, v8, v3}, LJm2;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v8, LMb5;->b:LMb5;

    invoke-virtual {v7, v8}, LJm2;->o(LxO2;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->b()Lg01;

    move-result-object v8

    invoke-virtual {v7, v8}, LJm2;->k(Lg01;)V

    invoke-virtual {v4, v2}, LgV2$a;->t0(LgV2;)LgV2;

    move-result-object v2

    invoke-interface {v2, v6}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->B()LQv1;

    move-result-object v4

    invoke-interface {v4}, LQv1;->f()LgV2;

    move-result-object v4

    invoke-interface {v2, v4}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v2

    invoke-interface {v2, v5}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v2

    invoke-virtual {v7, v2}, LJm2;->p(LgV2;)V

    iput-object v7, p0, Landroidx/compose/ui/platform/AndroidComposeView;->l:LJm2;

    iput-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->m:LLb5;

    new-instance v2, Lls5;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object v4

    invoke-direct {v2, v4}, Lls5;-><init>(LJm2;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->n:Lls5;

    new-instance v2, Landroidx/compose/ui/platform/f;

    invoke-direct {v2, p0}, Landroidx/compose/ui/platform/f;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o:Landroidx/compose/ui/platform/f;

    new-instance v4, LQu;

    invoke-direct {v4}, LQu;-><init>()V

    iput-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->p:LQu;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q:Ljava/util/List;

    new-instance v4, LRV2;

    invoke-direct {v4}, LRV2;-><init>()V

    iput-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t:LRV2;

    new-instance v4, LnX3;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object v5

    invoke-direct {v4, v5}, LnX3;-><init>(LJm2;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->u:LnX3;

    sget-object v4, Landroidx/compose/ui/platform/AndroidComposeView$e;->g:Landroidx/compose/ui/platform/AndroidComposeView$e;

    iput-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->m0()Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v4, Lrb;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z()LQu;

    move-result-object v5

    invoke-direct {v4, p0, v5}, Lrb;-><init>(Landroid/view/View;LQu;)V

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    iput-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Lrb;

    new-instance v4, Ldc;

    invoke-direct {v4, p1}, Ldc;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y:Ldc;

    new-instance v4, Ljb;

    invoke-direct {v4, p1}, Ljb;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z:Ljb;

    new-instance v4, LmD3;

    new-instance v5, Landroidx/compose/ui/platform/AndroidComposeView$o;

    invoke-direct {v5, p0}, Landroidx/compose/ui/platform/AndroidComposeView$o;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    invoke-direct {v4, v5}, LmD3;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A:LmD3;

    new-instance v4, LwO2;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object v5

    invoke-direct {v4, v5}, LwO2;-><init>(LJm2;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    new-instance v4, Lee;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v5

    const-string v6, "get(context)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v5}, Lee;-><init>(Landroid/view/ViewConfiguration;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->H:LJq6;

    const v4, 0x7fffffff

    invoke-static {v4, v4}, LB52;->a(II)J

    move-result-wide v4

    iput-wide v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I:J

    const/4 v4, 0x2

    new-array v5, v4, [I

    fill-array-data v5, :array_0

    iput-object v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:[I

    invoke-static {v3, v1, v3}, LhN2;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object v5

    iput-object v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->K:[F

    invoke-static {v3, v1, v3}, LhN2;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object v5

    iput-object v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->P:[F

    const-wide/16 v5, -0x1

    iput-wide v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q:J

    invoke-virtual {v0}, LCe3$a;->a()J

    move-result-wide v5

    iput-wide v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S:J

    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->T:Z

    invoke-static {v3, v3, v4, v3}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->U:LEX2;

    new-instance v0, Lhc;

    invoke-direct {v0, p0}, Lhc;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->p0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    new-instance v0, Lic;

    invoke-direct {v0, p0}, Lic;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q0:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    new-instance v0, Ljc;

    invoke-direct {v0, p0}, Ljc;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;

    new-instance v0, LjW3;

    new-instance v5, Landroidx/compose/ui/platform/AndroidComposeView$h;

    invoke-direct {v5, p0}, Landroidx/compose/ui/platform/AndroidComposeView$h;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    invoke-direct {v0, v5}, LjW3;-><init>(Lkotlin/jvm/functions/Function2;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->s0:LjW3;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->y0()LjW3;

    move-result-object v0

    sget-object v5, LPd;->a:LPd;

    invoke-virtual {v0, v5}, LjW3;->e(LhW3;)LjW3$a;

    move-result-object v0

    invoke-virtual {v0}, LjW3$a;->a()LgW3;

    move-result-object v0

    check-cast v0, LPd$a;

    invoke-virtual {v0}, LPd$a;->b()LU16;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t0:LU16;

    new-instance v0, LLc;

    invoke-direct {v0, p1}, LLc;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->u0:Lew1$b;

    invoke-static {p1}, Low1;->a(Landroid/content/Context;)Lkw1$b;

    move-result-object v0

    invoke-static {}, LGM5;->m()LEM5;

    move-result-object v5

    invoke-static {v0, v5}, LGM5;->g(Ljava/lang/Object;LEM5;)LEX2;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v0:LEX2;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    const-string v5, "context.resources.configuration"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->x0(Landroid/content/res/Configuration;)I

    move-result v0

    iput v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w0:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lxc;->d(Landroid/content/res/Configuration;)Lpm2;

    move-result-object p1

    invoke-static {p1, v3, v4, v3}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x0:LEX2;

    new-instance p1, LyV3;

    invoke-direct {p1, p0}, LyV3;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y0:LWE1;

    new-instance p1, Ln32;

    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ll32;->b:Ll32$a;

    invoke-virtual {v0}, Ll32$a;->b()I

    move-result v0

    goto :goto_1

    :cond_1
    sget-object v0, Ll32;->b:Ll32$a;

    invoke-virtual {v0}, Ll32$a;->a()I

    move-result v0

    :goto_1
    new-instance v4, Landroidx/compose/ui/platform/AndroidComposeView$c;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/AndroidComposeView$c;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    invoke-direct {p1, v0, v4, v3}, Ln32;-><init>(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z0:Ln32;

    new-instance p1, LkV2;

    invoke-direct {p1, p0}, LkV2;-><init>(LjD3;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A0:LkV2;

    new-instance p1, LTd;

    invoke-direct {p1, p0}, LTd;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->B0:LI26;

    new-instance p1, Luz6;

    invoke-direct {p1}, Luz6;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->E0:Luz6;

    new-instance p1, LLX2;

    const/16 v0, 0x10

    new-array v0, v0, [Lkotlin/jvm/functions/Function0;

    invoke-direct {p1, v0, v9}, LLX2;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F0:LLX2;

    new-instance p1, Landroidx/compose/ui/platform/AndroidComposeView$l;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/AndroidComposeView$l;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G0:Landroidx/compose/ui/platform/AndroidComposeView$l;

    new-instance p1, Lkc;

    invoke-direct {p1, p0}, Lkc;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->H0:Ljava/lang/Runnable;

    new-instance p1, Landroidx/compose/ui/platform/AndroidComposeView$k;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/AndroidComposeView$k;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J0:Lkotlin/jvm/functions/Function0;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-lt p1, v0, :cond_2

    new-instance v3, Lo80;

    invoke-direct {v3}, Lo80;-><init>()V

    goto :goto_2

    :cond_2
    new-instance v3, Lm80;

    invoke-direct {v3}, Lm80;-><init>()V

    :goto_2
    iput-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->K0:Ll80;

    invoke-virtual {p0, v9}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    const/16 v3, 0x1a

    if-lt p1, v3, :cond_3

    sget-object v3, Lwc;->a:Lwc;

    invoke-virtual {v3, p0, v1, v9}, Lwc;->a(Landroid/view/View;IZ)V

    :cond_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {p0, v9}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-static {p0, v2}, Lbq6;->v0(Landroid/view/View;LM1;)V

    sget-object v1, Landroidx/compose/ui/platform/l;->f0:Landroidx/compose/ui/platform/l$a;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/l$a;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object v1

    invoke-virtual {v1, p0}, LJm2;->x(LjD3;)V

    if-lt p1, v0, :cond_5

    sget-object p1, Lsc;->a:Lsc;

    invoke-virtual {p1, p0}, Lsc;->a(Landroid/view/View;)V

    :cond_5
    new-instance p1, Landroidx/compose/ui/platform/AndroidComposeView$i;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/AndroidComposeView$i;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->N0:LgX3;

    return-void

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public static final D0(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->h1()V

    return-void
.end method

.method public static synthetic W0(Landroidx/compose/ui/platform/AndroidComposeView;LJm2;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->V0(LJm2;)V

    return-void
.end method

.method public static synthetic X(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->D0(Landroidx/compose/ui/platform/AndroidComposeView;)V

    return-void
.end method

.method public static final X0(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->h1()V

    return-void
.end method

.method public static synthetic Y(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->Y0(Landroidx/compose/ui/platform/AndroidComposeView;)V

    return-void
.end method

.method public static final Y0(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I0:Z

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C0:Landroid/view/MotionEvent;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/16 v3, 0xa

    if-ne v2, v3, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->a1(Landroid/view/MotionEvent;)I

    return-void

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "The ACTION_HOVER_EXIT event was not cleared."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic Z(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->X0(Landroidx/compose/ui/platform/AndroidComposeView;)V

    return-void
.end method

.method public static synthetic a0(Landroidx/compose/ui/platform/AndroidComposeView;Z)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->g1(Landroidx/compose/ui/platform/AndroidComposeView;Z)V

    return-void
.end method

.method public static final synthetic b0()Ljava/lang/reflect/Method;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->Q0:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public static final synthetic c0(Landroidx/compose/ui/platform/AndroidComposeView;)Landroid/view/MotionEvent;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C0:Landroid/view/MotionEvent;

    return-object p0
.end method

.method public static synthetic c1(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/MotionEvent;IJZILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p5, 0x1

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/platform/AndroidComposeView;->b1(Landroid/view/MotionEvent;IJZ)V

    return-void
.end method

.method public static final synthetic d0(Landroidx/compose/ui/platform/AndroidComposeView;)J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->D0:J

    return-wide v0
.end method

.method public static final synthetic e0(Landroidx/compose/ui/platform/AndroidComposeView;)Landroidx/compose/ui/platform/AndroidComposeView$l;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G0:Landroidx/compose/ui/platform/AndroidComposeView$l;

    return-object p0
.end method

.method public static final synthetic f0()Ljava/lang/Class;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->P0:Ljava/lang/Class;

    return-object v0
.end method

.method public static final synthetic g0(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/MotionEvent;IJZ)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Landroidx/compose/ui/platform/AndroidComposeView;->b1(Landroid/view/MotionEvent;IJZ)V

    return-void
.end method

.method public static final g1(Landroidx/compose/ui/platform/AndroidComposeView;Z)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z0:Ln32;

    if-eqz p1, :cond_0

    sget-object p1, Ll32;->b:Ll32$a;

    invoke-virtual {p1}, Ll32$a;->b()I

    move-result p1

    goto :goto_0

    :cond_0
    sget-object p1, Ll32;->b:Ll32$a;

    invoke-virtual {p1}, Ll32$a;->a()I

    move-result p1

    :goto_0
    invoke-virtual {p0, p1}, Ln32;->b(I)V

    return-void
.end method

.method public static final synthetic h0(Landroidx/compose/ui/platform/AndroidComposeView;LdX3;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->M0:LdX3;

    return-void
.end method

.method public static final synthetic i0(Ljava/lang/reflect/Method;)V
    .locals 0

    sput-object p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q0:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static final synthetic j0(Landroidx/compose/ui/platform/AndroidComposeView;J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->D0:J

    return-void
.end method

.method public static final synthetic k0(Ljava/lang/Class;)V
    .locals 0

    sput-object p0, Landroidx/compose/ui/platform/AndroidComposeView;->P0:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->B:Z

    return v0
.end method

.method public A0()Lls5;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->n:Lls5;

    return-object v0
.end method

.method public B()LQv1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g:LQv1;

    return-object v0
.end method

.method public B0()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public C(J)J
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->P0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->K:[F

    invoke-static {v0, p1, p2}, LhN2;->f([FJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final C0()Landroidx/compose/ui/platform/AndroidComposeView$b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->U:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView$b;

    return-object v0
.end method

.method public D()LgX3;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->N0:LgX3;

    return-object v0
.end method

.method public E(LjD3$b;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    invoke-virtual {v0, p1}, LwO2;->q(LjD3$b;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->W0(Landroidx/compose/ui/platform/AndroidComposeView;LJm2;ILjava/lang/Object;)V

    return-void
.end method

.method public final E0(Landroid/view/MotionEvent;)I
    .locals 14

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G0:Landroidx/compose/ui/platform/AndroidComposeView$l;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->Q0(Landroid/view/MotionEvent;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->R:Z

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->a(Z)V

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->M0:LdX3;

    const-string v2, "AndroidOwner:onTouch"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    iget-object v11, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C0:Landroid/view/MotionEvent;

    const/4 v12, 0x3

    if-eqz v11, :cond_0

    invoke-virtual {v11, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v3

    if-ne v3, v12, :cond_0

    move v13, v1

    goto :goto_0

    :cond_0
    move v13, v0

    :goto_0
    if-eqz v11, :cond_2

    invoke-virtual {p0, p1, v11}, Landroidx/compose/ui/platform/AndroidComposeView;->G0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0, v11}, Landroidx/compose/ui/platform/AndroidComposeView;->L0(Landroid/view/MotionEvent;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->u:LnX3;

    invoke-virtual {v3}, LnX3;->b()V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    const/16 v4, 0xa

    if-eq v3, v4, :cond_2

    if-eqz v13, :cond_2

    const/16 v5, 0xa

    invoke-virtual {v11}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v6

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    move-object v3, p0

    move-object v4, v11

    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/platform/AndroidComposeView;->c1(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/MotionEvent;IJZILjava/lang/Object;)V

    :cond_2
    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v3

    if-ne v3, v12, :cond_3

    goto :goto_2

    :cond_3
    move v1, v0

    :goto_2
    if-nez v13, :cond_4

    if-eqz v1, :cond_4

    if-eq v2, v12, :cond_4

    const/16 v1, 0x9

    if-eq v2, v1, :cond_4

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->M0(Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v4, 0x9

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v5

    const/4 v7, 0x0

    const/16 v8, 0x8

    const/4 v9, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-static/range {v2 .. v9}, Landroidx/compose/ui/platform/AndroidComposeView;->c1(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/MotionEvent;IJZILjava/lang/Object;)V

    :cond_4
    if-eqz v11, :cond_5

    invoke-virtual {v11}, Landroid/view/MotionEvent;->recycle()V

    :cond_5
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C0:Landroid/view/MotionEvent;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->a1(Landroid/view/MotionEvent;)I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    sget-object v1, Ltc;->a:Ltc;

    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->M0:LdX3;

    invoke-virtual {v1, p0, v2}, Ltc;->a(Landroid/view/View;LdX3;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->R:Z

    return p1

    :catchall_0
    move-exception p1

    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->R:Z

    throw p1
.end method

.method public final F0(Landroid/view/MotionEvent;)Z
    .locals 6

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    const/16 v1, 0x1a

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    neg-float v1, v1

    new-instance v2, LQb5;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v0, v3}, LMq6;->e(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v3

    mul-float/2addr v3, v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v0, v4}, LMq6;->b(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v0

    mul-float/2addr v1, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    invoke-direct {v2, v3, v1, v4, v5}, LQb5;-><init>(FFJ)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->B()LQv1;

    move-result-object p1

    invoke-interface {p1, v2}, LQv1;->m(LQb5;)Z

    move-result p1

    return p1
.end method

.method public G(LJm2;)V
    .locals 1

    const-string v0, "layoutNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    invoke-virtual {v0, p1}, LwO2;->x(LJm2;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->W0(Landroidx/compose/ui/platform/AndroidComposeView;LJm2;ILjava/lang/Object;)V

    return-void
.end method

.method public final G0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result p2

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result p1

    if-eq p2, p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public H0()V
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->I0(LJm2;)V

    return-void
.end method

.method public final I0(LJm2;)V
    .locals 3

    invoke-virtual {p1}, LJm2;->F0()V

    invoke-virtual {p1}, LJm2;->w0()LLX2;

    move-result-object p1

    invoke-virtual {p1}, LLX2;->u()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, LLX2;->s()[Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    :cond_0
    aget-object v2, p1, v1

    check-cast v2, LJm2;

    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->I0(LJm2;)V

    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_1
    return-void
.end method

.method public J()Lkw1$b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v0:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkw1$b;

    return-object v0
.end method

.method public final J0(LJm2;)V
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, LwO2;->B(LwO2;LJm2;ZILjava/lang/Object;)Z

    invoke-virtual {p1}, LJm2;->w0()LLX2;

    move-result-object p1

    invoke-virtual {p1}, LLX2;->u()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, LLX2;->s()[Ljava/lang/Object;

    move-result-object p1

    :cond_0
    aget-object v1, p1, v3

    check-cast v1, LJm2;

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->J0(LJm2;)V

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v0, :cond_0

    :cond_1
    return-void
.end method

.method public K()LU16;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t0:LU16;

    return-object v0
.end method

.method public final K0(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    if-eqz v0, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v3

    :goto_2
    if-eqz v0, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_3

    move p1, v2

    goto :goto_3

    :cond_3
    move p1, v3

    :goto_3
    if-nez p1, :cond_4

    goto :goto_4

    :cond_4
    move v2, v3

    :cond_5
    :goto_4
    return v2
.end method

.method public L(LJm2;ZZ)V
    .locals 2

    const-string v0, "layoutNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    invoke-virtual {p2, p1, p3}, LwO2;->t(LJm2;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0, v1, v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->W0(Landroidx/compose/ui/platform/AndroidComposeView;LJm2;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    invoke-virtual {p2, p1, p3}, LwO2;->y(LJm2;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0, v1, v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->W0(Landroidx/compose/ui/platform/AndroidComposeView;LJm2;ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final L0(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    const/4 v1, 0x0

    :cond_1
    return v1
.end method

.method public M()Lew1$b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->u0:Lew1$b;

    return-object v0
.end method

.method public final M0(Landroid/view/MotionEvent;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    const/4 v1, 0x0

    cmpg-float v2, v1, v0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-gtz v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    if-eqz v0, :cond_2

    cmpg-float v0, v1, p1

    if-gtz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_1

    move p1, v3

    goto :goto_1

    :cond_1
    move p1, v4

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move v3, v4

    :goto_2
    return v3
.end method

.method public N(LJm2;)V
    .locals 1

    const-string v0, "layoutNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    invoke-virtual {v0, p1}, LwO2;->h(LJm2;)V

    return-void
.end method

.method public final N0(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C0:Landroid/view/MotionEvent;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    cmpg-float v2, v2, v3

    const/4 v3, 0x0

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    if-eqz v2, :cond_4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    cmpg-float p1, p1, v0

    if-nez p1, :cond_2

    move p1, v1

    goto :goto_1

    :cond_2
    move p1, v3

    :goto_1
    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    move v1, v3

    :cond_4
    :goto_2
    return v1
.end method

.method public O(LJm2;J)V
    .locals 1

    const-string v0, "layoutNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "AndroidOwner:measureAndLayout"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    invoke-virtual {v0, p1, p2, p3}, LwO2;->m(LJm2;J)V

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    const/4 p2, 0x1

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, p3}, LwO2;->e(LwO2;ZILjava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final O0(LiD3;Z)V
    .locals 1

    const-string v0, "layer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    iget-boolean p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->s:Z

    if-nez p2, :cond_3

    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r:Ljava/util/List;

    if-eqz p2, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-boolean p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->s:Z

    if-nez p2, :cond_1

    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q:Ljava/util/List;

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r:Ljava/util/List;

    if-nez p2, :cond_2

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r:Ljava/util/List;

    :cond_2
    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    return-void
.end method

.method public P(LJm2;ZZ)V
    .locals 1

    const-string v0, "layoutNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    invoke-virtual {p2, p1, p3}, LwO2;->v(LJm2;Z)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->V0(LJm2;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    invoke-virtual {p2, p1, p3}, LwO2;->A(LJm2;Z)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->V0(LJm2;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final P0()V
    .locals 6

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->R:Z

    if-nez v0, :cond_1

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q:J

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->R0()V

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    move-object v1, p0

    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    move-object v0, v1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:[I

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:[I

    const/4 v2, 0x0

    aget v3, v0, v2

    int-to-float v3, v3

    const/4 v4, 0x1

    aget v5, v0, v4

    int-to-float v5, v5

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:[I

    aget v1, v0, v2

    int-to-float v1, v1

    aget v0, v0, v4

    int-to-float v0, v0

    sub-float/2addr v3, v1

    sub-float/2addr v5, v0

    invoke-static {v3, v5}, LGe3;->a(FF)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S:J

    :cond_1
    return-void
.end method

.method public Q()LLm2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d:LLm2;

    return-object v0
.end method

.method public final Q0(Landroid/view/MotionEvent;)V
    .locals 4

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q:J

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->R0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->K:[F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-static {v1, v2}, LGe3;->a(FF)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, LhN2;->f([FJ)J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    invoke-static {v0, v1}, LCe3;->o(J)F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    invoke-static {v0, v1}, LCe3;->p(J)F

    move-result v0

    sub-float/2addr p1, v0

    invoke-static {v2, p1}, LGe3;->a(FF)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S:J

    return-void
.end method

.method public R()LnB6;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h:LoB6;

    return-object v0
.end method

.method public final R0()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->K0:Ll80;

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->K:[F

    invoke-interface {v0, p0, v1}, Ll80;->a(Landroid/view/View;[F)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->K:[F

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->P:[F

    invoke-static {v0, v1}, LQ92;->a([F[F)Z

    return-void
.end method

.method public S(J)J
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->P0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->K:[F

    invoke-static {v0, p1, p2}, LhN2;->f([FJ)J

    move-result-wide p1

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result v0

    iget-wide v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S:J

    invoke-static {v1, v2}, LCe3;->o(J)F

    move-result v1

    add-float/2addr v0, v1

    invoke-static {p1, p2}, LCe3;->p(J)F

    move-result p1

    iget-wide v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S:J

    invoke-static {v1, v2}, LCe3;->p(J)F

    move-result p2

    add-float/2addr p1, p2

    invoke-static {v0, p1}, LGe3;->a(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method public final S0(LiD3;)Z
    .locals 1

    const-string v0, "layer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->D:Landroidx/compose/ui/platform/DrawChildContainer;

    if-eqz v0, :cond_0

    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->p:Landroidx/compose/ui/platform/ViewLayer$c;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/ViewLayer$c;->b()Z

    move-result v0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->E0:Luz6;

    invoke-virtual {v0, p1}, Luz6;->c(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public T(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F0:LLX2;

    invoke-virtual {v0, p1}, LLX2;->j(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F0:LLX2;

    invoke-virtual {v0, p1}, LLX2;->b(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final T0(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/compose/ui/platform/AndroidComposeView$j;

    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView$j;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->T(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public U()LWE1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y0:LWE1;

    return-object v0
.end method

.method public final U0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:Z

    return-void
.end method

.method public V()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o:Landroidx/compose/ui/platform/f;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/f;->M()V

    return-void
.end method

.method public final V0(LJm2;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p1, :cond_1

    :goto_0
    if-eqz p1, :cond_0

    invoke-virtual {p1}, LJm2;->i0()LJm2$g;

    move-result-object v0

    sget-object v1, LJm2$g;->b:LJm2$g;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->o0(LJm2;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LJm2;->p0()LJm2;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object v0

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_4
    :goto_2
    return-void
.end method

.method public bridge synthetic W()LiW3;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->y0()LjW3;

    move-result-object v0

    return-object v0
.end method

.method public Z0(Landroid/view/KeyEvent;)Z
    .locals 1

    const-string v0, "keyEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->B()LQv1;

    move-result-object v0

    invoke-interface {v0, p1}, LQv1;->g(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public a(Z)V
    .locals 3

    const-string v0, "AndroidOwner:measureAndLayout"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J0:Lkotlin/jvm/functions/Function0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object p1, v0

    :goto_0
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    invoke-virtual {v1, p1}, LwO2;->l(Lkotlin/jvm/functions/Function0;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_1
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v2, v0}, LwO2;->e(LwO2;ZILjava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final a1(Landroid/view/MotionEvent;)I
    .locals 4

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->L0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->L0:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h:LoB6;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v2

    invoke-static {v2}, LxX3;->b(I)I

    move-result v2

    invoke-virtual {v0, v2}, LoB6;->a(I)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t:LRV2;

    invoke-virtual {v0, p1, p0}, LRV2;->c(Landroid/view/MotionEvent;LDY3;)LlX3;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LlX3;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LmX3;

    invoke-virtual {v3}, LmX3;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    check-cast v2, LmX3;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, LmX3;->e()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b:J

    :cond_3
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->u:LnX3;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->M0(Landroid/view/MotionEvent;)Z

    move-result v2

    invoke-virtual {v1, v0, p0, v2}, LnX3;->a(LlX3;LDY3;Z)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    if-eqz v1, :cond_4

    const/4 v2, 0x5

    if-ne v1, v2, :cond_6

    :cond_4
    invoke-static {v0}, LP64;->c(I)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t:LRV2;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    invoke-virtual {v1, p1}, LRV2;->e(I)V

    goto :goto_1

    :cond_5
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->u:LnX3;

    invoke-virtual {p1}, LnX3;->b()V

    invoke-static {v1, v1}, LoX3;->a(ZZ)I

    move-result v0

    :cond_6
    :goto_1
    return v0
.end method

.method public autofill(Landroid/util/SparseArray;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/view/autofill/AutofillValue;",
            ">;)V"
        }
    .end annotation

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->m0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Lrb;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lub;->a(Lrb;Landroid/util/SparseArray;)V

    :cond_0
    return-void
.end method

.method public b()Lg01;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e:Lg01;

    return-object v0
.end method

.method public final b1(Landroid/view/MotionEvent;IJZ)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v5, p2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v15, 0x1

    if-eq v2, v15, :cond_1

    const/4 v6, 0x6

    if-eq v2, v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    goto :goto_0

    :cond_1
    const/16 v2, 0x9

    if-eq v5, v2, :cond_2

    const/16 v2, 0xa

    if-eq v5, v2, :cond_2

    move v3, v4

    :cond_2
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-ltz v3, :cond_3

    move v6, v15

    goto :goto_1

    :cond_3
    move v6, v4

    :goto_1
    sub-int v6, v2, v6

    if-nez v6, :cond_4

    return-void

    :cond_4
    new-array v7, v6, [Landroid/view/MotionEvent$PointerProperties;

    move v2, v4

    :goto_2
    if-ge v2, v6, :cond_5

    new-instance v8, Landroid/view/MotionEvent$PointerProperties;

    invoke-direct {v8}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    aput-object v8, v7, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    new-array v8, v6, [Landroid/view/MotionEvent$PointerCoords;

    move v2, v4

    :goto_3
    if-ge v2, v6, :cond_6

    new-instance v9, Landroid/view/MotionEvent$PointerCoords;

    invoke-direct {v9}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    aput-object v9, v8, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    move v2, v4

    :goto_4
    if-ge v2, v6, :cond_9

    if-ltz v3, :cond_8

    if-ge v2, v3, :cond_7

    goto :goto_5

    :cond_7
    move v9, v15

    goto :goto_6

    :cond_8
    :goto_5
    move v9, v4

    :goto_6
    add-int/2addr v9, v2

    aget-object v10, v7, v2

    invoke-virtual {v1, v9, v10}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    aget-object v10, v8, v2

    invoke-virtual {v1, v9, v10}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    iget v9, v10, Landroid/view/MotionEvent$PointerCoords;->x:F

    iget v11, v10, Landroid/view/MotionEvent$PointerCoords;->y:F

    invoke-static {v9, v11}, LGe3;->a(FF)J

    move-result-wide v11

    invoke-virtual {v0, v11, v12}, Landroidx/compose/ui/platform/AndroidComposeView;->S(J)J

    move-result-wide v11

    invoke-static {v11, v12}, LCe3;->o(J)F

    move-result v9

    iput v9, v10, Landroid/view/MotionEvent$PointerCoords;->x:F

    invoke-static {v11, v12}, LCe3;->p(J)F

    move-result v9

    iput v9, v10, Landroid/view/MotionEvent$PointerCoords;->y:F

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_9
    if-eqz p5, :cond_a

    move v10, v4

    goto :goto_7

    :cond_a
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v2

    move v10, v2

    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v11

    cmp-long v2, v2, v11

    if-nez v2, :cond_b

    move-wide/from16 v2, p3

    goto :goto_8

    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v2

    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getXPrecision()F

    move-result v11

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getYPrecision()F

    move-result v12

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v16

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getFlags()I

    move-result v17

    move-wide v1, v2

    move-wide/from16 v3, p3

    move/from16 v5, p2

    move/from16 v15, v16

    move/from16 v16, v17

    invoke-static/range {v1 .. v16}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    move-result-object v1

    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->t:LRV2;

    const-string v3, "event"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1, v0}, LRV2;->c(Landroid/view/MotionEvent;LDY3;)LlX3;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, v0, Landroidx/compose/ui/platform/AndroidComposeView;->u:LnX3;

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v0, v4}, LnX3;->a(LlX3;LDY3;Z)I

    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    return-void
.end method

.method public canScrollHorizontally(I)Z
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o:Landroidx/compose/ui/platform/f;

    const/4 v1, 0x0

    iget-wide v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b:J

    invoke-virtual {v0, v1, p1, v2, v3}, Landroidx/compose/ui/platform/f;->n(ZIJ)Z

    move-result p1

    return p1
.end method

.method public canScrollVertically(I)Z
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o:Landroidx/compose/ui/platform/f;

    const/4 v1, 0x1

    iget-wide v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b:J

    invoke-virtual {v0, v1, p1, v2, v3}, Landroidx/compose/ui/platform/f;->n(ZIJ)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic d()LQ1;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->t0()Ljb;

    move-result-object v0

    return-object v0
.end method

.method public final d1(Lkw1$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v0:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->I0(LJm2;)V

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v1, v2, v0}, LjD3;->j(LjD3;ZILjava/lang/Object;)V

    iput-boolean v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->s:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->k:Lqe0;

    invoke-virtual {v0}, Lqe0;->a()Lac;

    move-result-object v3

    invoke-virtual {v3}, Lac;->y()Landroid/graphics/Canvas;

    move-result-object v3

    invoke-virtual {v0}, Lqe0;->a()Lac;

    move-result-object v4

    invoke-virtual {v4, p1}, Lac;->z(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Lqe0;->a()Lac;

    move-result-object v4

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object v5

    invoke-virtual {v5, v4}, LJm2;->G(Lme0;)V

    invoke-virtual {v0}, Lqe0;->a()Lac;

    move-result-object v0

    invoke-virtual {v0, v3}, Lac;->z(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LiD3;

    invoke-interface {v3}, LiD3;->i()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->p:Landroidx/compose/ui/platform/ViewLayer$c;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/ViewLayer$c;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v2, v2}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_2
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->s:Z

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r:Ljava/util/List;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q:Ljava/util/List;

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_3
    return-void
.end method

.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    const/high16 v0, 0x400000

    invoke-virtual {p1, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->F0(Landroid/view/MotionEvent;)Z

    move-result p1

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->K0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->E0(Landroid/view/MotionEvent;)I

    move-result p1

    invoke-static {p1}, LP64;->c(I)Z

    move-result p1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    goto :goto_1

    :cond_3
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    :goto_1
    return p1
.end method

.method public dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->H0:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->H0:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->K0(Landroid/view/MotionEvent;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/16 v0, 0x1002

    invoke-virtual {p1, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v0

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o:Landroidx/compose/ui/platform/f;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/f;->u(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v3, 0x7

    if-eq v0, v3, :cond_6

    const/16 v3, 0xa

    if-eq v0, v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->M0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v0

    const/4 v3, 0x3

    if-eq v0, v3, :cond_5

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C0:Landroid/view/MotionEvent;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    :cond_4
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C0:Landroid/view/MotionEvent;

    iput-boolean v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I0:Z

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->H0:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return v1

    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v0

    if-eqz v0, :cond_7

    return v1

    :cond_6
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->N0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_7

    return v1

    :cond_7
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->E0(Landroid/view/MotionEvent;)I

    move-result p1

    invoke-static {p1}, LP64;->c(I)Z

    move-result p1

    return p1

    :cond_8
    :goto_1
    return v1
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h:LoB6;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v1

    invoke-static {v1}, LxX3;->b(I)I

    move-result v1

    invoke-virtual {v0, v1}, LoB6;->a(I)V

    invoke-static {p1}, Lik2;->b(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->Z0(Landroid/view/KeyEvent;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    const-string v0, "motionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->H0:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C0:Landroid/view/MotionEvent;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->G0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I0:Z

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->H0:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->K0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->N0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->E0(Landroid/view/MotionEvent;)I

    move-result p1

    invoke-static {p1}, LP64;->b(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_5
    invoke-static {p1}, LP64;->c(I)Z

    move-result p1

    return p1

    :cond_6
    :goto_2
    return v1
.end method

.method public e(LJm2;)V
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final e1(Lpm2;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x0:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public f()Lzu;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Lrb;

    return-object v0
.end method

.method public final f1(Landroidx/compose/ui/platform/AndroidComposeView$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->U:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final findViewByAccessibilityIdTraversal(I)Landroid/view/View;
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    const-class v1, Landroid/view/View;

    const-string v2, "findViewByAccessibilityIdTraversal"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v6

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Landroid/view/View;

    if-eqz v1, :cond_1

    check-cast p1, Landroid/view/View;

    move-object v0, p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p0}, Landroidx/compose/ui/platform/AndroidComposeView;->s0(ILandroid/view/View;)Landroid/view/View;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-object v0
.end method

.method public getFocusedRect(Landroid/graphics/Rect;)V
    .locals 2

    const-string v0, "rect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->B()LQv1;

    move-result-object v0

    invoke-interface {v0}, LQv1;->j()LOs4;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LOs4;->i()F

    move-result v1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->left:I

    invoke-virtual {v0}, LOs4;->l()F

    move-result v1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0}, LOs4;->j()F

    move-result v1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->right:I

    invoke-virtual {v0}, LOs4;->e()F

    move-result v0

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method

.method public getLayoutDirection()Lpm2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x0:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpm2;

    return-object v0
.end method

.method public final h1()V
    .locals 8

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:[I

    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I:J

    invoke-static {v0, v1}, LA52;->c(J)I

    move-result v2

    invoke-static {v0, v1}, LA52;->d(J)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:[I

    const/4 v3, 0x0

    aget v4, v1, v3

    const/4 v5, 0x1

    if-ne v2, v4, :cond_0

    aget v6, v1, v5

    if-eq v0, v6, :cond_1

    :cond_0
    aget v1, v1, v5

    invoke-static {v4, v1}, LB52;->a(II)J

    move-result-wide v6

    iput-wide v6, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I:J

    const v1, 0x7fffffff

    if-eq v2, v1, :cond_1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->X()LOm2;

    move-result-object v0

    invoke-virtual {v0}, LOm2;->x()LOm2$b;

    move-result-object v0

    invoke-virtual {v0}, LOm2$b;->r1()V

    move v3, v5

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    invoke-virtual {v0, v3}, LwO2;->d(Z)V

    return-void
.end method

.method public k()Lm32;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z0:Ln32;

    return-object v0
.end method

.method public l()LmD3;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A:LmD3;

    return-object v0
.end method

.method public final l0(Landroidx/compose/ui/viewinterop/AndroidViewHolder;LJm2;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutNode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->u0()Landroidx/compose/ui/platform/AndroidViewsHandler;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidViewsHandler;->b()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->u0()Landroidx/compose/ui/platform/AndroidViewsHandler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->u0()Landroidx/compose/ui/platform/AndroidViewsHandler;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidViewsHandler;->c()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lbq6;->H0(Landroid/view/View;I)V

    new-instance v0, Landroidx/compose/ui/platform/AndroidComposeView$d;

    invoke-direct {v0, p2, p0, p0}, Landroidx/compose/ui/platform/AndroidComposeView$d;-><init>(LJm2;Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/AndroidComposeView;)V

    invoke-static {p1, v0}, Lbq6;->v0(Landroid/view/View;LM1;)V

    return-void
.end method

.method public final m0()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic n()LUk0;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->v0()Ldc;

    move-result-object v0

    return-object v0
.end method

.method public final n0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o:Landroidx/compose/ui/platform/f;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/f;->m(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public o()LkV2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A0:LkV2;

    return-object v0
.end method

.method public final o0(LJm2;)Z
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F:Z

    const/4 v1, 0x1

    if-nez v0, :cond_2

    invoke-virtual {p1}, LJm2;->p0()LJm2;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LJm2;->Q()Z

    move-result p1

    if-nez p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v0

    :cond_2
    :goto_1
    return v1
.end method

.method public onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->J0(LJm2;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->I0(LJm2;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->l()LmD3;

    move-result-object v0

    invoke-virtual {v0}, LmD3;->i()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->m0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Lrb;

    if-eqz v0, :cond_0

    sget-object v1, LOu;->a:LOu;

    invoke-virtual {v1, v0}, LOu;->a(Lrb;)V

    :cond_0
    invoke-static {p0}, LQt6;->a(Landroid/view/View;)LLifecycleOwner;

    move-result-object v0

    invoke-static {p0}, LTt6;->a(Landroid/view/View;)LPi5;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->C0()Landroidx/compose/ui/platform/AndroidComposeView$b;

    move-result-object v2

    if-eqz v2, :cond_2

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView$b;->a()LLifecycleOwner;

    move-result-object v3

    if-ne v0, v3, :cond_2

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView$b;->a()LLifecycleOwner;

    move-result-object v3

    if-eq v1, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-eqz v3, :cond_7

    if-eqz v0, :cond_6

    if-eqz v1, :cond_5

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView$b;->a()LLifecycleOwner;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2, p0}, Landroidx/lifecycle/f;->d(LFq2;)V

    :cond_3
    invoke-interface {v0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroidx/lifecycle/f;->a(LFq2;)V

    new-instance v2, Landroidx/compose/ui/platform/AndroidComposeView$b;

    invoke-direct {v2, v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView$b;-><init>(LLifecycleOwner;LPi5;)V

    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->f1(Landroidx/compose/ui/platform/AndroidComposeView$b;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->W:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_4

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->W:Lkotlin/jvm/functions/Function1;

    goto :goto_2

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composed into the View which doesn\'t propagateViewTreeSavedStateRegistryOwner!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_2
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z0:Ln32;

    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Ll32;->b:Ll32$a;

    invoke-virtual {v1}, Ll32$a;->b()I

    move-result v1

    goto :goto_3

    :cond_8
    sget-object v1, Ll32;->b:Ll32$a;

    invoke-virtual {v1}, Ll32$a;->a()I

    move-result v1

    :goto_3
    invoke-virtual {v0, v1}, Ln32;->b(I)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->C0()Landroidx/compose/ui/platform/AndroidComposeView$b;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView$b;->a()LLifecycleOwner;

    move-result-object v0

    invoke-interface {v0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/f;->a(LFq2;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->p0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q0:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    return-void
.end method

.method public onCheckIsTextEditor()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->y0()LjW3;

    move-result-object v0

    invoke-virtual {v0}, LjW3;->d()LgW3;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    const-string v0, "newConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LAc;->a(Landroid/content/Context;)Lg01;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e:Lg01;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->x0(Landroid/content/res/Configuration;)I

    move-result v0

    iget v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w0:I

    if-eq v0, v2, :cond_0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->x0(Landroid/content/res/Configuration;)I

    move-result v0

    iput v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w0:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Low1;->a(Landroid/content/Context;)Lkw1$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->d1(Lkw1$b;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    const-string v0, "outAttrs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->y0()LjW3;

    move-result-object v0

    invoke-virtual {v0}, LjW3;->d()LgW3;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LgW3;->a(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->l()LmD3;

    move-result-object v0

    invoke-virtual {v0}, LmD3;->j()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->C0()Landroidx/compose/ui/platform/AndroidComposeView$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView$b;->a()LLifecycleOwner;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/f;->d(LFq2;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->m0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Lrb;

    if-eqz v0, :cond_1

    sget-object v1, LOu;->a:LOu;

    invoke-virtual {v1, v0}, LOu;->b(Lrb;)V

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->p0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q0:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Owner FocusChanged("

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 p3, 0x29

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Compose Focus"

    invoke-static {p3, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->B()LQv1;

    move-result-object p1

    invoke-interface {p1}, LQv1;->b()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->B()LQv1;

    move-result-object p1

    invoke-interface {p1}, LQv1;->l()V

    :goto_0
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 1

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J0:Lkotlin/jvm/functions/Function0;

    invoke-virtual {p1, v0}, LwO2;->l(Lkotlin/jvm/functions/Function0;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->E:Lkz0;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->h1()V

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C:Landroidx/compose/ui/platform/AndroidViewsHandler;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->u0()Landroidx/compose/ui/platform/AndroidViewsHandler;

    move-result-object p1

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    const-string v0, "AndroidOwner:onMeasure"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->J0(LJm2;)V

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->q0(I)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p2}, Landroidx/compose/ui/platform/AndroidComposeView;->q0(I)Lkotlin/Pair;

    move-result-object p2

    invoke-virtual {p2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-static {v0, p1, v1, p2}, Lnz0;->a(IIII)J

    move-result-wide p1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->E:Lkz0;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {p1, p2}, Lkz0;->b(J)Lkz0;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->E:Lkz0;

    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F:Z

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lkz0;->s()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lkz0;->g(JJ)Z

    move-result v1

    :goto_0
    if-nez v1, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F:Z

    :cond_3
    :goto_1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    invoke-virtual {v0, p1, p2}, LwO2;->C(J)V

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    invoke-virtual {p1}, LwO2;->n()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object p1

    invoke-virtual {p1}, LJm2;->u0()I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object p2

    invoke-virtual {p2}, LJm2;->R()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C:Landroidx/compose/ui/platform/AndroidViewsHandler;

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->u0()Landroidx/compose/ui/platform/AndroidViewsHandler;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object p2

    invoke-virtual {p2}, LJm2;->u0()I

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->z0()LJm2;

    move-result-object v1

    invoke-virtual {v1}, LJm2;->R()I

    move-result v1

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->m0()Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Lrb;

    if-eqz p2, :cond_0

    invoke-static {p2, p1}, Lub;->b(Lrb;Landroid/view/ViewStructure;)V

    :cond_0
    return-void
.end method

.method public onResume(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/compose/ui/platform/AndroidComposeView;->O0:Landroidx/compose/ui/platform/AndroidComposeView$a;

    invoke-static {p1}, Landroidx/compose/ui/platform/AndroidComposeView$a;->a(Landroidx/compose/ui/platform/AndroidComposeView$a;)Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setShowLayoutBounds(Z)V

    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lxc;->a(I)Lpm2;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->e1(Lpm2;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->B()LQv1;

    move-result-object v0

    invoke-interface {v0, p1}, LQv1;->a(Lpm2;)V

    :cond_0
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h:LoB6;

    invoke-virtual {v0, p1}, LoB6;->b(Z)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->L0:Z

    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    sget-object p1, Landroidx/compose/ui/platform/AndroidComposeView;->O0:Landroidx/compose/ui/platform/AndroidComposeView$a;

    invoke-static {p1}, Landroidx/compose/ui/platform/AndroidComposeView$a;->a(Landroidx/compose/ui/platform/AndroidComposeView$a;)Z

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->A()Z

    move-result v0

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setShowLayoutBounds(Z)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->H0()V

    :cond_0
    return-void
.end method

.method public p()LI26;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->B0:LI26;

    return-object v0
.end method

.method public final p0(Landroid/view/ViewGroup;)V
    .locals 4

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroidx/compose/ui/platform/AndroidComposeView;

    if-eqz v3, :cond_0

    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->y()V

    goto :goto_1

    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->p0(Landroid/view/ViewGroup;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public q(J)J
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->P0()V

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result v0

    iget-wide v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S:J

    invoke-static {v1, v2}, LCe3;->o(J)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {p1, p2}, LCe3;->p(J)F

    move-result p1

    iget-wide v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S:J

    invoke-static {v1, v2}, LCe3;->p(J)F

    move-result p2

    sub-float/2addr p1, p2

    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->P:[F

    invoke-static {v0, p1}, LGe3;->a(FF)J

    move-result-wide v0

    invoke-static {p2, v0, v1}, LhN2;->f([FJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final q0(I)Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, -0x80000000

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    if-eqz v0, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const v0, 0x7fffffff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final r0(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroid/graphics/Canvas;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "canvas"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->u0()Landroidx/compose/ui/platform/AndroidViewsHandler;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/AndroidViewsHandler;->a(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroid/graphics/Canvas;)V

    return-void
.end method

.method public s()LJq6;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->H:LJq6;

    return-object v0
.end method

.method public final s0(ILandroid/view/View;)Landroid/view/View;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_2

    const-string v0, "getAccessibilityViewId"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Landroid/view/View;

    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p2, Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "currentView.getChildAt(i)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->s0(ILandroid/view/View;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final setConfigurationChangeObserver(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/res/Configuration;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setLastMatrixRecalculationAnimationTime$ui_release(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q:J

    return-void
.end method

.method public final setOnViewTreeOwnersAvailable(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/platform/AndroidComposeView$b;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->C0()Landroidx/compose/ui/platform/AndroidComposeView$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->W:Lkotlin/jvm/functions/Function1;

    :cond_1
    return-void
.end method

.method public setShowLayoutBounds(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->B:Z

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public t(LJm2;)V
    .locals 1

    const-string v0, "layoutNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o:Landroidx/compose/ui/platform/f;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/f;->L(LJm2;)V

    return-void
.end method

.method public t0()Ljb;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z:Ljb;

    return-object v0
.end method

.method public u(LJm2;)V
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:LwO2;

    invoke-virtual {v0, p1}, LwO2;->o(LJm2;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->U0()V

    return-void
.end method

.method public final u0()Landroidx/compose/ui/platform/AndroidViewsHandler;
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C:Landroidx/compose/ui/platform/AndroidViewsHandler;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/compose/ui/platform/AndroidViewsHandler;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/AndroidViewsHandler;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C:Landroidx/compose/ui/platform/AndroidViewsHandler;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C:Landroidx/compose/ui/platform/AndroidViewsHandler;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method

.method public v0()Ldc;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y:Ldc;

    return-object v0
.end method

.method public w(J)J
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->P0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->P:[F

    invoke-static {v0, p1, p2}, LhN2;->f([FJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public w0(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/c;
    .locals 6

    const-string v0, "keyEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lmk2;->a(Landroid/view/KeyEvent;)J

    move-result-wide v0

    sget-object v2, LWj2;->b:LWj2$a;

    invoke-virtual {v2}, LWj2$a;->j()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LWj2;->n(JJ)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1}, Lmk2;->f(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/c$a;->f()I

    move-result p1

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/c$a;->e()I

    move-result p1

    :goto_0
    invoke-static {p1}, Landroidx/compose/ui/focus/c;->i(I)Landroidx/compose/ui/focus/c;

    move-result-object p1

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v2}, LWj2$a;->e()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LWj2;->n(JJ)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/c$a;->g()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/c;->i(I)Landroidx/compose/ui/focus/c;

    move-result-object p1

    goto/16 :goto_4

    :cond_2
    invoke-virtual {v2}, LWj2$a;->d()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LWj2;->n(JJ)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/c$a;->d()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/c;->i(I)Landroidx/compose/ui/focus/c;

    move-result-object p1

    goto/16 :goto_4

    :cond_3
    invoke-virtual {v2}, LWj2$a;->f()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LWj2;->n(JJ)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/c$a;->h()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/c;->i(I)Landroidx/compose/ui/focus/c;

    move-result-object p1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, LWj2$a;->c()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LWj2;->n(JJ)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/c$a;->a()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/c;->i(I)Landroidx/compose/ui/focus/c;

    move-result-object p1

    goto :goto_4

    :cond_5
    invoke-virtual {v2}, LWj2$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LWj2;->n(JJ)Z

    move-result p1

    const/4 v3, 0x1

    if-eqz p1, :cond_6

    move p1, v3

    goto :goto_1

    :cond_6
    invoke-virtual {v2}, LWj2$a;->g()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, LWj2;->n(JJ)Z

    move-result p1

    :goto_1
    if-eqz p1, :cond_7

    move p1, v3

    goto :goto_2

    :cond_7
    invoke-virtual {v2}, LWj2$a;->i()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, LWj2;->n(JJ)Z

    move-result p1

    :goto_2
    if-eqz p1, :cond_8

    sget-object p1, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/c$a;->b()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/c;->i(I)Landroidx/compose/ui/focus/c;

    move-result-object p1

    goto :goto_4

    :cond_8
    invoke-virtual {v2}, LWj2$a;->a()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, LWj2;->n(JJ)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual {v2}, LWj2$a;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LWj2;->n(JJ)Z

    move-result v3

    :goto_3
    if-eqz v3, :cond_a

    sget-object p1, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/c$a;->c()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/c;->i(I)Landroidx/compose/ui/focus/c;

    move-result-object p1

    goto :goto_4

    :cond_a
    const/4 p1, 0x0

    :goto_4
    return-object p1
.end method

.method public x(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)LiD3;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lme0;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "LiD3;"
        }
    .end annotation

    const-string v0, "drawBlock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "invalidateParentLayer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->E0:Luz6;

    invoke-virtual {v0}, Luz6;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LiD3;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, LiD3;->b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isHardwareAccelerated()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->T:Z

    if-eqz v0, :cond_1

    :try_start_0
    new-instance v0, Ljx4;

    invoke-direct {v0, p0, p1, p2}, Ljx4;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->T:Z

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->D:Landroidx/compose/ui/platform/DrawChildContainer;

    if-nez v0, :cond_4

    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->p:Landroidx/compose/ui/platform/ViewLayer$c;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/ViewLayer$c;->a()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/ViewLayer$c;->d(Landroid/view/View;)V

    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/platform/ViewLayer$c;->b()Z

    move-result v0

    const-string v1, "context"

    if-eqz v0, :cond_3

    new-instance v0, Landroidx/compose/ui/platform/DrawChildContainer;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v2}, Landroidx/compose/ui/platform/DrawChildContainer;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_3
    new-instance v0, Landroidx/compose/ui/platform/ViewLayerContainer;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v2}, Landroidx/compose/ui/platform/ViewLayerContainer;-><init>(Landroid/content/Context;)V

    :goto_0
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->D:Landroidx/compose/ui/platform/DrawChildContainer;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_4
    new-instance v0, Landroidx/compose/ui/platform/ViewLayer;

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->D:Landroidx/compose/ui/platform/DrawChildContainer;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v0, p0, v1, p1, p2}, Landroidx/compose/ui/platform/ViewLayer;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method public final x0(Landroid/content/res/Configuration;)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p1}, Lgc;->a(Landroid/content/res/Configuration;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public y()V
    .locals 6

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->l()LmD3;

    move-result-object v0

    invoke-virtual {v0}, LmD3;->a()V

    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:Z

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C:Landroidx/compose/ui/platform/AndroidViewsHandler;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->p0(Landroid/view/ViewGroup;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F0:LLX2;

    invoke-virtual {v0}, LLX2;->x()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F0:LLX2;

    invoke-virtual {v0}, LLX2;->u()I

    move-result v0

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_3

    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F0:LLX2;

    invoke-virtual {v3}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F0:LLX2;

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v5}, LLX2;->F(ILjava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F0:LLX2;

    invoke-virtual {v2, v1, v0}, LLX2;->D(II)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method public y0()LjW3;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->s0:LjW3;

    return-object v0
.end method

.method public z()LQu;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->p:LQu;

    return-object v0
.end method

.method public z0()LJm2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->l:LJm2;

    return-object v0
.end method
