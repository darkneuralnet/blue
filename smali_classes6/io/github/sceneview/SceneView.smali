.class public Lio/github/sceneview/SceneView;
.super Landroid/view/SurfaceView;
.source "SourceFile"

# interfaces
.implements LLifecycleOwner;
.implements LVX0;
.implements Landroid/view/Choreographer$FrameCallback;
.implements LQ83;
.implements LiC1$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/sceneview/SceneView$b;,
        Lio/github/sceneview/SceneView$c;,
        Lio/github/sceneview/SceneView$d;,
        Lio/github/sceneview/SceneView$a;,
        Lio/github/sceneview/SceneView$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ca\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0004\'%\\bBE\u0008\u0007\u0012\u0008\u0010\u00bf\u0002\u001a\u00030\u00be\u0002\u0012\u000c\u0008\u0002\u0010\u00c1\u0002\u001a\u0005\u0018\u00010\u00c0\u0002\u0012\t\u0008\u0002\u0010\u00c2\u0002\u001a\u000201\u0012\t\u0008\u0002\u0010\u00c3\u0002\u001a\u000201\u0012\n\u0008\u0002\u0010\u0085\u0001\u001a\u00030\u0080\u0001\u00a2\u0006\u0006\u0008\u00c4\u0002\u0010\u00c5\u0002J\u0008\u0010\u0008\u001a\u00020\u0007H\u0002J\u0008\u0010\t\u001a\u00020\u0007H\u0002J\u0011\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0011\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J)\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0096\u0001J\u0011\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010 \u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010!\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\"\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J)\u0010%\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0012H\u0096\u0001J\u0011\u0010&\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0011\u0010\'\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016J\u0008\u0010+\u001a\u00020\u0007H\u0014J\u0008\u0010,\u001a\u00020\u0007H\u0014J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010.\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016J0\u00106\u001a\u00020\u00072\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00104\u001a\u0002012\u0006\u00105\u001a\u000201H\u0014J\u0010\u00109\u001a\u00020\u00072\u0006\u00108\u001a\u000207H\u0016J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:H\u0016J\u0010\u0010>\u001a\u00020\u00072\u0008\u0008\u0001\u0010=\u001a\u000201J\u0010\u0010?\u001a\u00020\u00072\u0008\u0008\u0001\u0010=\u001a\u000201J\u0014\u0010B\u001a\u00020\u00072\u000c\u0008\u0001\u0010A\u001a\u000601j\u0002`@J\u0014\u0010C\u001a\u00020\u00072\u000c\u0008\u0001\u0010A\u001a\u000601j\u0002`@J\u0012\u0010F\u001a\u00020\u00072\u0008\u0010E\u001a\u0004\u0018\u00010DH\u0017J\u0010\u0010I\u001a\u00020/2\u0006\u0010H\u001a\u00020GH\u0017J\u0010\u0010J\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J1\u0010O\u001a\u00020\u00072\u0006\u0010H\u001a\u00020G2\u0008\u0010L\u001a\u0004\u0018\u00010K2\u000e\u0010N\u001a\n\u0018\u000101j\u0004\u0018\u0001`MH\u0016\u00a2\u0006\u0004\u0008O\u0010PJT\u0010W\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u0002012\u0006\u0010Q\u001a\u0002012<\u0010V\u001a8\u0012\u0015\u0012\u0013\u0018\u00010S\u00a2\u0006\u000c\u0008T\u0012\u0008\u0008U\u0012\u0004\u0008\u0008(L\u0012\u0017\u0012\u001501j\u0002`M\u00a2\u0006\u000c\u0008T\u0012\u0008\u0008U\u0012\u0004\u0008\u0008(N\u0012\u0004\u0012\u00020\u00070RJ1\u0010Y\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020G2!\u0010V\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008T\u0012\u0008\u0008U\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u00070XJ\u0008\u0010Z\u001a\u00020\u0007H\u0016R\u001b\u0010`\u001a\u00020[8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\\\u0010]\u001a\u0004\u0008^\u0010_R\"\u0010h\u001a\u00020a8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008b\u0010c\u001a\u0004\u0008d\u0010e\"\u0004\u0008f\u0010gR\"\u0010o\u001a\u00020i8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010j\u001a\u0004\u0008k\u0010l\"\u0004\u0008m\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008q\u0010r\u001a\u0004\u0008s\u0010t\"\u0004\u0008u\u0010vR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008y\u0010z\u001a\u0004\u0008{\u0010|\"\u0004\u0008}\u0010~R \u0010\u0085\u0001\u001a\u00030\u0080\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001\u001a\u0006\u0008\u0083\u0001\u0010\u0084\u0001RB\u0010\u008d\u0001\u001a\n\u0018\u000101j\u0004\u0018\u0001`@2\u000f\u0010\u0086\u0001\u001a\n\u0018\u000101j\u0004\u0018\u0001`@8\u0006@FX\u0087\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001\u001a\u0006\u0008\u0089\u0001\u0010\u008a\u0001\"\u0006\u0008\u008b\u0001\u0010\u008c\u0001R7\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008e\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008\u001c\u0010\u008f\u0001\u001a\u0006\u0008\u0090\u0001\u0010\u0091\u0001\"\u0006\u0008\u0092\u0001\u0010\u0093\u0001R7\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0095\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008\"\u0010\u0096\u0001\u001a\u0006\u0008\u0097\u0001\u0010\u0098\u0001\"\u0006\u0008\u0099\u0001\u0010\u009a\u0001R1\u0010\u009d\u0001\u001a\u00020/2\u0007\u0010\u0086\u0001\u001a\u00020/8\u0006@FX\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008!\u0010\u009c\u0001\u001a\u0006\u0008\u009d\u0001\u0010\u009e\u0001\"\u0006\u0008\u009f\u0001\u0010\u00a0\u0001R\u001d\u0010\u00a6\u0001\u001a\u00030\u00a1\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001\u001a\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001R\u001d\u0010\u00aa\u0001\u001a\u0004\u0018\u00010K8F\u00a2\u0006\u000f\n\u0005\u0008\u0019\u0010\u00a7\u0001\u001a\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001R)\u0010\u00b1\u0001\u001a\u00030\u00ab\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008\u001a\u0010\u00ac\u0001\u001a\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001\"\u0006\u0008\u00af\u0001\u0010\u00b0\u0001R\'\u0010\u00b6\u0001\u001a\u000b\u0012\u0004\u0012\u00020K\u0018\u00010\u00b2\u00018\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008\u000c\u0010\u00b3\u0001\u001a\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001RE\u0010\u00bc\u0001\u001a\u001f\u0012\u0013\u0012\u00110:\u00a2\u0006\u000c\u0008T\u0012\u0008\u0008U\u0012\u0004\u0008\u0008(;\u0012\u0004\u0012\u00020\u0007\u0018\u00010X8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008J\u0010\u00b7\u0001\u001a\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001\"\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001R{\u0010\u00c4\u0001\u001aT\u0012\u0013\u0012\u00110G\u00a2\u0006\u000c\u0008T\u0012\u0008\u0008U\u0012\u0004\u0008\u0008(H\u0012\u0015\u0012\u0013\u0018\u00010K\u00a2\u0006\u000c\u0008T\u0012\u0008\u0008U\u0012\u0004\u0008\u0008(L\u0012\u001b\u0012\u0019\u0018\u000101j\u0004\u0018\u0001`M\u00a2\u0006\u000c\u0008T\u0012\u0008\u0008U\u0012\u0004\u0008\u0008(N\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00bd\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00be\u0001\u0010\u00bf\u0001\u001a\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001\"\u0006\u0008\u00c2\u0001\u0010\u00c3\u0001R\u0018\u0010\u00c8\u0001\u001a\u00030\u00c5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c6\u0001\u0010\u00c7\u0001R\u0018\u0010\u00cc\u0001\u001a\u00030\u00c9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ca\u0001\u0010\u00cb\u0001R\u001b\u0010\u00cf\u0001\u001a\u0005\u0018\u00010\u00cd\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008 \u0010\u00ce\u0001R\u0018\u0010\u00d3\u0001\u001a\u00030\u00d0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d1\u0001\u0010\u00d2\u0001R.\u0010\u00d9\u0001\u001a\t\u0012\u0004\u0012\u00020K0\u00d4\u00018\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0016\n\u0005\u0008\u001e\u0010\u00d5\u0001\u001a\u0005\u0008b\u0010\u00d6\u0001\"\u0006\u0008\u00d7\u0001\u0010\u00d8\u0001R\u001f\u0010\u00dd\u0001\u001a\u00030\u00da\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0004\u0008\u000f\u0010]\u001a\u0006\u0008\u00db\u0001\u0010\u00dc\u0001R\u001f\u0010\u00e1\u0001\u001a\u00030\u00de\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0004\u0008Q\u0010]\u001a\u0006\u0008\u00df\u0001\u0010\u00e0\u0001R\u0018\u0010\u00e3\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\r\u0010\u00e2\u0001R\u001b\u0010\u00e6\u0001\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00e4\u0001\u0010\u00e5\u0001R\u001f\u0010\u00ea\u0001\u001a\u00030\u00e7\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0004\u0008\u001d\u0010]\u001a\u0006\u0008\u00e8\u0001\u0010\u00e9\u0001R!\u0010\u00ee\u0001\u001a\u0005\u0018\u00010\u00eb\u00018TX\u0094\u0084\u0002\u00a2\u0006\u000e\n\u0004\u0008\u000e\u0010]\u001a\u0006\u0008\u00ec\u0001\u0010\u00ed\u0001R!\u0010\u00f2\u0001\u001a\u0005\u0018\u00010\u00ef\u00018TX\u0094\u0084\u0002\u00a2\u0006\u000e\n\u0004\u0008\u0018\u0010]\u001a\u0006\u0008\u00f0\u0001\u0010\u00f1\u0001R\u0018\u0010\u00f4\u0001\u001a\u0002078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00f3\u0001\u0010>R \u0010\u00f9\u0001\u001a\u00030\u00f5\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u00f6\u0001\u0010]\u001a\u0006\u0008\u00f7\u0001\u0010\u00f8\u0001R,\u0010\u00ff\u0001\u001a\u00030\u00fa\u00012\u0008\u0010\u0086\u0001\u001a\u00030\u00fa\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00fb\u0001\u0010\u00fc\u0001\"\u0006\u0008\u00fd\u0001\u0010\u00fe\u0001R,\u0010\u0085\u0002\u001a\u00030\u0080\u00022\u0008\u0010\u0086\u0001\u001a\u00030\u0080\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u0081\u0002\u0010\u0082\u0002\"\u0006\u0008\u0083\u0002\u0010\u0084\u0002R,\u0010\u008b\u0002\u001a\u00030\u0086\u00022\u0008\u0010\u0086\u0001\u001a\u00030\u0086\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u0087\u0002\u0010\u0088\u0002\"\u0006\u0008\u0089\u0002\u0010\u008a\u0002R,\u0010\u0091\u0002\u001a\u00030\u008c\u00022\u0008\u0010\u0086\u0001\u001a\u00030\u008c\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u008d\u0002\u0010\u008e\u0002\"\u0006\u0008\u008f\u0002\u0010\u0090\u0002R,\u0010\u0097\u0002\u001a\u00030\u0092\u00022\u0008\u0010\u0086\u0001\u001a\u00030\u0092\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u0093\u0002\u0010\u0094\u0002\"\u0006\u0008\u0095\u0002\u0010\u0096\u0002R,\u0010\u009d\u0002\u001a\u00030\u0098\u00022\u0008\u0010\u0086\u0001\u001a\u00030\u0098\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u0099\u0002\u0010\u009a\u0002\"\u0006\u0008\u009b\u0002\u0010\u009c\u0002R,\u0010\u00a3\u0002\u001a\u00030\u009e\u00022\u0008\u0010\u0086\u0001\u001a\u00030\u009e\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u009f\u0002\u0010\u00a0\u0002\"\u0006\u0008\u00a1\u0002\u0010\u00a2\u0002R0\u0010\u00a9\u0002\u001a\u0005\u0018\u00010\u00a4\u00022\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u00a4\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00a5\u0002\u0010\u00a6\u0002\"\u0006\u0008\u00a7\u0002\u0010\u00a8\u0002R>\u0010\u00b0\u0002\u001a\u000c\u0018\u00010\u00aa\u0002j\u0005\u0018\u0001`\u00ab\u00022\u0011\u0010\u0086\u0001\u001a\u000c\u0018\u00010\u00aa\u0002j\u0005\u0018\u0001`\u00ab\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00ac\u0002\u0010\u00ad\u0002\"\u0006\u0008\u00ae\u0002\u0010\u00af\u0002R*\u0010\u00b3\u0002\u001a\u00020/2\u0007\u0010\u0086\u0001\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00b1\u0002\u0010\u009e\u0001\"\u0006\u0008\u00b2\u0002\u0010\u00a0\u0001R8\u0010\u00b6\u0002\u001a\t\u0012\u0004\u0012\u00020K0\u00d4\u00012\u000e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020K0\u00d4\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00b4\u0002\u0010\u00d6\u0001\"\u0006\u0008\u00b5\u0002\u0010\u00d8\u0001R.\u0010\u00b9\u0002\u001a\u0004\u0018\u00010K2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010K8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u009c\u0001\u0010\u00a9\u0001\"\u0006\u0008\u00b7\u0002\u0010\u00b8\u0002R\u0018\u0010\u00bd\u0002\u001a\u00030\u00ba\u00028DX\u0084\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00bb\u0002\u0010\u00bc\u0002\u00a8\u0006\u00c6\u0002"
    }
    d2 = {
        "Lio/github/sceneview/SceneView;",
        "Landroid/view/SurfaceView;",
        "",
        "LVX0;",
        "Landroid/view/Choreographer$FrameCallback;",
        "LQ83;",
        "LiC1$b;",
        "",
        "f0",
        "n0",
        "LP83;",
        "e",
        "p",
        "z",
        "C",
        "x",
        "e1",
        "e2",
        "",
        "velocityX",
        "velocityY",
        "H",
        "LkW2;",
        "detector",
        "D",
        "n",
        "o",
        "LRb5;",
        "j",
        "B",
        "w",
        "Lbj5;",
        "u",
        "l",
        "k",
        "distanceX",
        "distanceY",
        "b",
        "G",
        "a",
        "LLifecycleOwner;",
        "owner",
        "onCreate",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "onResume",
        "onPause",
        "",
        "changed",
        "",
        "left",
        "top",
        "right",
        "bottom",
        "onLayout",
        "",
        "frameTimeNanos",
        "doFrame",
        "LPy1;",
        "frameTime",
        "M",
        "entity",
        "J",
        "l0",
        "Lio/github/sceneview/light/Light;",
        "light",
        "K",
        "m0",
        "Landroid/graphics/drawable/Drawable;",
        "background",
        "setBackgroundDrawable",
        "Landroid/view/MotionEvent;",
        "motionEvent",
        "onTouchEvent",
        "q",
        "Lio/github/sceneview/node/Node;",
        "node",
        "Lio/github/sceneview/renderable/Renderable;",
        "renderable",
        "h0",
        "(Landroid/view/MotionEvent;Lio/github/sceneview/node/Node;Ljava/lang/Integer;)V",
        "y",
        "Lkotlin/Function2;",
        "Lio/github/sceneview/node/ModelNode;",
        "Lkotlin/ParameterName;",
        "name",
        "onPickingCompleted",
        "i0",
        "Lkotlin/Function1;",
        "j0",
        "L",
        "Lqm5;",
        "c",
        "Lkotlin/Lazy;",
        "getLifecycle",
        "()Lqm5;",
        "lifecycle",
        "Lio/github/sceneview/SceneView$b;",
        "d",
        "Lio/github/sceneview/SceneView$b;",
        "S",
        "()Lio/github/sceneview/SceneView$b;",
        "setFrameRate",
        "(Lio/github/sceneview/SceneView$b;)V",
        "frameRate",
        "Lcom/google/android/filament/Scene;",
        "Lcom/google/android/filament/Scene;",
        "Y",
        "()Lcom/google/android/filament/Scene;",
        "setScene",
        "(Lcom/google/android/filament/Scene;)V",
        "scene",
        "Lcom/google/android/filament/View;",
        "f",
        "Lcom/google/android/filament/View;",
        "d0",
        "()Lcom/google/android/filament/View;",
        "setView",
        "(Lcom/google/android/filament/View;)V",
        "view",
        "Lcom/google/android/filament/Renderer;",
        "g",
        "Lcom/google/android/filament/Renderer;",
        "X",
        "()Lcom/google/android/filament/Renderer;",
        "setRenderer",
        "(Lcom/google/android/filament/Renderer;)V",
        "renderer",
        "Lcom/google/ar/sceneform/CameraNode;",
        "h",
        "Lcom/google/ar/sceneform/CameraNode;",
        "getCameraNode",
        "()Lcom/google/ar/sceneform/CameraNode;",
        "cameraNode",
        "value",
        "i",
        "Ljava/lang/Integer;",
        "V",
        "()Ljava/lang/Integer;",
        "setMainLight",
        "(Ljava/lang/Integer;)V",
        "mainLight",
        "Lwf1;",
        "Lwf1;",
        "R",
        "()Lwf1;",
        "setEnvironment",
        "(Lwf1;)V",
        "environment",
        "Lcom/google/android/filament/IndirectLight;",
        "Lcom/google/android/filament/IndirectLight;",
        "U",
        "()Lcom/google/android/filament/IndirectLight;",
        "setIndirectLight",
        "(Lcom/google/android/filament/IndirectLight;)V",
        "indirectLight",
        "Z",
        "isTranslucent",
        "()Z",
        "setTranslucent",
        "(Z)V",
        "Lom0;",
        "m",
        "Lom0;",
        "Q",
        "()Lom0;",
        "collisionSystem",
        "Lio/github/sceneview/node/Node;",
        "P",
        "()Lio/github/sceneview/node/Node;",
        "cameraManipulatorTarget",
        "Lio/github/sceneview/SceneView$c;",
        "Lio/github/sceneview/SceneView$c;",
        "getSelectionMode",
        "()Lio/github/sceneview/SceneView$c;",
        "setSelectionMode",
        "(Lio/github/sceneview/SceneView$c;)V",
        "selectionMode",
        "Lkotlin/Function0;",
        "Lkotlin/jvm/functions/Function0;",
        "b0",
        "()Lkotlin/jvm/functions/Function0;",
        "selectionVisualizer",
        "Lkotlin/jvm/functions/Function1;",
        "getOnFrame",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnFrame",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onFrame",
        "Lkotlin/Function3;",
        "r",
        "Lkotlin/jvm/functions/Function3;",
        "getOnTap",
        "()Lkotlin/jvm/functions/Function3;",
        "setOnTap",
        "(Lkotlin/jvm/functions/Function3;)V",
        "onTap",
        "Lcom/google/android/filament/android/UiHelper;",
        "s",
        "Lcom/google/android/filament/android/UiHelper;",
        "uiHelper",
        "Lcom/google/android/filament/android/DisplayHelper;",
        "t",
        "Lcom/google/android/filament/android/DisplayHelper;",
        "displayHelper",
        "Lcom/google/android/filament/SwapChain;",
        "Lcom/google/android/filament/SwapChain;",
        "swapChain",
        "Landroidx/lifecycle/i;",
        "v",
        "Landroidx/lifecycle/i;",
        "parentLifecycleObserver",
        "",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "setChildren",
        "(Ljava/util/List;)V",
        "children",
        "LFp6;",
        "e0",
        "()LFp6;",
        "viewAttachmentManager",
        "Landroid/os/Handler;",
        "W",
        "()Landroid/os/Handler;",
        "pickingHandler",
        "LPy1;",
        "currentFrameTime",
        "A",
        "Landroid/view/MotionEvent;",
        "lastTouchEvent",
        "LiC1;",
        "T",
        "()LiC1;",
        "gestureDetector",
        "LHb0;",
        "getCameraGestureDetector",
        "()LHb0;",
        "cameraGestureDetector",
        "Lcom/google/android/filament/utils/Manipulator;",
        "getCameraManipulator",
        "()Lcom/google/android/filament/utils/Manipulator;",
        "cameraManipulator",
        "E",
        "lastTick",
        "Lio/github/sceneview/utils/SurfaceMirrorer;",
        "F",
        "getSurfaceMirrorer",
        "()Lio/github/sceneview/utils/SurfaceMirrorer;",
        "surfaceMirrorer",
        "Lcom/google/android/filament/View$RenderQuality;",
        "getRenderQuality",
        "()Lcom/google/android/filament/View$RenderQuality;",
        "setRenderQuality",
        "(Lcom/google/android/filament/View$RenderQuality;)V",
        "renderQuality",
        "Lcom/google/android/filament/View$DynamicResolutionOptions;",
        "getDynamicResolution",
        "()Lcom/google/android/filament/View$DynamicResolutionOptions;",
        "setDynamicResolution",
        "(Lcom/google/android/filament/View$DynamicResolutionOptions;)V",
        "dynamicResolution",
        "Lcom/google/android/filament/View$MultiSampleAntiAliasingOptions;",
        "getMultiSampleAntiAliasingOptions",
        "()Lcom/google/android/filament/View$MultiSampleAntiAliasingOptions;",
        "setMultiSampleAntiAliasingOptions",
        "(Lcom/google/android/filament/View$MultiSampleAntiAliasingOptions;)V",
        "multiSampleAntiAliasingOptions",
        "Lcom/google/android/filament/View$AntiAliasing;",
        "getAntiAliasing",
        "()Lcom/google/android/filament/View$AntiAliasing;",
        "setAntiAliasing",
        "(Lcom/google/android/filament/View$AntiAliasing;)V",
        "antiAliasing",
        "Lcom/google/android/filament/View$AmbientOcclusionOptions;",
        "getAmbientOcclusionOptions",
        "()Lcom/google/android/filament/View$AmbientOcclusionOptions;",
        "setAmbientOcclusionOptions",
        "(Lcom/google/android/filament/View$AmbientOcclusionOptions;)V",
        "ambientOcclusionOptions",
        "Lcom/google/android/filament/View$BloomOptions;",
        "getBloomOptions",
        "()Lcom/google/android/filament/View$BloomOptions;",
        "setBloomOptions",
        "(Lcom/google/android/filament/View$BloomOptions;)V",
        "bloomOptions",
        "Lcom/google/android/filament/View$Dithering;",
        "getDithering",
        "()Lcom/google/android/filament/View$Dithering;",
        "setDithering",
        "(Lcom/google/android/filament/View$Dithering;)V",
        "dithering",
        "Lcom/google/android/filament/Skybox;",
        "c0",
        "()Lcom/google/android/filament/Skybox;",
        "setSkybox",
        "(Lcom/google/android/filament/Skybox;)V",
        "skybox",
        "Liu1;",
        "Lio/github/sceneview/utils/Color;",
        "getBackgroundColor",
        "()Liu1;",
        "setBackgroundColor",
        "(Liu1;)V",
        "backgroundColor",
        "g0",
        "setFrontFaceWindingInverted",
        "isFrontFaceWindingInverted",
        "a0",
        "setSelectedNodes",
        "selectedNodes",
        "setSelectedNode",
        "(Lio/github/sceneview/node/Node;)V",
        "selectedNode",
        "Landroidx/activity/ComponentActivity;",
        "N",
        "()Landroidx/activity/ComponentActivity;",
        "activity",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "defStyleAttr",
        "defStyleRes",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/google/ar/sceneform/CameraNode;)V",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public A:Landroid/view/MotionEvent;

