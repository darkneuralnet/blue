.class public Lio/github/sceneview/node/Node;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ83;
.implements Lo96;
.implements Lrm5;
.implements LiC1$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/sceneview/node/Node$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0015\n\u0002\u0008<\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010 \n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0017\u0018\u0000 \u00112\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0016B/\u0012\u000c\u0008\u0002\u0010C\u001a\u00060Aj\u0002`B\u0012\u0008\u0008\u0002\u0010D\u001a\u000200\u0012\u000c\u0008\u0002\u0010F\u001a\u00060Aj\u0002`E\u00a2\u0006\u0006\u0008\u00fb\u0001\u0010\u00fc\u0001B5\u0008\u0017\u0012\u000c\u0008\u0002\u0010C\u001a\u00060Aj\u0002`B\u0012\u000c\u0010\u00ee\u0001\u001a\u00070Aj\u0003`\u00eb\u0001\u0012\u000c\u0008\u0002\u0010F\u001a\u00060Aj\u0002`E\u00a2\u0006\u0006\u0008\u00fb\u0001\u0010\u00fd\u0001J\u0011\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J)\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096\u0001J\u0011\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J)\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0096\u0001J\u0011\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\'\u0010&\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u000e\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0018\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010,\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010.\u001a\u00020\u00072\u0006\u0010)\u001a\u00020-2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020-2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u00102\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00101\u001a\u000200H\u0016J\u0018\u00103\u001a\u00020\u00072\u0006\u0010)\u001a\u00020-2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u00105\u001a\u00020\u00072\u0006\u0010)\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u00106\u001a\u00020\u00072\u0006\u0010)\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u00108\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u000eH\u0016J\u0018\u00109\u001a\u00020\u00072\u0006\u0010)\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0008\u0010:\u001a\u00020\u0007H\u0016J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0000H\u0016J\u0010\u0010=\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0000H\u0016J\u0010\u0010@\u001a\u00020\u00072\u0006\u0010?\u001a\u00020>H\u0016J@\u0010J\u001a\u00020\u00072\u000c\u0008\u0002\u0010C\u001a\u00060Aj\u0002`B2\u0008\u0008\u0002\u0010D\u001a\u0002002\u000c\u0008\u0002\u0010F\u001a\u00060Aj\u0002`E2\u0008\u0008\u0002\u0010H\u001a\u00020G2\u0008\u0008\u0002\u0010I\u001a\u00020\u000eJ6\u0010L\u001a\u00020\u00072\u000c\u0008\u0002\u0010C\u001a\u00060Aj\u0002`B2\u0008\u0008\u0002\u0010D\u001a\u0002002\u000c\u0008\u0002\u0010F\u001a\u00060Aj\u0002`E2\u0008\u0008\u0002\u0010K\u001a\u00020\u000eJ\u001c\u0010P\u001a\u00020\u00072\n\u0010O\u001a\u00060Mj\u0002`N2\u0008\u0008\u0002\u0010K\u001a\u00020\u000eJ\u0008\u0010Q\u001a\u00020\u0007H\u0016J\u0008\u0010S\u001a\u00020RH\u0016J\u0008\u0010T\u001a\u00020\u0000H\u0016J\u0012\u0010V\u001a\u00020\u00002\u0008\u0008\u0002\u0010U\u001a\u00020\u0000H\u0017J\u0008\u0010W\u001a\u00020\u0007H\u0016J)\u0010]\u001a\u00020\u00072!\u0010\\\u001a\u001d\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\u000c\u0008Y\u0012\u0008\u0008Z\u0012\u0004\u0008\u0008([\u0012\u0004\u0012\u00020\u00070XR\u001c\u0010b\u001a\u0004\u0018\u00010#8\u0016X\u0097\u0004\u00a2\u0006\u000c\n\u0004\u0008^\u0010_\u001a\u0004\u0008`\u0010aR*\u0010k\u001a\u00020c2\u0006\u0010d\u001a\u00020c8\u0016@VX\u0097\u000e\u00a2\u0006\u0012\n\u0004\u0008e\u0010f\u001a\u0004\u0008g\u0010h\"\u0004\u0008i\u0010jR&\u0010C\u001a\u00060Aj\u0002`B8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010l\u001a\u0004\u0008m\u0010n\"\u0004\u0008o\u0010pR\"\u0010D\u001a\u0002008\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008q\u0010r\u001a\u0004\u0008s\u0010t\"\u0004\u0008u\u0010vR&\u0010F\u001a\u00060Aj\u0002`E8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010l\u001a\u0004\u0008w\u0010n\"\u0004\u0008x\u0010pR2\u0010O\u001a\u00060Mj\u0002`N2\n\u0010d\u001a\u00060Mj\u0002`N8V@VX\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008y\u0010z\u001a\u0004\u0008{\u0010|\"\u0004\u0008}\u0010~R\'\u0010I\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008\u007f\u0010\u0080\u0001\u001a\u0006\u0008\u0081\u0001\u0010\u0082\u0001\"\u0006\u0008\u0083\u0001\u0010\u0084\u0001R)\u0010\u0087\u0001\u001a\u00060Mj\u0002`N8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\u0008/\u0010z\u001a\u0005\u0008\u0085\u0001\u0010|\"\u0005\u0008\u0086\u0001\u0010~R\u001f\u0010\u0088\u0001\u001a\n\u0018\u00010Mj\u0004\u0018\u0001`N8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u0010zR\u001f\u0010\u0089\u0001\u001a\n\u0018\u00010Mj\u0004\u0018\u0001`N8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u0010zR(\u0010\u008f\u0001\u001a\u00020G8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0017\n\u0005\u0008\u008a\u0001\u0010w\u001a\u0006\u0008\u008b\u0001\u0010\u008c\u0001\"\u0006\u0008\u008d\u0001\u0010\u008e\u0001R/\u0010\u0092\u0001\u001a\u00020G2\u0006\u0010d\u001a\u00020G8\u0016@VX\u0096\u000e\u00a2\u0006\u0016\n\u0004\u0008*\u0010w\u001a\u0006\u0008\u0090\u0001\u0010\u008c\u0001\"\u0006\u0008\u0091\u0001\u0010\u008e\u0001R\'\u0010\u0095\u0001\u001a\u00020G8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0016\n\u0004\u0008,\u0010w\u001a\u0006\u0008\u0093\u0001\u0010\u008c\u0001\"\u0006\u0008\u0094\u0001\u0010\u008e\u0001R\'\u0010\u0098\u0001\u001a\u00020G8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0016\n\u0004\u0008\u0008\u0010w\u001a\u0006\u0008\u0096\u0001\u0010\u008c\u0001\"\u0006\u0008\u0097\u0001\u0010\u008e\u0001R(\u0010\u009b\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008 \u0010\u0080\u0001\u001a\u0006\u0008\u0099\u0001\u0010\u0082\u0001\"\u0006\u0008\u009a\u0001\u0010\u0084\u0001R)\u0010\u009f\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u009c\u0001\u0010\u0080\u0001\u001a\u0006\u0008\u009d\u0001\u0010\u0082\u0001\"\u0006\u0008\u009e\u0001\u0010\u0084\u0001R0\u0010\u00a7\u0001\u001a\t\u0012\u0002\u0008\u0003\u0018\u00010\u00a0\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001\u001a\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001\"\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001R4\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00012\u0008\u0010d\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008<\u0010\u00a8\u0001\u001a\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001\"\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001R/\u0010\u00b3\u0001\u001a\u0005\u0018\u00010\u00ae\u00012\n\u0010\u00af\u0001\u001a\u0005\u0018\u00010\u00ae\u00018\u0006@BX\u0086\u000e\u00a2\u0006\u000f\n\u0005\u00086\u0010\u00b0\u0001\u001a\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001RU\u0010\u00bb\u0001\u001a;\u00126\u00124\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\u000c\u0008Y\u0012\u0008\u0008Z\u0012\u0004\u0008\u0008(\u001e\u0012\u0014\u0012\u00120\u0000\u00a2\u0006\r\u0008Y\u0012\t\u0008Z\u0012\u0005\u0008\u0008(\u00b6\u0001\u0012\u0004\u0012\u00020\u00070\u00b5\u00010\u00b4\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00b7\u0001\u0010\u00b8\u0001\u001a\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001R=\u0010\u00bd\u0001\u001a$\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\u000c\u0008Y\u0012\u0008\u0008Z\u0012\u0004\u0008\u0008([\u0012\u0004\u0012\u00020\u00070X0\u00b4\u00018\u0006\u00a2\u0006\u000f\n\u0005\u00083\u0010\u00b8\u0001\u001a\u0006\u0008\u00bc\u0001\u0010\u00ba\u0001R=\u0010\u00bf\u0001\u001a$\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\u000c\u0008Y\u0012\u0008\u0008Z\u0012\u0004\u0008\u0008([\u0012\u0004\u0012\u00020\u00070X0\u00b4\u00018\u0006\u00a2\u0006\u000f\n\u0005\u0008\u000b\u0010\u00b8\u0001\u001a\u0006\u0008\u00be\u0001\u0010\u00ba\u0001R>\u0010\u00c1\u0001\u001a%\u0012 \u0012\u001e\u0012\u0014\u0012\u00120\u0000\u00a2\u0006\r\u0008Y\u0012\t\u0008Z\u0012\u0005\u0008\u0008(\u00b6\u0001\u0012\u0004\u0012\u00020\u00070X0\u00b4\u00018\u0006\u00a2\u0006\u000f\n\u0005\u0008S\u0010\u00b8\u0001\u001a\u0006\u0008\u00c0\u0001\u0010\u00ba\u0001Rc\u0010\u00c7\u0001\u001a=\u0012\u0013\u0012\u00110!\u00a2\u0006\u000c\u0008Y\u0012\u0008\u0008Z\u0012\u0004\u0008\u0008(\"\u0012\u001b\u0012\u0019\u0018\u00010#j\u0004\u0018\u0001`$\u00a2\u0006\u000c\u0008Y\u0012\u0008\u0008Z\u0012\u0004\u0008\u0008(%\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00b5\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008\t\u0010\u00c2\u0001\u001a\u0006\u0008\u00c3\u0001\u0010\u00c4\u0001\"\u0006\u0008\u00c5\u0001\u0010\u00c6\u0001R.\u0010\u00cb\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u00c8\u00018\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0016\n\u0005\u0008=\u0010\u00b8\u0001\u001a\u0005\u0008e\u0010\u00ba\u0001\"\u0006\u0008\u00c9\u0001\u0010\u00ca\u0001R\u0017\u0010\u00cc\u0001\u001a\u00020G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010wR\u0017\u0010\u00cd\u0001\u001a\u00020G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010wR4\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0010d\u001a\u0004\u0018\u00010\u00008\u0016@VX\u0096\u000e\u00a2\u0006\u0017\n\u0005\u0008+\u0010\u00ce\u0001\u001a\u0006\u0008\u00cf\u0001\u0010\u00d0\u0001\"\u0006\u0008\u00d1\u0001\u0010\u00d2\u0001R0\u0010\u00d7\u0001\u001a\u00020G2\u0006\u0010d\u001a\u00020G8\u0006@FX\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008\u00d4\u0001\u0010w\u001a\u0006\u0008\u00d5\u0001\u0010\u008c\u0001\"\u0006\u0008\u00d6\u0001\u0010\u008e\u0001R\u0017\u0010\u00d9\u0001\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0080\u0001\u0010\u00d8\u0001R6\u0010\u00e0\u0001\u001a\u0005\u0018\u00010\u00da\u00012\t\u0010d\u001a\u0005\u0018\u00010\u00da\u00018F@FX\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008\u0015\u0010\u00db\u0001\u001a\u0006\u0008\u00dc\u0001\u0010\u00dd\u0001\"\u0006\u0008\u00de\u0001\u0010\u00df\u0001R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178TX\u0094\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00e1\u0001\u0010\u00e2\u0001R\u001a\u0010\u00e6\u0001\u001a\u0005\u0018\u00010\u00e3\u00018DX\u0084\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00e4\u0001\u0010\u00e5\u0001R\u0015\u0010\u00e8\u0001\u001a\u0004\u0018\u00010#8G\u00a2\u0006\u0007\u001a\u0005\u0008\u00e7\u0001\u0010aR\u0014\u0010\u00ea\u0001\u001a\u00020G8F\u00a2\u0006\u0008\u001a\u0006\u0008\u00e9\u0001\u0010\u008c\u0001R1\u0010\u00ee\u0001\u001a\u00070Aj\u0003`\u00eb\u00012\u000b\u0010d\u001a\u00070Aj\u0003`\u00eb\u00018F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u00ec\u0001\u0010n\"\u0005\u0008\u00ed\u0001\u0010pR/\u0010\u00f1\u0001\u001a\u00060Aj\u0002`B2\n\u0010d\u001a\u00060Aj\u0002`B8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u00ef\u0001\u0010n\"\u0005\u0008\u00f0\u0001\u0010pR\'\u0010\u00f4\u0001\u001a\u0002002\u0006\u0010d\u001a\u0002008V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u00f2\u0001\u0010t\"\u0005\u0008\u00f3\u0001\u0010vR\u0016\u0010\u00f6\u0001\u001a\u00020M8VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00f5\u0001\u0010|R\u0017\u0010\u00f8\u0001\u001a\u00020G8VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00f7\u0001\u0010\u008c\u0001R\u0016\u0010\u00fa\u0001\u001a\u0004\u0018\u00010\u00008F\u00a2\u0006\u0008\u001a\u0006\u0008\u00f9\u0001\u0010\u00d0\u0001\u00a8\u0006\u00fe\u0001"
    }
    d2 = {
        "Lio/github/sceneview/node/Node;",
        "LQ83;",
        "Lo96;",
        "Lrm5;",
        "LiC1$b;",
        "LP83;",
        "e",
        "",
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
        "distanceX",
        "distanceY",
        "b",
        "G",
        "a",
        "Lio/github/sceneview/SceneView;",
        "sceneView",
        "K",
        "O",
        "q0",
        "r0",
        "LPy1;",
        "frameTime",
        "g",
        "q",
        "Landroid/view/MotionEvent;",
        "motionEvent",
        "",
        "Lio/github/sceneview/renderable/Renderable;",
        "renderable",
        "u0",
        "(Landroid/view/MotionEvent;Ljava/lang/Integer;)V",
        "LkW2;",
        "detector",
        "n",
        "D",
        "o",
        "LRb5;",
        "B",
        "j",
        "LUc4;",
        "rotationDelta",
        "s0",
        "w",
        "Lbj5;",
        "l",
        "u",
        "scaleFactor",
        "t0",
        "k",
        "v0",
        "child",
        "t",
        "A",
        "LLifecycleOwner;",
        "owner",
        "onDestroy",
        "Lhu1;",
        "Lio/github/sceneview/math/Position;",
        "position",
        "quaternion",
        "Lio/github/sceneview/math/Scale;",
        "scale",
        "",
        "smooth",
        "smoothSpeed",
        "L0",
        "speed",
        "J0",
        "LyM2;",
        "Lio/github/sceneview/math/Transform;",
        "transform",
        "K0",
        "N0",
        "LjN2;",
        "y",
        "L",
        "toNode",
        "M",
        "N",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "scene",
        "action",
        "P",
        "c",
        "Ljava/lang/Integer;",
        "e0",
        "()Ljava/lang/Integer;",
        "transformEntity",
        "",
        "value",
        "d",
        "[I",
        "a0",
        "()[I",
        "D0",
        "([I)V",
        "sceneEntities",
        "Lhu1;",
        "X",
        "()Lhu1;",
        "z0",
        "(Lhu1;)V",
        "f",
        "LUc4;",
        "Y",
        "()LUc4;",
        "A0",
        "(LUc4;)V",
        "Z",
        "C0",
        "h",
        "LyM2;",
        "d0",
        "()LyM2;",
        "H0",
        "(LyM2;)V",
        "i",
        "F",
        "getSmoothSpeed",
        "()F",
        "setSmoothSpeed",
        "(F)V",
        "getSmoothTransform",
        "setSmoothTransform",
        "smoothTransform",
        "lastFrameTransform",
        "lastFrameWorldTransform",
        "m",
        "m0",
        "()Z",
        "E0",
        "(Z)V",
        "isSelectable",
        "o0",
        "I0",
        "isVisible",
        "k0",
        "setRotationEditable",
        "isRotationEditable",
        "l0",
        "setScaleEditable",
        "isScaleEditable",
        "U",
        "setMinEditableScale",
        "minEditableScale",
        "r",
        "T",
        "setMaxEditableScale",
        "maxEditableScale",
        "Lkotlin/reflect/KProperty;",
        "s",
        "Lkotlin/reflect/KProperty;",
        "R",
        "()Lkotlin/reflect/KProperty;",
        "x0",
        "(Lkotlin/reflect/KProperty;)V",
        "currentEditingTransform",
        "LQ83;",
        "getParent",
        "()LQ83;",
        "y0",
        "(LQ83;)V",
        "parent",
        "Lmm0;",
        "<set-?>",
        "Lmm0;",
        "getCollider",
        "()Lmm0;",
        "collider",
        "",
        "Lkotlin/Function2;",
        "node",
        "v",
        "Ljava/util/List;",
        "getOnFrame",
        "()Ljava/util/List;",
        "onFrame",
        "V",
        "onAttachedToScene",
        "getOnDetachedFromScene",
        "onDetachedFromScene",
        "getOnTransformChanged",
        "onTransformChanged",
        "Lkotlin/jvm/functions/Function2;",
        "getOnTap",
        "()Lkotlin/jvm/functions/Function2;",
        "setOnTap",
        "(Lkotlin/jvm/functions/Function2;)V",
        "onTap",
        "",
        "setChildren",
        "(Ljava/util/List;)V",
        "children",
        "allowDispatchTransformChanged",
        "skipFirstRotateEdit",
        "Lio/github/sceneview/node/Node;",
        "c0",
        "()Lio/github/sceneview/node/Node;",
        "G0",
        "(Lio/github/sceneview/node/Node;)V",
        "selectionVisualizer",
        "E",
        "n0",
        "F0",
        "isSelected",
        "LjN2;",
        "_transformationMatrixInverted",
        "Lnm0;",
        "Lnm0;",
        "getCollisionShape",
        "()Lnm0;",
        "w0",
        "(Lnm0;)V",
        "collisionShape",
        "b0",
        "()Lio/github/sceneview/SceneView;",
        "Lzq2;",
        "S",
        "()Lzq2;",
        "lifecycleScope",
        "f0",
        "transformInstance",
        "j0",
        "isAttached",
        "Lio/github/sceneview/math/Rotation;",
        "getRotation",
        "B0",
        "rotation",
        "g0",
        "setWorldPosition",
        "worldPosition",
        "h0",
        "setWorldQuaternion",
        "worldQuaternion",
        "i0",
        "worldTransform",
        "p0",
        "isVisibleInHierarchy",
        "W",
        "parentNode",
        "<init>",
        "(Lhu1;LUc4;Lhu1;)V",
        "(Lhu1;Lhu1;Lhu1;)V",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final H:Lio/github/sceneview/node/Node$a;

.field public static final I:I

.field public static final J:Lhu1;


# instance fields
.field public A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lio/github/sceneview/node/Node;",
            ">;"
        }
    .end annotation
.end field

.field public B:Z

.field public C:Z

.field public D:Lio/github/sceneview/node/Node;

.field public E:Z

.field public final F:LjN2;

.field public G:Lnm0;

.field public final synthetic b:LiC1$c;

.field public final c:Ljava/lang/Integer;
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation
.end field

.field public d:[I
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation
.end field

.field public e:Lhu1;

.field public f:LUc4;

.field public g:Lhu1;

.field public h:LyM2;

.field public i:F

.field public j:LyM2;

.field public k:LyM2;

.field public l:LyM2;

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:F

.field public r:F

.field public s:Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/KProperty<",
            "*>;"
        }
    .end annotation
.end field

.field public t:LQ83;

.field public u:Lmm0;

.field public final v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function2<",
            "LPy1;",
            "Lio/github/sceneview/node/Node;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field public final w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lio/github/sceneview/SceneView;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field public final x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lio/github/sceneview/SceneView;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field public final y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lio/github/sceneview/node/Node;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field public z:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroid/view/MotionEvent;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/sceneview/node/Node$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/sceneview/node/Node$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/github/sceneview/node/Node;->H:Lio/github/sceneview/node/Node$a;

    const/16 v1, 0x8

    sput v1, Lio/github/sceneview/node/Node;->I:I

    invoke-virtual {v0}, Lio/github/sceneview/node/Node$a;->b()LUc4;

    move-result-object v0

    invoke-virtual {v0}, LUc4;->e()Lhu1;

    move-result-object v0

    sput-object v0, Lio/github/sceneview/node/Node;->J:Lhu1;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/github/sceneview/node/Node;-><init>(Lhu1;LUc4;Lhu1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lhu1;LUc4;Lhu1;)V
    .locals 1

    const-string v0, "position"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "quaternion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scale"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LiC1$c;

    invoke-direct {v0}, LiC1$c;-><init>()V

    iput-object v0, p0, Lio/github/sceneview/node/Node;->b:LiC1$c;

    const/4 v0, 0x0

    new-array v0, v0, [I

    iput-object v0, p0, Lio/github/sceneview/node/Node;->d:[I

    iput-object p1, p0, Lio/github/sceneview/node/Node;->e:Lhu1;

    iput-object p2, p0, Lio/github/sceneview/node/Node;->f:LUc4;

    iput-object p3, p0, Lio/github/sceneview/node/Node;->g:Lhu1;

    invoke-static {p1, p2, p3}, LgN2;->a(Lhu1;LUc4;Lhu1;)LyM2;

    move-result-object p1

    iput-object p1, p0, Lio/github/sceneview/node/Node;->h:LyM2;

    const/high16 p1, 0x40a00000    # 5.0f

    iput p1, p0, Lio/github/sceneview/node/Node;->i:F

    new-instance p1, LyM2;

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->d0()LyM2;

    move-result-object p2

    invoke-direct {p1, p2}, LyM2;-><init>(LyM2;)V

    iput-object p1, p0, Lio/github/sceneview/node/Node;->j:LyM2;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/github/sceneview/node/Node;->n:Z

    const p2, 0x3dcccccd    # 0.1f

    iput p2, p0, Lio/github/sceneview/node/Node;->q:F

    const/high16 p2, 0x41200000    # 10.0f

    iput p2, p0, Lio/github/sceneview/node/Node;->r:F

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lio/github/sceneview/node/Node;->v:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lio/github/sceneview/node/Node;->w:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lio/github/sceneview/node/Node;->x:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lio/github/sceneview/node/Node;->y:Ljava/util/List;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lio/github/sceneview/node/Node;->A:Ljava/util/List;

    iput-boolean p1, p0, Lio/github/sceneview/node/Node;->B:Z

    new-instance p1, LjN2;

    invoke-direct {p1}, LjN2;-><init>()V

    iput-object p1, p0, Lio/github/sceneview/node/Node;->F:LjN2;

    return-void
.end method

.method public synthetic constructor <init>(Lhu1;LUc4;Lhu1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lio/github/sceneview/node/Node;->H:Lio/github/sceneview/node/Node$a;

    invoke-virtual {p1}, Lio/github/sceneview/node/Node$a;->a()Lhu1;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p2, Lio/github/sceneview/node/Node;->H:Lio/github/sceneview/node/Node$a;

    invoke-virtual {p2}, Lio/github/sceneview/node/Node$a;->b()LUc4;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p3, Lio/github/sceneview/node/Node;->H:Lio/github/sceneview/node/Node$a;

    invoke-virtual {p3}, Lio/github/sceneview/node/Node$a;->d()Lhu1;

    move-result-object p3

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lio/github/sceneview/node/Node;-><init>(Lhu1;LUc4;Lhu1;)V

    return-void
.end method

.method public constructor <init>(Lhu1;Lhu1;Lhu1;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "position"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rotation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scale"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lio/github/sceneview/node/Node;-><init>(Lhu1;LUc4;Lhu1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p2}, Lio/github/sceneview/node/Node;->B0(Lhu1;)V

    return-void
.end method

.method public static final synthetic J()Lhu1;
    .locals 1

    sget-object v0, Lio/github/sceneview/node/Node;->J:Lhu1;

    return-object v0
.end method

.method public static synthetic M0(Lio/github/sceneview/node/Node;Lhu1;LUc4;Lhu1;ZFILjava/lang/Object;)V
    .locals 3

    if-nez p7, :cond_5

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/github/sceneview/node/Node;->e:Lhu1;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/github/sceneview/node/Node;->f:LUc4;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lio/github/sceneview/node/Node;->g:Lhu1;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    const/4 p4, 0x0

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget p5, p0, Lio/github/sceneview/node/Node;->i:F

    :cond_4
    move v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lio/github/sceneview/node/Node;->L0(Lhu1;LUc4;Lhu1;ZF)V

    return-void

    :cond_5
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: transform"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public A(Lio/github/sceneview/node/Node;)V
    .locals 1

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LQ83$a;->g(LQ83;Lio/github/sceneview/node/Node;)Lio/github/sceneview/node/Node;

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->v0()V

    return-void
.end method

.method public final A0(LUc4;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/github/sceneview/node/Node;->f:LUc4;

    return-void
.end method

.method public B(LRb5;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->k0()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/github/sceneview/node/Node;->s:Lkotlin/reflect/KProperty;

    if-nez p1, :cond_0

    new-instance p1, Lio/github/sceneview/node/Node$d;

    invoke-direct {p1, p0}, Lio/github/sceneview/node/Node$d;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/github/sceneview/node/Node;->s:Lkotlin/reflect/KProperty;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/github/sceneview/node/Node;->C:Z

    :cond_0
    return-void
.end method

.method public final B0(Lhu1;)V
    .locals 3

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LUc4;->e:LUc4$a;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, LUc4$a;->d(LUc4$a;Lhu1;LVb5;ILjava/lang/Object;)LUc4;

    move-result-object p1

    iput-object p1, p0, Lio/github/sceneview/node/Node;->f:LUc4;

    return-void
.end method

.method public C(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->C(LP83;)V

    return-void
.end method

.method public final C0(Lhu1;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/github/sceneview/node/Node;->g:Lhu1;

    return-void
.end method

.method public D(LkW2;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public D0([I)V
    .locals 3

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->d:[I

    array-length v1, v0

    const/4 v2, 0x1

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    xor-int/2addr v1, v2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Lcom/google/android/filament/Scene;->removeEntities([I)V

    :cond_2
    iput-object p1, p0, Lio/github/sceneview/node/Node;->d:[I

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->p0()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->a0()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/filament/Scene;->addEntities([I)V

    :cond_3
    return-void
.end method

.method public E(Lio/github/sceneview/node/Node;)Lio/github/sceneview/node/Node;
    .locals 0

    invoke-static {p0, p1}, LQ83$a;->g(LQ83;Lio/github/sceneview/node/Node;)Lio/github/sceneview/node/Node;

    move-result-object p1

    return-object p1
.end method

.method public E0(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/github/sceneview/node/Node;->m:Z

    return-void
.end method

.method public final F0(Z)V
    .locals 1

    iget-boolean v0, p0, Lio/github/sceneview/node/Node;->E:Z

    if-eq v0, p1, :cond_2

    iput-boolean p1, p0, Lio/github/sceneview/node/Node;->E:Z

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->c0()Lio/github/sceneview/node/Node;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    move-object p1, p0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lio/github/sceneview/node/Node;->y0(LQ83;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public G(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->G(LP83;)V

    return-void
.end method

.method public G0(Lio/github/sceneview/node/Node;)V
    .locals 2

    iget-object v0, p0, Lio/github/sceneview/node/Node;->D:Lio/github/sceneview/node/Node;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lio/github/sceneview/node/Node;->y0(LQ83;)V

    :cond_0
    iput-object p1, p0, Lio/github/sceneview/node/Node;->D:Lio/github/sceneview/node/Node;

    if-eqz p1, :cond_2

    iget-boolean v0, p0, Lio/github/sceneview/node/Node;->E:Z

    if-eqz v0, :cond_1

    move-object v1, p0

    :cond_1
    invoke-virtual {p1, v1}, Lio/github/sceneview/node/Node;->y0(LQ83;)V

    :cond_2
    return-void
.end method

.method public H(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->H(LP83;)V

    return-void
.end method

.method public H0(LyM2;)V
    .locals 6

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->h:LyM2;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lio/github/sceneview/node/Node;->h:LyM2;

    invoke-virtual {p1}, LyM2;->a()Liu1;

    move-result-object v0

    new-instance v1, Lhu1;

    invoke-virtual {v0}, Liu1;->e()F

    move-result v2

    invoke-virtual {v0}, Liu1;->f()F

    move-result v3

    invoke-virtual {v0}, Liu1;->g()F

    move-result v0

    invoke-direct {v1, v2, v3, v0}, Lhu1;-><init>(FFF)V

    iput-object v1, p0, Lio/github/sceneview/node/Node;->e:Lhu1;

    invoke-static {p1}, LgN2;->f(LyM2;)LUc4;

    move-result-object v0

    iput-object v0, p0, Lio/github/sceneview/node/Node;->f:LUc4;

    new-instance v0, Lhu1;

    invoke-virtual {p1}, LyM2;->b()Liu1;

    move-result-object v1

    new-instance v2, Lhu1;

    invoke-virtual {v1}, Liu1;->e()F

    move-result v3

    invoke-virtual {v1}, Liu1;->f()F

    move-result v4

    invoke-virtual {v1}, Liu1;->g()F

    move-result v1

    invoke-direct {v2, v3, v4, v1}, Lhu1;-><init>(FFF)V

    invoke-virtual {v2}, Lhu1;->g()F

    move-result v1

    invoke-virtual {v2}, Lhu1;->g()F

    move-result v3

    mul-float/2addr v1, v3

    invoke-virtual {v2}, Lhu1;->h()F

    move-result v3

    invoke-virtual {v2}, Lhu1;->h()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v1, v3

    invoke-virtual {v2}, Lhu1;->i()F

    move-result v3

    invoke-virtual {v2}, Lhu1;->i()F

    move-result v2

    mul-float/2addr v3, v2

    add-float/2addr v1, v3

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {p1}, LyM2;->c()Liu1;

    move-result-object v2

    new-instance v3, Lhu1;

    invoke-virtual {v2}, Liu1;->e()F

    move-result v4

    invoke-virtual {v2}, Liu1;->f()F

    move-result v5

    invoke-virtual {v2}, Liu1;->g()F

    move-result v2

    invoke-direct {v3, v4, v5, v2}, Lhu1;-><init>(FFF)V

    invoke-virtual {v3}, Lhu1;->g()F

    move-result v2

    invoke-virtual {v3}, Lhu1;->g()F

    move-result v4

    mul-float/2addr v2, v4

    invoke-virtual {v3}, Lhu1;->h()F

    move-result v4

    invoke-virtual {v3}, Lhu1;->h()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v2, v4

    invoke-virtual {v3}, Lhu1;->i()F

    move-result v4

    invoke-virtual {v3}, Lhu1;->i()F

    move-result v3

    mul-float/2addr v4, v3

    add-float/2addr v2, v4

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {p1}, LyM2;->d()Liu1;

    move-result-object p1

    new-instance v3, Lhu1;

    invoke-virtual {p1}, Liu1;->e()F

    move-result v4

    invoke-virtual {p1}, Liu1;->f()F

    move-result v5

    invoke-virtual {p1}, Liu1;->g()F

    move-result p1

    invoke-direct {v3, v4, v5, p1}, Lhu1;-><init>(FFF)V

    invoke-virtual {v3}, Lhu1;->g()F

    move-result p1

    invoke-virtual {v3}, Lhu1;->g()F

    move-result v4

    mul-float/2addr p1, v4

    invoke-virtual {v3}, Lhu1;->h()F

    move-result v4

    invoke-virtual {v3}, Lhu1;->h()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr p1, v4

    invoke-virtual {v3}, Lhu1;->i()F

    move-result v4

    invoke-virtual {v3}, Lhu1;->i()F

    move-result v3

    mul-float/2addr v4, v3

    add-float/2addr p1, v4

    float-to-double v3, p1

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    double-to-float p1, v3

    invoke-direct {v0, v1, v2, p1}, Lhu1;-><init>(FFF)V

    iput-object v0, p0, Lio/github/sceneview/node/Node;->g:Lhu1;

    :cond_0
    return-void
.end method

.method public I(II)V
    .locals 0

    invoke-static {p0, p1, p2}, Lrm5$a;->b(Lrm5;II)V

    return-void
.end method

.method public I0(Z)V
    .locals 1

    iget-boolean v0, p0, Lio/github/sceneview/node/Node;->n:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lio/github/sceneview/node/Node;->n:Z

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->N0()V

    :cond_0
    return-void
.end method

.method public final J0(Lhu1;LUc4;Lhu1;F)V
    .locals 1

    const-string v0, "position"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "quaternion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scale"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2, p3}, LgN2;->a(Lhu1;LUc4;Lhu1;)LyM2;

    move-result-object p1

    invoke-virtual {p0, p1, p4}, Lio/github/sceneview/node/Node;->K0(LyM2;F)V

    return-void
.end method

.method public K(Lio/github/sceneview/SceneView;)V
    .locals 2

    const-string v0, "sceneView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->getLifecycle()Lqm5;

    move-result-object v0

    invoke-virtual {v0, p0}, LTX0;->a(LFq2;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->a0()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/Scene;->addEntities([I)V

    :cond_0
    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->Q()Lom0;

    move-result-object v0

    iget-object v1, p0, Lio/github/sceneview/node/Node;->u:Lmm0;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Lmm0;->c(Lom0;)V

    :cond_1
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->c0()Lio/github/sceneview/node/Node;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->b0()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/sceneview/node/Node;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lio/github/sceneview/node/Node;->G0(Lio/github/sceneview/node/Node;)V

    :cond_3
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/sceneview/node/Node;

    invoke-virtual {v1, p1}, Lio/github/sceneview/node/Node;->K(Lio/github/sceneview/SceneView;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0, p1}, Lio/github/sceneview/node/Node;->q0(Lio/github/sceneview/SceneView;)V

    return-void
.end method

.method public final K0(LyM2;F)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "transform"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v2, p2

    iput v2, v0, Lio/github/sceneview/node/Node;->i:F

    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/node/Node;->d0()LyM2;

    move-result-object v2

    new-instance v3, LVY;

    invoke-virtual {v2}, LyM2;->b()Liu1;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LyM2;->b()Liu1;

    move-result-object v5

    new-instance v6, LVY;

    new-instance v7, Lhu1;

    invoke-virtual {v4}, Liu1;->e()F

    move-result v8

    invoke-virtual {v4}, Liu1;->f()F

    move-result v9

    invoke-virtual {v4}, Liu1;->g()F

    move-result v10

    invoke-direct {v7, v8, v9, v10}, Lhu1;-><init>(FFF)V

    new-instance v8, Lhu1;

    invoke-virtual {v5}, Liu1;->e()F

    move-result v9

    invoke-virtual {v5}, Liu1;->f()F

    move-result v10

    invoke-virtual {v5}, Liu1;->g()F

    move-result v11

    invoke-direct {v8, v9, v10, v11}, Lhu1;-><init>(FFF)V

    new-instance v9, LUY;

    new-instance v10, Lgu1;

    invoke-virtual {v7}, Lhu1;->g()F

    move-result v11

    invoke-virtual {v7}, Lhu1;->h()F

    move-result v12

    invoke-direct {v10, v11, v12}, Lgu1;-><init>(FF)V

    new-instance v11, Lgu1;

    invoke-virtual {v8}, Lhu1;->g()F

    move-result v12

    invoke-virtual {v8}, Lhu1;->h()F

    move-result v13

    invoke-direct {v11, v12, v13}, Lgu1;-><init>(FF)V

    new-instance v12, LTY;

    invoke-virtual {v10}, Lgu1;->a()F

    move-result v13

    invoke-virtual {v11}, Lgu1;->a()F

    move-result v14

    sub-float/2addr v13, v14

    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v13

    const v14, 0x3a83126f    # 0.001f

    cmpg-float v13, v13, v14

    const/16 v16, 0x0

    if-gez v13, :cond_0

    const/4 v13, 0x1

    goto :goto_0

    :cond_0
    move/from16 v13, v16

    :goto_0
    invoke-virtual {v10}, Lgu1;->b()F

    move-result v10

    invoke-virtual {v11}, Lgu1;->b()F

    move-result v11

    sub-float/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    cmpg-float v10, v10, v14

    if-gez v10, :cond_1

    const/4 v10, 0x1

    goto :goto_1

    :cond_1
    move/from16 v10, v16

    :goto_1
    invoke-direct {v12, v13, v10}, LTY;-><init>(ZZ)V

    invoke-virtual {v7}, Lhu1;->i()F

    move-result v7

    invoke-virtual {v8}, Lhu1;->i()F

    move-result v8

    sub-float/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    cmpg-float v7, v7, v14

    if-gez v7, :cond_2

    const/4 v7, 0x1

    goto :goto_2

    :cond_2
    move/from16 v7, v16

    :goto_2
    invoke-direct {v9, v12, v7}, LUY;-><init>(LTY;Z)V

    invoke-virtual {v4}, Liu1;->d()F

    move-result v4

    invoke-virtual {v5}, Liu1;->d()F

    move-result v5

    sub-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpg-float v4, v4, v14

    if-gez v4, :cond_3

    const/4 v4, 0x1

    goto :goto_3

    :cond_3
    move/from16 v4, v16

    :goto_3
    invoke-direct {v6, v9, v4}, LVY;-><init>(LUY;Z)V

    invoke-virtual {v6}, LVY;->b()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v6}, LVY;->c()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v6}, LVY;->d()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v6}, LVY;->a()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    goto :goto_4

    :cond_4
    move/from16 v4, v16

    :goto_4
    invoke-virtual {v2}, LyM2;->c()Liu1;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LyM2;->c()Liu1;

    move-result-object v6

    new-instance v7, LVY;

    new-instance v8, Lhu1;

    invoke-virtual {v5}, Liu1;->e()F

    move-result v9

    invoke-virtual {v5}, Liu1;->f()F

    move-result v10

    invoke-virtual {v5}, Liu1;->g()F

    move-result v11

    invoke-direct {v8, v9, v10, v11}, Lhu1;-><init>(FFF)V

    new-instance v9, Lhu1;

    invoke-virtual {v6}, Liu1;->e()F

    move-result v10

    invoke-virtual {v6}, Liu1;->f()F

    move-result v11

    invoke-virtual {v6}, Liu1;->g()F

    move-result v12

    invoke-direct {v9, v10, v11, v12}, Lhu1;-><init>(FFF)V

    new-instance v10, LUY;

    new-instance v11, Lgu1;

    invoke-virtual {v8}, Lhu1;->g()F

    move-result v12

    invoke-virtual {v8}, Lhu1;->h()F

    move-result v13

    invoke-direct {v11, v12, v13}, Lgu1;-><init>(FF)V

    new-instance v12, Lgu1;

    invoke-virtual {v9}, Lhu1;->g()F

    move-result v13

    invoke-virtual {v9}, Lhu1;->h()F

    move-result v15

    invoke-direct {v12, v13, v15}, Lgu1;-><init>(FF)V

    new-instance v13, LTY;

    invoke-virtual {v11}, Lgu1;->a()F

    move-result v15

    invoke-virtual {v12}, Lgu1;->a()F

    move-result v17

    sub-float v15, v15, v17

    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    move-result v15

    cmpg-float v15, v15, v14

    if-gez v15, :cond_5

    const/4 v15, 0x1

    goto :goto_5

    :cond_5
    move/from16 v15, v16

    :goto_5
    invoke-virtual {v11}, Lgu1;->b()F

    move-result v11

    invoke-virtual {v12}, Lgu1;->b()F

    move-result v12

    sub-float/2addr v11, v12

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v11

    cmpg-float v11, v11, v14

    if-gez v11, :cond_6

    const/4 v11, 0x1

    goto :goto_6

    :cond_6
    move/from16 v11, v16

    :goto_6
    invoke-direct {v13, v15, v11}, LTY;-><init>(ZZ)V

    invoke-virtual {v8}, Lhu1;->i()F

    move-result v8

    invoke-virtual {v9}, Lhu1;->i()F

    move-result v9

    sub-float/2addr v8, v9

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    cmpg-float v8, v8, v14

    if-gez v8, :cond_7

    const/4 v8, 0x1

    goto :goto_7

    :cond_7
    move/from16 v8, v16

    :goto_7
    invoke-direct {v10, v13, v8}, LUY;-><init>(LTY;Z)V

    invoke-virtual {v5}, Liu1;->d()F

    move-result v5

    invoke-virtual {v6}, Liu1;->d()F

    move-result v6

    sub-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpg-float v5, v5, v14

    if-gez v5, :cond_8

    const/4 v5, 0x1

    goto :goto_8

    :cond_8
    move/from16 v5, v16

    :goto_8
    invoke-direct {v7, v10, v5}, LVY;-><init>(LUY;Z)V

    invoke-virtual {v7}, LVY;->b()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {v7}, LVY;->c()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {v7}, LVY;->d()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {v7}, LVY;->a()Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v5, 0x1

    goto :goto_9

    :cond_9
    move/from16 v5, v16

    :goto_9
    invoke-virtual {v2}, LyM2;->d()Liu1;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LyM2;->d()Liu1;

    move-result-object v7

    new-instance v8, LVY;

    new-instance v9, Lhu1;

    invoke-virtual {v6}, Liu1;->e()F

    move-result v10

    invoke-virtual {v6}, Liu1;->f()F

    move-result v11

    invoke-virtual {v6}, Liu1;->g()F

    move-result v12

    invoke-direct {v9, v10, v11, v12}, Lhu1;-><init>(FFF)V

    new-instance v10, Lhu1;

    invoke-virtual {v7}, Liu1;->e()F

    move-result v11

    invoke-virtual {v7}, Liu1;->f()F

    move-result v12

    invoke-virtual {v7}, Liu1;->g()F

    move-result v13

    invoke-direct {v10, v11, v12, v13}, Lhu1;-><init>(FFF)V

    new-instance v11, LUY;

    new-instance v12, Lgu1;

    invoke-virtual {v9}, Lhu1;->g()F

    move-result v13

    invoke-virtual {v9}, Lhu1;->h()F

    move-result v15

    invoke-direct {v12, v13, v15}, Lgu1;-><init>(FF)V

    new-instance v13, Lgu1;

    invoke-virtual {v10}, Lhu1;->g()F

    move-result v15

    invoke-virtual {v10}, Lhu1;->h()F

    move-result v14

    invoke-direct {v13, v15, v14}, Lgu1;-><init>(FF)V

    new-instance v14, LTY;

    invoke-virtual {v12}, Lgu1;->a()F

    move-result v15

    invoke-virtual {v13}, Lgu1;->a()F

    move-result v18

    sub-float v15, v15, v18

    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    move-result v15

    const v17, 0x3a83126f    # 0.001f

    cmpg-float v15, v15, v17

    if-gez v15, :cond_a

    const/4 v15, 0x1

    goto :goto_a

    :cond_a
    move/from16 v15, v16

    :goto_a
    invoke-virtual {v12}, Lgu1;->b()F

    move-result v12

    invoke-virtual {v13}, Lgu1;->b()F

    move-result v13

    sub-float/2addr v12, v13

    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v12

    cmpg-float v12, v12, v17

    if-gez v12, :cond_b

    const/4 v12, 0x1

    goto :goto_b

    :cond_b
    move/from16 v12, v16

    :goto_b
    invoke-direct {v14, v15, v12}, LTY;-><init>(ZZ)V

    invoke-virtual {v9}, Lhu1;->i()F

    move-result v9

    invoke-virtual {v10}, Lhu1;->i()F

    move-result v10

    sub-float/2addr v9, v10

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v9

    cmpg-float v9, v9, v17

    if-gez v9, :cond_c

    const/4 v9, 0x1

    goto :goto_c

    :cond_c
    move/from16 v9, v16

    :goto_c
    invoke-direct {v11, v14, v9}, LUY;-><init>(LTY;Z)V

    invoke-virtual {v6}, Liu1;->d()F

    move-result v6

    invoke-virtual {v7}, Liu1;->d()F

    move-result v7

    sub-float/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v17

    if-gez v6, :cond_d

    const/4 v6, 0x1

    goto :goto_d

    :cond_d
    move/from16 v6, v16

    :goto_d
    invoke-direct {v8, v11, v6}, LVY;-><init>(LUY;Z)V

    invoke-virtual {v8}, LVY;->b()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v8}, LVY;->c()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v8}, LVY;->d()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v8}, LVY;->a()Z

    move-result v6

    if-eqz v6, :cond_e

    const/4 v6, 0x1

    goto :goto_e

    :cond_e
    move/from16 v6, v16

    :goto_e
    invoke-virtual {v2}, LyM2;->a()Liu1;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LyM2;->a()Liu1;

    move-result-object v7

    new-instance v8, LVY;

    new-instance v9, Lhu1;

    invoke-virtual {v2}, Liu1;->e()F

    move-result v10

    invoke-virtual {v2}, Liu1;->f()F

    move-result v11

    invoke-virtual {v2}, Liu1;->g()F

    move-result v12

    invoke-direct {v9, v10, v11, v12}, Lhu1;-><init>(FFF)V

    new-instance v10, Lhu1;

    invoke-virtual {v7}, Liu1;->e()F

    move-result v11

    invoke-virtual {v7}, Liu1;->f()F

    move-result v12

    invoke-virtual {v7}, Liu1;->g()F

    move-result v13

    invoke-direct {v10, v11, v12, v13}, Lhu1;-><init>(FFF)V

    new-instance v11, LUY;

    new-instance v12, Lgu1;

    invoke-virtual {v9}, Lhu1;->g()F

    move-result v13

    invoke-virtual {v9}, Lhu1;->h()F

    move-result v14

    invoke-direct {v12, v13, v14}, Lgu1;-><init>(FF)V

    new-instance v13, Lgu1;

    invoke-virtual {v10}, Lhu1;->g()F

    move-result v14

    invoke-virtual {v10}, Lhu1;->h()F

    move-result v15

    invoke-direct {v13, v14, v15}, Lgu1;-><init>(FF)V

    new-instance v14, LTY;

    invoke-virtual {v12}, Lgu1;->a()F

    move-result v15

    invoke-virtual {v13}, Lgu1;->a()F

    move-result v18

    sub-float v15, v15, v18

    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    move-result v15

    const v17, 0x3a83126f    # 0.001f

    cmpg-float v15, v15, v17

    if-gez v15, :cond_f

    const/4 v15, 0x1

    goto :goto_f

    :cond_f
    move/from16 v15, v16

    :goto_f
    invoke-virtual {v12}, Lgu1;->b()F

    move-result v12

    invoke-virtual {v13}, Lgu1;->b()F

    move-result v13

    sub-float/2addr v12, v13

    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v12

    cmpg-float v12, v12, v17

    if-gez v12, :cond_10

    const/4 v12, 0x1

    goto :goto_10

    :cond_10
    move/from16 v12, v16

    :goto_10
    invoke-direct {v14, v15, v12}, LTY;-><init>(ZZ)V

    invoke-virtual {v9}, Lhu1;->i()F

    move-result v9

    invoke-virtual {v10}, Lhu1;->i()F

    move-result v10

    sub-float/2addr v9, v10

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v9

    cmpg-float v9, v9, v17

    if-gez v9, :cond_11

    const/4 v9, 0x1

    goto :goto_11

    :cond_11
    move/from16 v9, v16

    :goto_11
    invoke-direct {v11, v14, v9}, LUY;-><init>(LTY;Z)V

    invoke-virtual {v2}, Liu1;->d()F

    move-result v2

    invoke-virtual {v7}, Liu1;->d()F

    move-result v7

    sub-float/2addr v2, v7

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v17

    if-gez v2, :cond_12

    const/4 v2, 0x1

    goto :goto_12

    :cond_12
    move/from16 v2, v16

    :goto_12
    invoke-direct {v8, v11, v2}, LVY;-><init>(LUY;Z)V

    invoke-virtual {v8}, LVY;->b()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual {v8}, LVY;->c()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual {v8}, LVY;->d()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual {v8}, LVY;->a()Z

    move-result v2

    if-eqz v2, :cond_13

    const/4 v2, 0x1

    goto :goto_13

    :cond_13
    move/from16 v2, v16

    :goto_13
    invoke-direct {v3, v4, v5, v6, v2}, LVY;-><init>(ZZZZ)V

    invoke-virtual {v3}, LVY;->b()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-virtual {v3}, LVY;->c()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-virtual {v3}, LVY;->d()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-virtual {v3}, LVY;->a()Z

    move-result v2

    if-eqz v2, :cond_14

    const/4 v15, 0x1

    goto :goto_14

    :cond_14
    move/from16 v15, v16

    :goto_14
    if-nez v15, :cond_15

    iput-object v1, v0, Lio/github/sceneview/node/Node;->j:LyM2;

    goto :goto_15

    :cond_15
    invoke-virtual/range {p0 .. p1}, Lio/github/sceneview/node/Node;->H0(LyM2;)V

    :goto_15
    return-void
.end method

.method public L()Lio/github/sceneview/node/Node;
    .locals 7

    new-instance v6, Lio/github/sceneview/node/Node;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lio/github/sceneview/node/Node;-><init>(Lhu1;LUc4;Lhu1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v6}, Lio/github/sceneview/node/Node;->M(Lio/github/sceneview/node/Node;)Lio/github/sceneview/node/Node;

    move-result-object v0

    return-object v0
.end method

.method public final L0(Lhu1;LUc4;Lhu1;ZF)V
    .locals 1

    const-string v0, "position"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "quaternion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scale"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p4, :cond_0

    invoke-virtual {p0, p1, p2, p3, p5}, Lio/github/sceneview/node/Node;->J0(Lhu1;LUc4;Lhu1;F)V

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lio/github/sceneview/node/Node;->e:Lhu1;

    iput-object p2, p0, Lio/github/sceneview/node/Node;->f:LUc4;

    iput-object p3, p0, Lio/github/sceneview/node/Node;->g:Lhu1;

    :goto_0
    return-void
.end method

.method public M(Lio/github/sceneview/node/Node;)Lio/github/sceneview/node/Node;
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "toNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->e:Lhu1;

    iput-object v0, p1, Lio/github/sceneview/node/Node;->e:Lhu1;

    iget-object v0, p0, Lio/github/sceneview/node/Node;->f:LUc4;

    iput-object v0, p1, Lio/github/sceneview/node/Node;->f:LUc4;

    iget-object v0, p0, Lio/github/sceneview/node/Node;->g:Lhu1;

    iput-object v0, p1, Lio/github/sceneview/node/Node;->g:Lhu1;

    return-object p1
.end method

.method public N()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/github/sceneview/node/Node;->y0(LQ83;)V

    return-void
.end method

.method public N0()V
    .locals 2

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->a0()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/Scene;->addEntities([I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->a0()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/Scene;->removeEntities([I)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/sceneview/node/Node;

    invoke-virtual {v1}, Lio/github/sceneview/node/Node;->N0()V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public O(Lio/github/sceneview/SceneView;)V
    .locals 2

    const-string v0, "sceneView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->getLifecycle()Lqm5;

    move-result-object v0

    invoke-virtual {v0, p0}, LTX0;->d(LFq2;)V

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->Y()Lcom/google/android/filament/Scene;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->a0()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/Scene;->removeEntities([I)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->u:Lmm0;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lmm0;->c(Lom0;)V

    :cond_0
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/sceneview/node/Node;

    invoke-virtual {v1, p1}, Lio/github/sceneview/node/Node;->O(Lio/github/sceneview/SceneView;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lio/github/sceneview/node/Node;->r0(Lio/github/sceneview/SceneView;)V

    return-void
.end method

.method public final P(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/github/sceneview/SceneView;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lio/github/sceneview/node/Node;->w:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    new-instance v1, Lio/github/sceneview/node/Node$b;

    invoke-direct {v1, p0, p1}, Lio/github/sceneview/node/Node$b;-><init>(Lio/github/sceneview/node/Node;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public Q()Ljava/util/List;
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

.method public final R()Lkotlin/reflect/KProperty;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KProperty<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/sceneview/node/Node;->s:Lkotlin/reflect/KProperty;

    return-object v0
.end method

.method public final S()Lzq2;
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final T()F
    .locals 1

    iget v0, p0, Lio/github/sceneview/node/Node;->r:F

    return v0
.end method

.method public final U()F
    .locals 1

    iget v0, p0, Lio/github/sceneview/node/Node;->q:F

    return v0
.end method

.method public final V()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lio/github/sceneview/SceneView;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/sceneview/node/Node;->w:Ljava/util/List;

    return-object v0
.end method

.method public final W()Lio/github/sceneview/node/Node;
    .locals 2

    iget-object v0, p0, Lio/github/sceneview/node/Node;->t:LQ83;

    instance-of v1, v0, Lio/github/sceneview/node/Node;

    if-eqz v1, :cond_0

    check-cast v0, Lio/github/sceneview/node/Node;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final X()Lhu1;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/node/Node;->e:Lhu1;

    return-object v0
.end method

.method public final Y()LUc4;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/node/Node;->f:LUc4;

    return-object v0
.end method

.method public final Z()Lhu1;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/node/Node;->g:Lhu1;

    return-object v0
.end method

.method public a(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->a(LP83;)V

    return-void
.end method

.method public a0()[I
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/node/Node;->d:[I

    return-object v0
.end method

.method public b(LP83;LP83;FF)V
    .locals 1

    const-string v0, "e1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->b:LiC1$c;

    invoke-virtual {v0, p1, p2, p3, p4}, LiC1$c;->b(LP83;LP83;FF)V

    return-void
.end method

.method public b0()Lio/github/sceneview/SceneView;
    .locals 3

    iget-object v0, p0, Lio/github/sceneview/node/Node;->t:LQ83;

    instance-of v1, v0, Lio/github/sceneview/SceneView;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lio/github/sceneview/SceneView;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->W()Lio/github/sceneview/node/Node;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v0

    :cond_2
    :goto_1
    return-object v2
.end method

.method public c0()Lio/github/sceneview/node/Node;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/node/Node;->D:Lio/github/sceneview/node/Node;

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

    iget-object v0, p0, Lio/github/sceneview/node/Node;->A:Ljava/util/List;

    return-object v0
.end method

.method public d0()LyM2;
    .locals 8

    iget-object v0, p0, Lio/github/sceneview/node/Node;->h:LyM2;

    invoke-virtual {v0}, LyM2;->a()Liu1;

    move-result-object v1

    new-instance v2, Lhu1;

    invoke-virtual {v1}, Liu1;->e()F

    move-result v3

    invoke-virtual {v1}, Liu1;->f()F

    move-result v4

    invoke-virtual {v1}, Liu1;->g()F

    move-result v1

    invoke-direct {v2, v3, v4, v1}, Lhu1;-><init>(FFF)V

    iget-object v1, p0, Lio/github/sceneview/node/Node;->e:Lhu1;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LgN2;->f(LyM2;)LUc4;

    move-result-object v1

    iget-object v2, p0, Lio/github/sceneview/node/Node;->f:LUc4;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lhu1;

    invoke-virtual {v0}, LyM2;->b()Liu1;

    move-result-object v2

    new-instance v3, Lhu1;

    invoke-virtual {v2}, Liu1;->e()F

    move-result v4

    invoke-virtual {v2}, Liu1;->f()F

    move-result v5

    invoke-virtual {v2}, Liu1;->g()F

    move-result v2

    invoke-direct {v3, v4, v5, v2}, Lhu1;-><init>(FFF)V

    invoke-virtual {v3}, Lhu1;->g()F

    move-result v2

    invoke-virtual {v3}, Lhu1;->g()F

    move-result v4

    mul-float/2addr v2, v4

    invoke-virtual {v3}, Lhu1;->h()F

    move-result v4

    invoke-virtual {v3}, Lhu1;->h()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v2, v4

    invoke-virtual {v3}, Lhu1;->i()F

    move-result v4

    invoke-virtual {v3}, Lhu1;->i()F

    move-result v3

    mul-float/2addr v4, v3

    add-float/2addr v2, v4

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0}, LyM2;->c()Liu1;

    move-result-object v3

    new-instance v4, Lhu1;

    invoke-virtual {v3}, Liu1;->e()F

    move-result v5

    invoke-virtual {v3}, Liu1;->f()F

    move-result v6

    invoke-virtual {v3}, Liu1;->g()F

    move-result v3

    invoke-direct {v4, v5, v6, v3}, Lhu1;-><init>(FFF)V

    invoke-virtual {v4}, Lhu1;->g()F

    move-result v3

    invoke-virtual {v4}, Lhu1;->g()F

    move-result v5

    mul-float/2addr v3, v5

    invoke-virtual {v4}, Lhu1;->h()F

    move-result v5

    invoke-virtual {v4}, Lhu1;->h()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v3, v5

    invoke-virtual {v4}, Lhu1;->i()F

    move-result v5

    invoke-virtual {v4}, Lhu1;->i()F

    move-result v4

    mul-float/2addr v5, v4

    add-float/2addr v3, v5

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    double-to-float v3, v3

    invoke-virtual {v0}, LyM2;->d()Liu1;

    move-result-object v4

    new-instance v5, Lhu1;

    invoke-virtual {v4}, Liu1;->e()F

    move-result v6

    invoke-virtual {v4}, Liu1;->f()F

    move-result v7

    invoke-virtual {v4}, Liu1;->g()F

    move-result v4

    invoke-direct {v5, v6, v7, v4}, Lhu1;-><init>(FFF)V

    invoke-virtual {v5}, Lhu1;->g()F

    move-result v4

    invoke-virtual {v5}, Lhu1;->g()F

    move-result v6

    mul-float/2addr v4, v6

    invoke-virtual {v5}, Lhu1;->h()F

    move-result v6

    invoke-virtual {v5}, Lhu1;->h()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v4, v6

    invoke-virtual {v5}, Lhu1;->i()F

    move-result v6

    invoke-virtual {v5}, Lhu1;->i()F

    move-result v5

    mul-float/2addr v6, v5

    add-float/2addr v4, v6

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-direct {v1, v2, v3, v4}, Lhu1;-><init>(FFF)V

    iget-object v2, p0, Lio/github/sceneview/node/Node;->g:Lhu1;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    iget-object v0, p0, Lio/github/sceneview/node/Node;->e:Lhu1;

    iget-object v1, p0, Lio/github/sceneview/node/Node;->f:LUc4;

    iget-object v2, p0, Lio/github/sceneview/node/Node;->g:Lhu1;

    invoke-static {v0, v1, v2}, LgN2;->a(Lhu1;LUc4;Lhu1;)LyM2;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public e(LP83;LP83;FF)V
    .locals 1

    const-string v0, "e1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->b:LiC1$c;

    invoke-virtual {v0, p1, p2, p3, p4}, LiC1$c;->e(LP83;LP83;FF)V

    return-void
.end method

.method public e0()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/node/Node;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public f(Lio/github/sceneview/node/Node;)Lio/github/sceneview/node/Node;
    .locals 0

    invoke-static {p0, p1}, LQ83$a;->a(LQ83;Lio/github/sceneview/node/Node;)Lio/github/sceneview/node/Node;

    move-result-object p1

    return-object p1
.end method

.method public final f0()Ljava/lang/Integer;
    .locals 2
    .annotation build Lcom/google/android/filament/EntityInstance;
    .end annotation

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->e0()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {}, Ldl1;->j()Lcom/google/android/filament/TransformManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/filament/TransformManager;->getInstance(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public g(LPy1;)V
    .locals 9

    const-string v0, "frameTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lrm5$a;->a(Lrm5;LPy1;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->j:LyM2;

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->d0()LyM2;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, LgN2;->e(LyM2;LyM2;FILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->d0()LyM2;

    move-result-object v0

    iget-object v1, p0, Lio/github/sceneview/node/Node;->k:LyM2;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->d0()LyM2;

    move-result-object v0

    iput-object v0, p0, Lio/github/sceneview/node/Node;->j:LyM2;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->d0()LyM2;

    move-result-object v1

    iget-object v2, p0, Lio/github/sceneview/node/Node;->j:LyM2;

    invoke-virtual {p1}, LPy1;->d()D

    move-result-wide v3

    iget v5, p0, Lio/github/sceneview/node/Node;->i:F

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, LgN2;->j(LyM2;LyM2;DFFILjava/lang/Object;)LyM2;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/github/sceneview/node/Node;->H0(LyM2;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->d0()LyM2;

    move-result-object v0

    iput-object v0, p0, Lio/github/sceneview/node/Node;->j:LyM2;

    :goto_0
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->d0()LyM2;

    move-result-object v0

    iput-object v0, p0, Lio/github/sceneview/node/Node;->k:LyM2;

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->i0()LyM2;

    move-result-object v0

    iget-object v1, p0, Lio/github/sceneview/node/Node;->l:LyM2;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->f0()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {}, Ldl1;->j()Lcom/google/android/filament/TransformManager;

    move-result-object v1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->i0()LyM2;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lel1;->c(Lcom/google/android/filament/TransformManager;ILyM2;)V

    :cond_2
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->i0()LyM2;

    move-result-object v0

    iput-object v0, p0, Lio/github/sceneview/node/Node;->l:LyM2;

    iget-object v0, p0, Lio/github/sceneview/node/Node;->v:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-void
.end method

.method public g0()Lhu1;
    .locals 4

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->i0()LyM2;

    move-result-object v0

    invoke-virtual {v0}, LyM2;->a()Liu1;

    move-result-object v0

    new-instance v1, Lhu1;

    invoke-virtual {v0}, Liu1;->e()F

    move-result v2

    invoke-virtual {v0}, Liu1;->f()F

    move-result v3

    invoke-virtual {v0}, Liu1;->g()F

    move-result v0

    invoke-direct {v1, v2, v3, v0}, Lhu1;-><init>(FFF)V

    return-object v1
.end method

.method public h0()LUc4;
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->i0()LyM2;

    move-result-object v0

    invoke-virtual {v0}, LyM2;->g()LUc4;

    move-result-object v0

    return-object v0
.end method

.method public i0()LyM2;
    .locals 2

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->W()Lio/github/sceneview/node/Node;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/github/sceneview/node/Node;->i0()LyM2;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->d0()LyM2;

    move-result-object v1

    invoke-virtual {v0, v1}, LyM2;->e(LyM2;)LyM2;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->d0()LyM2;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public j(LRb5;LP83;)V
    .locals 8

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->k0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/github/sceneview/node/Node;->s:Lkotlin/reflect/KProperty;

    new-instance v1, Lio/github/sceneview/node/Node$c;

    invoke-direct {v1, p0}, Lio/github/sceneview/node/Node$c;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lio/github/sceneview/node/Node;->C:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/github/sceneview/node/Node;->C:Z

    return-void

    :cond_0
    invoke-virtual {p1}, LRb5;->a()F

    move-result v0

    invoke-virtual {p1}, LRb5;->b()F

    move-result p1

    sub-float/2addr v0, p1

    sget-object p1, LUc4;->e:LUc4$a;

    new-instance v7, Lhu1;

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lhu1;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    neg-float v0, v0

    const v1, 0x42652ee0

    mul-float/2addr v0, v1

    invoke-virtual {p1, v7, v0}, LUc4$a;->a(Lhu1;F)LUc4;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lio/github/sceneview/node/Node;->s0(LP83;LUc4;)V

    :cond_1
    return-void
.end method

.method public final j0()Z
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k(Lbj5;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->l0()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/github/sceneview/node/Node;->s:Lkotlin/reflect/KProperty;

    new-instance p2, Lio/github/sceneview/node/Node$h;

    invoke-direct {p2, p0}, Lio/github/sceneview/node/Node$h;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/github/sceneview/node/Node;->s:Lkotlin/reflect/KProperty;

    :cond_0
    return-void
.end method

.method public k0()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/sceneview/node/Node;->o:Z

    return v0
.end method

.method public l(Lbj5;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->l0()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/github/sceneview/node/Node;->s:Lkotlin/reflect/KProperty;

    if-nez p1, :cond_0

    new-instance p1, Lio/github/sceneview/node/Node$g;

    invoke-direct {p1, p0}, Lio/github/sceneview/node/Node$g;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/github/sceneview/node/Node;->s:Lkotlin/reflect/KProperty;

    :cond_0
    return-void
.end method

.method public l0()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/sceneview/node/Node;->p:Z

    return v0
.end method

.method public m0()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/sceneview/node/Node;->m:Z

    return v0
.end method

.method public n(LkW2;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final n0()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/sceneview/node/Node;->E:Z

    return v0
.end method

.method public o(LkW2;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public o0()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/sceneview/node/Node;->n:Z

    return v0
.end method

.method public onDestroy(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->N()V

    invoke-super {p0, p1}, LVX0;->onDestroy(LLifecycleOwner;)V

    return-void
.end method

.method public p(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->p(LP83;)V

    return-void
.end method

.method public p0()Z
    .locals 2

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->o0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->W()Lio/github/sceneview/node/Node;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/github/sceneview/node/Node;->p0()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public q(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LP83;->a()Landroid/view/MotionEvent;

    move-result-object v0

    invoke-virtual {p1}, LP83;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lio/github/sceneview/node/Node;->u0(Landroid/view/MotionEvent;Ljava/lang/Integer;)V

    return-void
.end method

.method public q0(Lio/github/sceneview/SceneView;)V
    .locals 2

    const-string v0, "sceneView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->w:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

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

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r0(Lio/github/sceneview/SceneView;)V
    .locals 2

    const-string v0, "sceneView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->x:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

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

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
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

.method public s0(LP83;LUc4;)V
    .locals 7

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "rotationDelta"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/github/sceneview/node/Node;->f:LUc4;

    new-instance v0, LUc4;

    invoke-virtual {p1}, LUc4;->a()F

    move-result v1

    invoke-virtual {p2}, LUc4;->b()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {p1}, LUc4;->b()F

    move-result v2

    invoke-virtual {p2}, LUc4;->a()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {p1}, LUc4;->c()F

    move-result v2

    invoke-virtual {p2}, LUc4;->d()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {p1}, LUc4;->d()F

    move-result v2

    invoke-virtual {p2}, LUc4;->c()F

    move-result v3

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    invoke-virtual {p1}, LUc4;->a()F

    move-result v2

    invoke-virtual {p2}, LUc4;->c()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {p1}, LUc4;->b()F

    move-result v3

    invoke-virtual {p2}, LUc4;->d()F

    move-result v4

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    invoke-virtual {p1}, LUc4;->c()F

    move-result v3

    invoke-virtual {p2}, LUc4;->a()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    invoke-virtual {p1}, LUc4;->d()F

    move-result v3

    invoke-virtual {p2}, LUc4;->b()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    invoke-virtual {p1}, LUc4;->a()F

    move-result v3

    invoke-virtual {p2}, LUc4;->d()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {p1}, LUc4;->b()F

    move-result v4

    invoke-virtual {p2}, LUc4;->c()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-virtual {p1}, LUc4;->c()F

    move-result v4

    invoke-virtual {p2}, LUc4;->b()F

    move-result v5

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    invoke-virtual {p1}, LUc4;->d()F

    move-result v4

    invoke-virtual {p2}, LUc4;->a()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-virtual {p1}, LUc4;->a()F

    move-result v4

    invoke-virtual {p2}, LUc4;->a()F

    move-result v5

    mul-float/2addr v4, v5

    invoke-virtual {p1}, LUc4;->b()F

    move-result v5

    invoke-virtual {p2}, LUc4;->b()F

    move-result v6

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-virtual {p1}, LUc4;->c()F

    move-result v5

    invoke-virtual {p2}, LUc4;->c()F

    move-result v6

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-virtual {p1}, LUc4;->d()F

    move-result p1

    invoke-virtual {p2}, LUc4;->d()F

    move-result p2

    mul-float/2addr p1, p2

    sub-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, LUc4;-><init>(FFFF)V

    iput-object v0, p0, Lio/github/sceneview/node/Node;->f:LUc4;

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

    iput-object p1, p0, Lio/github/sceneview/node/Node;->A:Ljava/util/List;

    return-void
.end method

.method public t(Lio/github/sceneview/node/Node;)V
    .locals 1

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LQ83$a;->e(LQ83;Lio/github/sceneview/node/Node;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->v0()V

    return-void
.end method

.method public t0(LP83;F)V
    .locals 5

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/github/sceneview/node/Node;->g:Lhu1;

    new-instance v0, Lhu1;

    invoke-virtual {p1}, Lhu1;->g()F

    move-result v1

    mul-float/2addr v1, p2

    invoke-virtual {p1}, Lhu1;->h()F

    move-result v2

    mul-float/2addr v2, p2

    invoke-virtual {p1}, Lhu1;->i()F

    move-result p1

    mul-float/2addr p1, p2

    invoke-direct {v0, v1, v2, p1}, Lhu1;-><init>(FFF)V

    iget p1, p0, Lio/github/sceneview/node/Node;->q:F

    iget p2, p0, Lio/github/sceneview/node/Node;->r:F

    new-instance v1, Lhu1;

    invoke-virtual {v0}, Lhu1;->g()F

    move-result v2

    cmpg-float v3, v2, p1

    if-gez v3, :cond_0

    move v2, p1

    goto :goto_0

    :cond_0
    cmpl-float v3, v2, p2

    if-lez v3, :cond_1

    move v2, p2

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lhu1;->h()F

    move-result v3

    cmpg-float v4, v3, p1

    if-gez v4, :cond_2

    move v3, p1

    goto :goto_1

    :cond_2
    cmpl-float v4, v3, p2

    if-lez v4, :cond_3

    move v3, p2

    :cond_3
    :goto_1
    invoke-virtual {v0}, Lhu1;->i()F

    move-result v0

    cmpg-float v4, v0, p1

    if-gez v4, :cond_4

    goto :goto_2

    :cond_4
    cmpl-float p1, v0, p2

    if-lez p1, :cond_5

    move p1, p2

    goto :goto_2

    :cond_5
    move p1, v0

    :goto_2
    invoke-direct {v1, v2, v3, p1}, Lhu1;-><init>(FFF)V

    iput-object v1, p0, Lio/github/sceneview/node/Node;->g:Lhu1;

    return-void
.end method

.method public u(Lbj5;LP83;)V
    .locals 2

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->l0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/github/sceneview/node/Node;->s:Lkotlin/reflect/KProperty;

    new-instance v1, Lio/github/sceneview/node/Node$f;

    invoke-direct {v1, p0}, Lio/github/sceneview/node/Node$f;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result p1

    invoke-virtual {p0, p2, p1}, Lio/github/sceneview/node/Node;->t0(LP83;F)V

    :cond_0
    return-void
.end method

.method public u0(Landroid/view/MotionEvent;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "motionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->z:Lkotlin/jvm/functions/Function2;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->W()Lio/github/sceneview/node/Node;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Lio/github/sceneview/node/Node;->u0(Landroid/view/MotionEvent;Ljava/lang/Integer;)V

    :cond_1
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

.method public v0()V
    .locals 2

    iget-object v0, p0, Lio/github/sceneview/node/Node;->u:Lmm0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lmm0;->b()V

    :cond_0
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/sceneview/node/Node;

    invoke-virtual {v1}, Lio/github/sceneview/node/Node;->v0()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/github/sceneview/node/Node;->y:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-void
.end method

.method public w(LRb5;LP83;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->k0()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/github/sceneview/node/Node;->s:Lkotlin/reflect/KProperty;

    new-instance p2, Lio/github/sceneview/node/Node$e;

    invoke-direct {p2, p0}, Lio/github/sceneview/node/Node$e;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/github/sceneview/node/Node;->s:Lkotlin/reflect/KProperty;

    :cond_0
    return-void
.end method

.method public final w0(Lnm0;)V
    .locals 2

    iput-object p1, p0, Lio/github/sceneview/node/Node;->G:Lnm0;

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    iget-object v1, p0, Lio/github/sceneview/node/Node;->u:Lmm0;

    if-nez v1, :cond_2

    new-instance v1, Lmm0;

    invoke-direct {v1, p0, p1}, Lmm0;-><init>(Lo96;Lnm0;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->Q()Lom0;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->Q()Lom0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lmm0;->c(Lom0;)V

    :cond_1
    iput-object v1, p0, Lio/github/sceneview/node/Node;->u:Lmm0;

    goto :goto_0

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lmm0;->a()Lnm0;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lio/github/sceneview/node/Node;->u:Lmm0;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lmm0;->d(Lnm0;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lio/github/sceneview/node/Node;->u:Lmm0;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v0}, Lmm0;->c(Lom0;)V

    :cond_4
    iput-object v0, p0, Lio/github/sceneview/node/Node;->u:Lmm0;

    :cond_5
    :goto_0
    return-void
.end method

.method public x(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->x(LP83;)V

    return-void
.end method

.method public final x0(Lkotlin/reflect/KProperty;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KProperty<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/github/sceneview/node/Node;->s:Lkotlin/reflect/KProperty;

    return-void
.end method

.method public y()LjN2;
    .locals 2

    new-instance v0, LjN2;

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->i0()LyM2;

    move-result-object v1

    invoke-static {v1}, LgN2;->k(LyM2;)[F

    move-result-object v1

    invoke-direct {v0, v1}, LjN2;-><init>([F)V

    return-object v0
.end method

.method public final y0(LQ83;)V
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/node/Node;->t:LQ83;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lio/github/sceneview/node/Node;->O(Lio/github/sceneview/SceneView;)V

    :cond_0
    iget-object v0, p0, Lio/github/sceneview/node/Node;->t:LQ83;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, LQ83;->E(Lio/github/sceneview/node/Node;)Lio/github/sceneview/node/Node;

    :cond_1
    iput-object p1, p0, Lio/github/sceneview/node/Node;->t:LQ83;

    if-eqz p1, :cond_2

    invoke-interface {p1, p0}, LQ83;->f(Lio/github/sceneview/node/Node;)Lio/github/sceneview/node/Node;

    :cond_2
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p0, p1}, Lio/github/sceneview/node/Node;->K(Lio/github/sceneview/SceneView;)V

    :cond_3
    return-void
.end method

.method public z(LP83;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/Node;->b:LiC1$c;

    invoke-virtual {v0, p1}, LiC1$c;->z(LP83;)V

    return-void
.end method

.method public final z0(Lhu1;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/github/sceneview/node/Node;->e:Lhu1;

    return-void
.end method