.field public final B:Lkotlin/Lazy;

.field public final C:Lkotlin/Lazy;

.field public final D:Lkotlin/Lazy;

.field public E:J

.field public final F:Lkotlin/Lazy;

.field public final synthetic b:LiC1$c;

.field public final c:Lkotlin/Lazy;

.field public d:Lio/github/sceneview/SceneView$b;

.field public e:Lcom/google/android/filament/Scene;

.field public f:Lcom/google/android/filament/View;

.field public g:Lcom/google/android/filament/Renderer;

.field public final h:Lcom/google/ar/sceneform/CameraNode;

.field public i:Ljava/lang/Integer;
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation
.end field

.field public j:Lwf1;

.field public k:Lcom/google/android/filament/IndirectLight;

.field public l:Z

.field public final m:Lom0;

.field public final n:Lio/github/sceneview/node/Node;

.field public o:Lio/github/sceneview/SceneView$c;

.field public final p:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lio/github/sceneview/node/Node;",
            ">;"
        }
    .end annotation
.end field

.field public q:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LPy1;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public r:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroid/view/MotionEvent;",
            "-",
            "Lio/github/sceneview/node/Node;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Lcom/google/android/filament/android/UiHelper;

.field public final t:Lcom/google/android/filament/android/DisplayHelper;

.field public u:Lcom/google/android/filament/SwapChain;

.field public final v:Landroidx/lifecycle/i;

.field public w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lio/github/sceneview/node/Node;",
            ">;"
        }
    .end annotation
.end field

.field public final x:Lkotlin/Lazy;

.field public final y:Lkotlin/Lazy;

.field public z:LPy1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 9
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1e

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Lio/github/sceneview/SceneView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/google/ar/sceneform/CameraNode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1c

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lio/github/sceneview/SceneView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/google/ar/sceneform/CameraNode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v8}, Lio/github/sceneview/SceneView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/google/ar/sceneform/CameraNode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/google/ar/sceneform/CameraNode;)V
    .locals 6
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraNode"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    new-instance p2, LiC1$c;

    invoke-direct {p2}, LiC1$c;-><init>()V

    iput-object p2, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    new-instance p2, Lio/github/sceneview/SceneView$i;

    invoke-direct {p2, p0}, Lio/github/sceneview/SceneView$i;-><init>(Lio/github/sceneview/SceneView;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lio/github/sceneview/SceneView;->c:Lkotlin/Lazy;

    sget-object p2, Lio/github/sceneview/SceneView$b$a;->b:Lio/github/sceneview/SceneView$b$a;

    iput-object p2, p0, Lio/github/sceneview/SceneView;->d:Lio/github/sceneview/SceneView$b;

    iput-object p5, p0, Lio/github/sceneview/SceneView;->h:Lcom/google/ar/sceneform/CameraNode;

    new-instance p2, Lom0;

    invoke-direct {p2}, Lom0;-><init>()V

    iput-object p2, p0, Lio/github/sceneview/SceneView;->m:Lom0;

    sget-object p2, Lio/github/sceneview/SceneView$c;->d:Lio/github/sceneview/SceneView$c;

    iput-object p2, p0, Lio/github/sceneview/SceneView;->o:Lio/github/sceneview/SceneView$c;

    sget-object p2, Lio/github/sceneview/SceneView$l;->g:Lio/github/sceneview/SceneView$l;

    iput-object p2, p0, Lio/github/sceneview/SceneView;->p:Lkotlin/jvm/functions/Function0;

    new-instance p2, Lcom/google/android/filament/android/UiHelper;

    sget-object p3, Lcom/google/android/filament/android/UiHelper$ContextErrorPolicy;->DONT_CHECK:Lcom/google/android/filament/android/UiHelper$ContextErrorPolicy;

    invoke-direct {p2, p3}, Lcom/google/android/filament/android/UiHelper;-><init>(Lcom/google/android/filament/android/UiHelper$ContextErrorPolicy;)V

    new-instance p3, Lio/github/sceneview/SceneView$d;

    invoke-direct {p3, p0}, Lio/github/sceneview/SceneView$d;-><init>(Lio/github/sceneview/SceneView;)V

    invoke-virtual {p2, p3}, Lcom/google/android/filament/android/UiHelper;->setRenderCallback(Lcom/google/android/filament/android/UiHelper$RendererCallback;)V

    invoke-virtual {p2, p0}, Lcom/google/android/filament/android/UiHelper;->attachTo(Landroid/view/SurfaceView;)V

    iput-object p2, p0, Lio/github/sceneview/SceneView;->s:Lcom/google/android/filament/android/UiHelper;

    new-instance p2, Lcom/google/android/filament/android/DisplayHelper;

    invoke-direct {p2, p1}, Lcom/google/android/filament/android/DisplayHelper;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lio/github/sceneview/SceneView;->t:Lcom/google/android/filament/android/DisplayHelper;

    new-instance p2, Lio/github/sceneview/SceneView$parentLifecycleObserver$1;

    invoke-direct {p2, p0}, Lio/github/sceneview/SceneView$parentLifecycleObserver$1;-><init>(Lio/github/sceneview/SceneView;)V

    iput-object p2, p0, Lio/github/sceneview/SceneView;->v:Landroidx/lifecycle/i;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lio/github/sceneview/SceneView;->w:Ljava/util/List;

    new-instance p2, Lio/github/sceneview/SceneView$n;

    invoke-direct {p2, p1, p0}, Lio/github/sceneview/SceneView$n;-><init>(Landroid/content/Context;Lio/github/sceneview/SceneView;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lio/github/sceneview/SceneView;->x:Lkotlin/Lazy;

    sget-object p2, Lio/github/sceneview/SceneView$k;->g:Lio/github/sceneview/SceneView$k;

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lio/github/sceneview/SceneView;->y:Lkotlin/Lazy;

    new-instance p2, LPy1;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, LPy1;-><init>(JLjava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lio/github/sceneview/SceneView;->z:LPy1;

    new-instance p2, Lio/github/sceneview/SceneView$h;

    invoke-direct {p2, p1, p0}, Lio/github/sceneview/SceneView$h;-><init>(Landroid/content/Context;Lio/github/sceneview/SceneView;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lio/github/sceneview/SceneView;->B:Lkotlin/Lazy;

    new-instance p1, Lio/github/sceneview/SceneView$f;

    invoke-direct {p1, p0}, Lio/github/sceneview/SceneView$f;-><init>(Lio/github/sceneview/SceneView;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lio/github/sceneview/SceneView;->C:Lkotlin/Lazy;

    new-instance p1, Lio/github/sceneview/SceneView$g;

    invoke-direct {p1, p0, p5}, Lio/github/sceneview/SceneView$g;-><init>(Lio/github/sceneview/SceneView;Lcom/google/ar/sceneform/CameraNode;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lio/github/sceneview/SceneView;->D:Lkotlin/Lazy;

    new-instance p1, Lio/github/sceneview/SceneView$m;

    invoke-direct {p1, p0}, Lio/github/sceneview/SceneView$m;-><init>(Lio/github/sceneview/SceneView;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lio/github/sceneview/SceneView;->F:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/google/ar/sceneform/CameraNode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    const/4 p7, 0x0

    if-eqz p2, :cond_1

    move v3, p7

    goto :goto_0

    :cond_1
    move v3, p3

    :goto_0
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    move v4, p7

    goto :goto_1

    :cond_2
    move v4, p4

    :goto_1
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    new-instance p5, Lcom/google/ar/sceneform/CameraNode;

    invoke-direct {p5}, Lcom/google/ar/sceneform/CameraNode;-><init>()V

    :cond_3
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/github/sceneview/SceneView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/google/ar/sceneform/CameraNode;)V

    return-void
.end method

.method public static final synthetic access$getDisplayHelper$p(Lio/github/sceneview/SceneView;)Lcom/google/android/filament/android/DisplayHelper;
    .locals 0

    iget-object p0, p0, Lio/github/sceneview/SceneView;->t:Lcom/google/android/filament/android/DisplayHelper;

    return-object p0
.end method

.method public static final synthetic access$getSwapChain$p(Lio/github/sceneview/SceneView;)Lcom/google/android/filament/SwapChain;
    .locals 0

    iget-object p0, p0, Lio/github/sceneview/SceneView;->u:Lcom/google/android/filament/SwapChain;

    return-object p0
.end method

.method public static final synthetic access$setSwapChain$p(Lio/github/sceneview/SceneView;Lcom/google/android/filament/SwapChain;)V
    .locals 0

    iput-object p1, p0, Lio/github/sceneview/SceneView;->u:Lcom/google/android/filament/SwapChain;

    return-void
.end method

.method private final f0()V
    .locals 8

    sget-object v0, Ldl1;->a:Ldl1;

    invoke-virtual {v0}, Ldl1;->l()V

    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/Engine;->createRenderer()Lcom/google/android/filament/Renderer;

    move-result-object v0

    const-string v1, "engine.createRenderer()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->setRenderer(Lcom/google/android/filament/Renderer;)V

    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/Engine;->createScene()Lcom/google/android/filament/Scene;

    move-result-object v0

    const-string v1, "engine.createScene()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->setScene(Lcom/google/android/filament/Scene;)V

    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/Engine;->createView()Lcom/google/android/filament/View;

    move-result-object v0

    const-string v1, "engine.createView()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->setView(Lcom/google/android/filament/View;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/View;->setScene(Lcom/google/android/filament/Scene;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getCameraNode()Lcom/google/ar/sceneform/CameraNode;

    move-result-object v1

    iget-object v1, v1, Lcom/google/ar/sceneform/CameraNode;->Q:Lcom/google/android/filament/Camera;

    invoke-virtual {v0, v1}, Lcom/google/android/filament/View;->setCamera(Lcom/google/android/filament/Camera;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    new-instance v1, Lcom/google/android/filament/ColorGrading$Builder;

    invoke-direct {v1}, Lcom/google/android/filament/ColorGrading$Builder;-><init>()V

    sget-object v2, Lcom/google/android/filament/ColorGrading$ToneMapping;->FILMIC:Lcom/google/android/filament/ColorGrading$ToneMapping;

    invoke-virtual {v1, v2}, Lcom/google/android/filament/ColorGrading$Builder;->toneMapping(Lcom/google/android/filament/ColorGrading$ToneMapping;)Lcom/google/android/filament/ColorGrading$Builder;

    move-result-object v1

    const-string v2, "Builder()\n            .t\u2026ading.ToneMapping.FILMIC)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LCr6;->a(Lcom/google/android/filament/ColorGrading$Builder;)Lcom/google/android/filament/ColorGrading;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/View;->setColorGrading(Lcom/google/android/filament/ColorGrading;)V

    const v0, 0x45cb2000    # 6500.0f

    invoke-static {v0}, Lcom/google/android/filament/Colors;->cct(F)[F

    move-result-object v0

    const-string v1, "cct(6_500.0f)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    aget v1, v0, v1

    const/4 v2, 0x1

    aget v3, v0, v2

    const/4 v4, 0x2

    aget v0, v0, v4

    new-instance v4, Lcom/google/android/filament/LightManager$Builder;

    sget-object v5, Lcom/google/android/filament/LightManager$Type;->DIRECTIONAL:Lcom/google/android/filament/LightManager$Type;

    invoke-direct {v4, v5}, Lcom/google/android/filament/LightManager$Builder;-><init>(Lcom/google/android/filament/LightManager$Type;)V

    invoke-virtual {v4, v1, v3, v0}, Lcom/google/android/filament/LightManager$Builder;->color(FFF)Lcom/google/android/filament/LightManager$Builder;

    move-result-object v0

    const v1, 0x47c35000    # 100000.0f

    invoke-virtual {v0, v1}, Lcom/google/android/filament/LightManager$Builder;->intensity(F)Lcom/google/android/filament/LightManager$Builder;

    move-result-object v0

    const/4 v1, 0x0

    const/high16 v3, -0x40800000    # -1.0f

    invoke-virtual {v0, v1, v3, v1}, Lcom/google/android/filament/LightManager$Builder;->direction(FFF)Lcom/google/android/filament/LightManager$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/filament/LightManager$Builder;->castShadows(Z)Lcom/google/android/filament/LightManager$Builder;

    move-result-object v0

    const-string v1, "Builder(LightManager.Typ\u2026       .castShadows(true)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LNq2;->a(Lcom/google/android/filament/LightManager$Builder;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->setMainLight(Ljava/lang/Integer;)V

    sget-object v1, Lcom/google/android/filament/utils/KTX1Loader;->INSTANCE:Lcom/google/android/filament/utils/KTX1Loader;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v0, "context"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getLifecycle()Lqm5;

    move-result-object v3

    const-string v4, "sceneview/environments/indoor_studio/indoor_studio_ibl.ktx"

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, LMj2;->g(Lcom/google/android/filament/utils/KTX1Loader;Landroid/content/Context;Landroidx/lifecycle/f;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lwf1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->setEnvironment(Lwf1;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getCameraNode()Lcom/google/ar/sceneform/CameraNode;

    move-result-object v0

    invoke-virtual {v0, p0}, Lio/github/sceneview/node/Node;->y0(LQ83;)V

    return-void
.end method

.method public static final k0(Lio/github/sceneview/SceneView;Lkotlin/jvm/functions/Function2;Lcom/google/android/filament/View$PickingQueryResult;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$onPickingCompleted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pickResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p2, Lcom/google/android/filament/View$PickingQueryResult;->renderable:I

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->O()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/sceneview/node/Node;

    instance-of v3, v1, Lio/github/sceneview/node/ModelNode;

    if-eqz v3, :cond_1

    move-object v2, v1

    check-cast v2, Lio/github/sceneview/node/ModelNode;

    :cond_1
    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/github/sceneview/node/ModelNode;

    invoke-virtual {v1}, Lio/github/sceneview/node/ModelNode;->P0()Ljava/util/List;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    move-object v2, v0

    :cond_4
    check-cast v2, Lio/github/sceneview/node/ModelNode;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p1, v2, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic y(Lio/github/sceneview/SceneView;Lkotlin/jvm/functions/Function2;Lcom/google/android/filament/View$PickingQueryResult;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/sceneview/SceneView;->k0(Lio/github/sceneview/SceneView;Lkotlin/jvm/functions/Function2;Lcom/google/android/filament/View$PickingQueryResult;)V

    return-void
.end method


# virtual methods
.method public A(Lio/github/sceneview/node/Node;)V
    .locals 0

    invoke-static {p0, p1}, LQ83$a;->f(LQ83;Lio/github/sceneview/node/Node;)V

    return-void
.end method

.method public B(LRb5;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1, p2}, LiC1$c;->B(LRb5;LP83;)V

    return-void
.end method

.method public C(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->C(LP83;)V

    return-void
.end method

.method public D(LkW2;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1, p2}, LiC1$c;->D(LkW2;LP83;)V

    return-void
.end method

.method public E(Lio/github/sceneview/node/Node;)Lio/github/sceneview/node/Node;
    .locals 0

    invoke-static {p0, p1}, LQ83$a;->g(LQ83;Lio/github/sceneview/node/Node;)Lio/github/sceneview/node/Node;

    move-result-object p1

    return-object p1
.end method

.method public G(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->G(LP83;)V

    return-void
.end method

.method public H(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->H(LP83;)V

    return-void
.end method

.method public final J(I)V
    .locals 1
    .param p1    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/Scene;->addEntity(I)V

    return-void
.end method

.method public final K(I)V
    .locals 1
    .param p1    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/Scene;->addEntity(I)V

    return-void
.end method

.method public L()V
    .locals 3

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, p0, Lio/github/sceneview/SceneView;->s:Lcom/google/android/filament/android/UiHelper;

    invoke-virtual {v0}, Lcom/google/android/filament/android/UiHelper;->detach()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getCameraNode()Lcom/google/ar/sceneform/CameraNode;

    move-result-object v0

    invoke-virtual {v0}, Lio/github/sceneview/node/Node;->N()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    const/4 v0, 0x0

    :try_start_2
    iget-object v1, p0, Lio/github/sceneview/SceneView;->i:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, LNq2;->c(I)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_2

    :cond_0
    move-object v1, v0

    :goto_2
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    :try_start_3
    iget-object v1, p0, Lio/github/sceneview/SceneView;->k:Lcom/google/android/filament/IndirectLight;

    if-eqz v1, :cond_1

    invoke-static {v1}, LD12;->b(Lcom/google/android/filament/IndirectLight;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_4

    :cond_1
    move-object v1, v0

    :goto_4
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_5
    :try_start_4
    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->c0()Lcom/google/android/filament/Skybox;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, LWD5;->b(Lcom/google/android/filament/Skybox;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_6

    :catchall_4
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_6
    :try_start_5
    invoke-static {}, LnM4;->d()LnM4;

    move-result-object v0

    invoke-virtual {v0}, LnM4;->c()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_7

    :catchall_5
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_7
    :try_start_6
    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->X()Lcom/google/android/filament/Renderer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/Engine;->destroyRenderer(Lcom/google/android/filament/Renderer;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_8

    :catchall_6
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_8
    :try_start_7
    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/Engine;->destroyView(Lcom/google/android/filament/View;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_9

    :catchall_7
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_9
    :try_start_8
    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/Engine;->destroyScene(Lcom/google/android/filament/Scene;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    goto :goto_a

    :catchall_8
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_a
    sget-object v0, Ldl1;->a:Ldl1;

    invoke-virtual {v0}, Ldl1;->k()V

    return-void
.end method

.method public M(LPy1;)V
    .locals 4

    const-string v0, "frameTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->s:Lcom/google/android/filament/android/UiHelper;

    invoke-virtual {v0}, Lcom/google/android/filament/android/UiHelper;->isReadyToRender()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Ldl1;->j()Lcom/google/android/filament/TransformManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/TransformManager;->openLocalTransformTransaction()V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->A:Landroid/view/MotionEvent;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getCameraManipulator()Lcom/google/android/filament/utils/Manipulator;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LPy1;->d()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/utils/Manipulator;->update(F)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getCameraNode()Lcom/google/ar/sceneform/CameraNode;

    move-result-object v1

    invoke-static {v0}, LIb0;->a(Lcom/google/android/filament/utils/Manipulator;)LyM2;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/github/sceneview/node/Node;->H0(LyM2;)V

    :cond_0
    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getLifecycle()Lqm5;

    move-result-object v0

    invoke-virtual {v0}, LTX0;->q()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LFq2;

    instance-of v3, v2, Lrm5;

    if-nez v3, :cond_2

    const/4 v2, 0x0

    :cond_2
    check-cast v2, Lrm5;

    if-eqz v2, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrm5;

    invoke-interface {v1, p1}, Lrm5;->g(LPy1;)V

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lio/github/sceneview/SceneView;->q:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_5

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-static {}, Ldl1;->j()Lcom/google/android/filament/TransformManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/TransformManager;->commitLocalTransformTransaction()V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->X()Lcom/google/android/filament/Renderer;

    move-result-object v0

    iget-object v1, p0, Lio/github/sceneview/SceneView;->u:Lcom/google/android/filament/SwapChain;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, LPy1;->f()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/filament/Renderer;->beginFrame(Lcom/google/android/filament/SwapChain;J)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->X()Lcom/google/android/filament/Renderer;

    move-result-object p1

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/filament/Renderer;->render(Lcom/google/android/filament/View;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->X()Lcom/google/android/filament/Renderer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/filament/Renderer;->endFrame()V

    :cond_6
    return-void
.end method

.method public final N()Landroidx/activity/ComponentActivity;
    .locals 2

    :try_start_0
    invoke-static {p0}, LAr6;->a(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-string v1, "{\n            findFragme\u2026quireActivity()\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LBr6;->a(Landroid/content/Context;)Landroidx/activity/ComponentActivity;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method public O()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/sceneview/node/Node;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LQ83$a;->b(LQ83;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final P()Lio/github/sceneview/node/Node;
    .locals 3

    iget-object v0, p0, Lio/github/sceneview/SceneView;->n:Lio/github/sceneview/node/Node;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->Z()Lio/github/sceneview/node/Node;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->O()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/github/sceneview/node/Node;

    instance-of v2, v2, Lio/github/sceneview/node/ModelNode;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    move-object v0, v1

    check-cast v0, Lio/github/sceneview/node/Node;

    :cond_2
    return-object v0
.end method

.method public final Q()Lom0;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->m:Lom0;

    return-object v0
.end method

.method public final R()Lwf1;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->j:Lwf1;

    return-object v0
.end method

.method public S()Lio/github/sceneview/SceneView$b;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->d:Lio/github/sceneview/SceneView$b;

    return-object v0
.end method

.method public final T()LiC1;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->B:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LiC1;

    return-object v0
.end method

.method public final U()Lcom/google/android/filament/IndirectLight;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->k:Lcom/google/android/filament/IndirectLight;

    return-object v0
.end method

.method public final V()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public final W()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->y:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    return-object v0
.end method

.method public final X()Lcom/google/android/filament/Renderer;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->g:Lcom/google/android/filament/Renderer;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "renderer"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Y()Lcom/google/android/filament/Scene;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->e:Lcom/google/android/filament/Scene;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "scene"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Z()Lio/github/sceneview/node/Node;
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->a0()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/sceneview/node/Node;

    return-object v0
.end method

.method public a(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->a(LP83;)V

    return-void
.end method

.method public final a0()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/sceneview/node/Node;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->O()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/github/sceneview/node/Node;

    invoke-virtual {v3}, Lio/github/sceneview/node/Node;->n0()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public b(LP83;LP83;FF)V
    .locals 1

    const-string v0, "e1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1, p2, p3, p4}, LiC1$c;->b(LP83;LP83;FF)V

    return-void
.end method

.method public b0()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lio/github/sceneview/node/Node;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/sceneview/SceneView;->p:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final c0()Lcom/google/android/filament/Skybox;
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/Scene;->getSkybox()Lcom/google/android/filament/Skybox;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/sceneview/node/Node;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/sceneview/SceneView;->w:Ljava/util/List;

    return-object v0
.end method

.method public final d0()Lcom/google/android/filament/View;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->f:Lcom/google/android/filament/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "view"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public doFrame(J)V
    .locals 6

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    const/16 v4, 0x3c

    int-to-long v4, v4

    div-long/2addr v2, v4

    div-long/2addr v0, v2

    iget-wide v2, p0, Lio/github/sceneview/SceneView;->E:J

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->S()Lio/github/sceneview/SceneView$b;

    move-result-object v4

    invoke-virtual {v4}, Lio/github/sceneview/SceneView$b;->a()J

    move-result-wide v4

    div-long/2addr v2, v4

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->S()Lio/github/sceneview/SceneView$b;

    move-result-object v4

    invoke-virtual {v4}, Lio/github/sceneview/SceneView$b;->a()J

    move-result-wide v4

    div-long/2addr v0, v4

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    new-instance v0, LPy1;

    iget-object v1, p0, Lio/github/sceneview/SceneView;->z:LPy1;

    invoke-virtual {v1}, LPy1;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, LPy1;-><init>(JLjava/lang/Long;)V

    iput-object v0, p0, Lio/github/sceneview/SceneView;->z:LPy1;

    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->M(LPy1;)V

    :cond_0
    return-void
.end method

.method public e(LP83;LP83;FF)V
    .locals 1

    const-string v0, "e1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1, p2, p3, p4}, LiC1$c;->e(LP83;LP83;FF)V

    return-void
.end method

.method public final e0()LFp6;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->x:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFp6;

    return-object v0
.end method

.method public f(Lio/github/sceneview/node/Node;)Lio/github/sceneview/node/Node;
    .locals 0

    invoke-static {p0, p1}, LQ83$a;->a(LQ83;Lio/github/sceneview/node/Node;)Lio/github/sceneview/node/Node;

    move-result-object p1

    return-object p1
.end method

.method public final g0()Z
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/View;->isFrontFaceWindingInverted()Z

    move-result v0

    return v0
.end method

.method public getCameraGestureDetector()LHb0;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->C:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHb0;

    return-object v0
.end method

.method public getCameraManipulator()Lcom/google/android/filament/utils/Manipulator;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->D:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/filament/utils/Manipulator;

    return-object v0
.end method

.method public getCameraNode()Lcom/google/ar/sceneform/CameraNode;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->h:Lcom/google/ar/sceneform/CameraNode;

    return-object v0
.end method

.method public bridge synthetic getLifecycle()Landroidx/lifecycle/f;
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getLifecycle()Lqm5;

    move-result-object v0

    return-object v0
.end method

.method public getLifecycle()Lqm5;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqm5;

    return-object v0
.end method

.method public h0(Landroid/view/MotionEvent;Lio/github/sceneview/node/Node;Ljava/lang/Integer;)V
    .locals 3

    const-string v0, "motionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    iget-object v1, p0, Lio/github/sceneview/SceneView;->o:Lio/github/sceneview/SceneView$c;

    sget-object v2, Lio/github/sceneview/SceneView$e;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lio/github/sceneview/SceneView;->o:Lio/github/sceneview/SceneView$c;

    invoke-virtual {v1}, Lio/github/sceneview/SceneView$c;->b()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->setSelectedNode(Lio/github/sceneview/node/Node;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lio/github/sceneview/node/Node;->m0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lio/github/sceneview/node/Node;->n0()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->a0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->a0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->minus(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_0
    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->setSelectedNodes(Ljava/util/List;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lio/github/sceneview/node/Node;->m0()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p2}, Lio/github/sceneview/node/Node;->n0()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0, p2}, Lio/github/sceneview/SceneView;->setSelectedNode(Lio/github/sceneview/node/Node;)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lio/github/sceneview/SceneView;->o:Lio/github/sceneview/SceneView$c;

    invoke-virtual {v1}, Lio/github/sceneview/SceneView$c;->b()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->setSelectedNode(Lio/github/sceneview/node/Node;)V

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lio/github/sceneview/SceneView;->o:Lio/github/sceneview/SceneView$c;

    invoke-virtual {v1}, Lio/github/sceneview/SceneView$c;->b()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->setSelectedNode(Lio/github/sceneview/node/Node;)V

    :cond_5
    :goto_1
    iget-object v0, p0, Lio/github/sceneview/SceneView;->r:Lkotlin/jvm/functions/Function3;

    if-eqz v0, :cond_6

    invoke-interface {v0, p1, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-void
.end method

.method public final i0(IILkotlin/jvm/functions/Function2;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lio/github/sceneview/node/ModelNode;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onPickingCompleted"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p2

    :try_start_0
    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object p2

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->W()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lsm5;

    invoke-direct {v2, p0, p3}, Lsm5;-><init>(Lio/github/sceneview/SceneView;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {p2, p1, v0, v1, v2}, Lcom/google/android/filament/View;->pick(IILjava/lang/Object;Lcom/google/android/filament/View$OnPickCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public j(LRb5;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1, p2}, LiC1$c;->j(LRb5;LP83;)V

    return-void
.end method

.method public final j0(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/MotionEvent;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LP83;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPickingCompleted"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    new-instance v2, Lio/github/sceneview/SceneView$j;

    invoke-direct {v2, p2, p1}, Lio/github/sceneview/SceneView$j;-><init>(Lkotlin/jvm/functions/Function1;Landroid/view/MotionEvent;)V

    invoke-virtual {p0, v0, v1, v2}, Lio/github/sceneview/SceneView;->i0(IILkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public k(Lbj5;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1, p2}, LiC1$c;->k(Lbj5;LP83;)V

    return-void
.end method

.method public l(Lbj5;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1, p2}, LiC1$c;->l(Lbj5;LP83;)V

    return-void
.end method

.method public final l0(I)V
    .locals 1
    .param p1    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/Scene;->removeEntity(I)V

    return-void
.end method

.method public final m0(I)V
    .locals 1
    .param p1    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/Scene;->removeEntity(I)V

    return-void
.end method

.method public n(LkW2;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1, p2}, LiC1$c;->n(LkW2;LP83;)V

    return-void
.end method

.method public final n0()V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    move-result v0

    const/16 v2, 0xff

    if-eq v0, v2, :cond_1

    :cond_0
    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->c0()Lcom/google/android/filament/Skybox;

    move-result-object v0

    if-eqz v0, :cond_4

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v2, v0, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v2, :cond_2

    move-object v1, v0

    check-cast v1, Landroid/graphics/drawable/ColorDrawable;

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v0

    goto :goto_0

    :cond_3
    const/high16 v0, -0x1000000

    :goto_0
    invoke-static {v0}, Lum0;->c(I)Liu1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->setBackgroundColor(Liu1;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->setTranslucent(Z)V

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v0, v2, v1}, Lum0;->e(FFILjava/lang/Object;)Liu1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->setBackgroundColor(Liu1;)V

    invoke-virtual {p0, v2}, Lio/github/sceneview/SceneView;->setTranslucent(Z)V

    :goto_1
    return-void
.end method

.method public o(LkW2;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1, p2}, LiC1$c;->o(LkW2;LP83;)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 3

    invoke-super {p0}, Landroid/view/SurfaceView;->onAttachedToWindow()V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getLifecycle()Lqm5;

    move-result-object v0

    invoke-virtual {v0, p0}, LTX0;->a(LFq2;)V

    invoke-static {p0}, LQt6;->a(Landroid/view/View;)LLifecycleOwner;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/github/sceneview/SceneView;->v:Landroidx/lifecycle/i;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->a(LFq2;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getLifecycle()Lqm5;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/j;->b()Landroidx/lifecycle/f$b;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$b;

    move-result-object v2

    if-eq v1, v2, :cond_0

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getLifecycle()Lqm5;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$b;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/lifecycle/j;->o(Landroidx/lifecycle/f$b;)V

    :cond_0
    return-void
.end method

.method public onCreate(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onCreate(LLifecycleOwner;)V

    invoke-direct {p0}, Lio/github/sceneview/SceneView;->f0()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    invoke-static {p0}, LQt6;->a(Landroid/view/View;)LLifecycleOwner;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/github/sceneview/SceneView;->v:Landroidx/lifecycle/i;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->d(LFq2;)V

    :cond_0
    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getLifecycle()Lqm5;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/j;->b()Landroidx/lifecycle/f$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/f$b;->b:Landroidx/lifecycle/f$b;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getLifecycle()Lqm5;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j;->o(Landroidx/lifecycle/f$b;)V

    :cond_1
    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->L()V

    invoke-super {p0}, Landroid/view/SurfaceView;->onDetachedFromWindow()V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getLifecycle()Lqm5;

    move-result-object p1

    invoke-virtual {p1}, LTX0;->q()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LFq2;

    instance-of p4, p3, Lrm5;

    if-nez p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    check-cast p3, Lrm5;

    if-eqz p3, :cond_0

    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lrm5;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p4

    invoke-interface {p2, p3, p4}, Lrm5;->I(II)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public onPause(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onPause(LLifecycleOwner;)V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->e0()LFp6;

    move-result-object p1

    invoke-virtual {p1}, LFp6;->f()V

    return-void
.end method

.method public onResume(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onResume(LLifecycleOwner;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->e0()LFp6;

    move-result-object p1

    invoke-virtual {p1}, LFp6;->g()V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    const-string v0, "motionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Lio/github/sceneview/SceneView;->A:Landroid/view/MotionEvent;

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->T()LiC1;

    move-result-object v0

    invoke-virtual {v0, p1}, LiC1;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->getCameraGestureDetector()LHb0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LHb0;->e(Landroid/view/MotionEvent;)V

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public p(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->p(LP83;)V

    return-void
.end method

.method public q(LP83;)V
    .locals 2

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LP83;->a()Landroid/view/MotionEvent;

    move-result-object v0

    invoke-virtual {p1}, LP83;->b()Lio/github/sceneview/node/Node;

    move-result-object v1

    invoke-virtual {p1}, LP83;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, v1, p1}, Lio/github/sceneview/SceneView;->h0(Landroid/view/MotionEvent;Lio/github/sceneview/node/Node;Ljava/lang/Integer;)V

    return-void
.end method

.method public s()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lio/github/sceneview/node/Node;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LQ83$a;->d(LQ83;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final setAmbientOcclusionOptions(Lcom/google/android/filament/View$AmbientOcclusionOptions;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/View;->setAmbientOcclusionOptions(Lcom/google/android/filament/View$AmbientOcclusionOptions;)V

    return-void
.end method

.method public final setAntiAliasing(Lcom/google/android/filament/View$AntiAliasing;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/View;->setAntiAliasing(Lcom/google/android/filament/View$AntiAliasing;)V

    return-void
.end method

.method public final setBackgroundColor(Liu1;)V
    .locals 6

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->X()Lcom/google/android/filament/Renderer;

    move-result-object v0

    new-instance v1, Lcom/google/android/filament/Renderer$ClearOptions;

    invoke-direct {v1}, Lcom/google/android/filament/Renderer$ClearOptions;-><init>()V

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/google/android/filament/Renderer$ClearOptions;->clear:Z

    const/4 v3, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Liu1;->d()F

    move-result v4

    const/high16 v5, 0x3f800000    # 1.0f

    cmpg-float v4, v4, v5

    if-nez v4, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move v4, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v4, v2

    :goto_2
    invoke-virtual {p0, v4}, Lio/github/sceneview/SceneView;->setTranslucent(Z)V

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Liu1;->d()F

    move-result v4

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    move v2, v3

    :goto_3
    if-nez v2, :cond_4

    invoke-virtual {p1}, Liu1;->h()[F

    move-result-object p1

    iput-object p1, v1, Lcom/google/android/filament/Renderer$ClearOptions;->clearColor:[F

    :cond_4
    invoke-virtual {v0, v1}, Lcom/google/android/filament/Renderer;->setClearOptions(Lcom/google/android/filament/Renderer$ClearOptions;)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Deprecated in Java"
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->n0()V

    :cond_0
    return-void
.end method

.method public final setBloomOptions(Lcom/google/android/filament/View$BloomOptions;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/View;->setBloomOptions(Lcom/google/android/filament/View$BloomOptions;)V

    return-void
.end method

.method public setChildren(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/github/sceneview/node/Node;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/github/sceneview/SceneView;->w:Ljava/util/List;

    return-void
.end method

.method public final setDithering(Lcom/google/android/filament/View$Dithering;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/View;->setDithering(Lcom/google/android/filament/View$Dithering;)V

    return-void
.end method

.method public final setDynamicResolution(Lcom/google/android/filament/View$DynamicResolutionOptions;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/View;->setDynamicResolutionOptions(Lcom/google/android/filament/View$DynamicResolutionOptions;)V

    return-void
.end method

.method public final setEnvironment(Lwf1;)V
    .locals 2

    iput-object p1, p0, Lio/github/sceneview/SceneView;->j:Lwf1;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lwf1;->b()Lcom/google/android/filament/IndirectLight;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-virtual {p0, v1}, Lio/github/sceneview/SceneView;->setIndirectLight(Lcom/google/android/filament/IndirectLight;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lwf1;->c()Lcom/google/android/filament/Skybox;

    move-result-object v0

    :cond_1
    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->setSkybox(Lcom/google/android/filament/Skybox;)V

    return-void
.end method

.method public setFrameRate(Lio/github/sceneview/SceneView$b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/github/sceneview/SceneView;->d:Lio/github/sceneview/SceneView$b;

    return-void
.end method

.method public final setFrontFaceWindingInverted(Z)V
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/View;->setFrontFaceWindingInverted(Z)V

    return-void
.end method

.method public final setIndirectLight(Lcom/google/android/filament/IndirectLight;)V
    .locals 1

    iput-object p1, p0, Lio/github/sceneview/SceneView;->k:Lcom/google/android/filament/IndirectLight;

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/Scene;->setIndirectLight(Lcom/google/android/filament/IndirectLight;)V

    return-void
.end method

.method public final setMainLight(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView;->i:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lio/github/sceneview/SceneView;->m0(I)V

    :cond_0
    iput-object p1, p0, Lio/github/sceneview/SceneView;->i:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lio/github/sceneview/SceneView;->K(I)V

    :cond_1
    return-void
.end method

.method public final setMultiSampleAntiAliasingOptions(Lcom/google/android/filament/View$MultiSampleAntiAliasingOptions;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/View;->setMultiSampleAntiAliasingOptions(Lcom/google/android/filament/View$MultiSampleAntiAliasingOptions;)V

    return-void
.end method

.method public final setOnFrame(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LPy1;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/github/sceneview/SceneView;->q:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnTap(Lkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroid/view/MotionEvent;",
            "-",
            "Lio/github/sceneview/node/Node;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/github/sceneview/SceneView;->r:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public final setRenderQuality(Lcom/google/android/filament/View$RenderQuality;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/View;->setRenderQuality(Lcom/google/android/filament/View$RenderQuality;)V

    return-void
.end method

.method public final setRenderer(Lcom/google/android/filament/Renderer;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/github/sceneview/SceneView;->g:Lcom/google/android/filament/Renderer;

    return-void
.end method

.method public final setScene(Lcom/google/android/filament/Scene;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/github/sceneview/SceneView;->e:Lcom/google/android/filament/Scene;

    return-void
.end method

.method public final setSelectedNode(Lio/github/sceneview/node/Node;)V
    .locals 0

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/github/sceneview/SceneView;->setSelectedNodes(Ljava/util/List;)V

    return-void
.end method

.method public final setSelectedNodes(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/github/sceneview/node/Node;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->O()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/sceneview/node/Node;

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1, v2}, Lio/github/sceneview/node/Node;->F0(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final setSelectionMode(Lio/github/sceneview/SceneView$c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/github/sceneview/SceneView;->o:Lio/github/sceneview/SceneView$c;

    return-void
.end method

.method public final setSkybox(Lcom/google/android/filament/Skybox;)V
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/Scene;->setSkybox(Lcom/google/android/filament/Skybox;)V

    return-void
.end method

.method public final setTranslucent(Z)V
    .locals 2

    iget-boolean v0, p0, Lio/github/sceneview/SceneView;->l:Z

    if-eq v0, p1, :cond_2

    iput-boolean p1, p0, Lio/github/sceneview/SceneView;->l:Z

    invoke-virtual {p0, p1}, Landroid/view/SurfaceView;->setZOrderOnTop(Z)V

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    if-eqz p1, :cond_0

    const/4 v1, -0x3

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    invoke-virtual {p0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    if-eqz p1, :cond_1

    sget-object p1, Lcom/google/android/filament/View$BlendMode;->TRANSLUCENT:Lcom/google/android/filament/View$BlendMode;

    goto :goto_1

    :cond_1
    sget-object p1, Lcom/google/android/filament/View$BlendMode;->OPAQUE:Lcom/google/android/filament/View$BlendMode;

    :goto_1
    invoke-virtual {v0, p1}, Lcom/google/android/filament/View;->setBlendMode(Lcom/google/android/filament/View$BlendMode;)V

    :cond_2
    return-void
.end method

.method public final setView(Lcom/google/android/filament/View;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/github/sceneview/SceneView;->f:Lcom/google/android/filament/View;

    return-void
.end method

.method public t(Lio/github/sceneview/node/Node;)V
    .locals 0

    invoke-static {p0, p1}, LQ83$a;->e(LQ83;Lio/github/sceneview/node/Node;)V

    return-void
.end method

.method public u(Lbj5;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1, p2}, LiC1$c;->u(Lbj5;LP83;)V

    return-void
.end method

.method public v()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lio/github/sceneview/node/Node;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LQ83$a;->c(LQ83;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public w(LRb5;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1, p2}, LiC1$c;->w(LRb5;LP83;)V

    return-void
.end method

.method public x(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->x(LP83;)V

    return-void
.end method

.method public z(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->z(LP83;)V

    return-void
.end method
