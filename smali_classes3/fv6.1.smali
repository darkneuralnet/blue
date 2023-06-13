.class public final Lfv6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;
.implements Liw6;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfv6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 42\u00020\u00012\u00020\u0002:\u0001\u000fB\u00ab\u0001\u0008\u0007\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0006\u0010c\u001a\u00020`\u0012\u0006\u0010f\u001a\u00020d\u0012\u0006\u0010j\u001a\u00020g\u0012\u0006\u0010n\u001a\u00020k\u0012\u0006\u0010r\u001a\u00020o\u0012\u0006\u0010u\u001a\u00020s\u0012\u0006\u0010y\u001a\u00020v\u0012\u0006\u0010}\u001a\u00020z\u0012\u0007\u0010\u0081\u0001\u001a\u00020~\u0012\u0007\u0010\u0084\u0001\u001a\u00020\u0005\u0012\u0008\u0010\u0088\u0001\u001a\u00030\u0085\u0001\u0012\u0008\u0010\u008c\u0001\u001a\u00030\u0089\u0001\u0012\u0008\u0010\u0090\u0001\u001a\u00030\u008d\u0001\u00a2\u0006\u0006\u0008\u00d9\u0001\u0010\u00da\u0001J\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0008\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003J\u0010\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0015\u001a\u00020\u00032\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u00032\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0014\u0010\u001d\u001a\u00020\u00032\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002J\u0008\u0010\u001e\u001a\u00020\u0003H\u0002J\u0008\u0010\u001f\u001a\u00020\u0003H\u0002J\u0008\u0010 \u001a\u00020\u0003H\u0002J\u0008\u0010!\u001a\u00020\u0003H\u0002J\u0008\u0010\"\u001a\u00020\u0003H\u0002J\u0008\u0010#\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0002J&\u0010,\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\'2\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010)2\u0008\u0008\u0002\u0010+\u001a\u00020$H\u0002J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\'H\u0002J\u0008\u0010.\u001a\u00020\u0003H\u0002J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u00100\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u00103\u001a\u00020\u00032\u0006\u00102\u001a\u000201H\u0002J\u0010\u00104\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\'H\u0002J\u000c\u00106\u001a\u000205*\u000205H\u0002J\u0008\u00107\u001a\u00020\u0003H\u0002J\u001c\u0010:\u001a\u00020\u0003*\u00020\u00052\u0006\u00109\u001a\u0002082\u0006\u0010\u0019\u001a\u000205H\u0002J\u001c\u0010=\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u0002050<2\u0006\u0010;\u001a\u000205H\u0002J\u001c\u0010?\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u0002050<2\u0006\u0010>\u001a\u000205H\u0002J\u0016\u0010@\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000205\u0018\u00010<H\u0002J\u0008\u0010A\u001a\u00020\u0003H\u0002J\u0008\u0010B\u001a\u00020\u0003H\u0002J\u0008\u0010C\u001a\u00020\u0003H\u0002J,\u0010G\u001a\u00020\u00032\u0008\u0008\u0002\u0010(\u001a\u00020\'2\u0008\u0008\u0002\u00102\u001a\u0002012\u000e\u0008\u0002\u0010F\u001a\u0008\u0012\u0004\u0012\u00020E0DH\u0002R\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008a\u0010bR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010eR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008l\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008p\u0010qR\u0014\u0010u\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010tR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010xR\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u007f\u0010\u0080\u0001R\u0017\u0010\u0084\u0001\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008e\u0001\u0010\u008f\u0001R \u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020$0\u0091\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0092\u0001\u0010\u0093\u0001R\u001e\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020$0\u0091\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0095\u0001\u0010\u0093\u0001R\u0019\u0010\u0099\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0097\u0001\u0010\u0098\u0001R \u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008@\u0010\u0093\u0001R\u0018\u0010\u009d\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u009c\u0001\u00100R\u001c\u0010\u00a1\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009f\u0001\u0010\u00a0\u0001R!\u0010\u00a4\u0001\u001a\u00020$8B@\u0002X\u0082\u000e\u00a2\u0006\u0010\n\u0006\u0008\u00a2\u0001\u0010\u0098\u0001\u001a\u0006\u0008\u0097\u0001\u0010\u00a3\u0001R\u001d\u0010\u00a7\u0001\u001a\t\u0012\u0004\u0012\u00020$0\u00a5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008?\u0010\u00a6\u0001R\u001f\u0010\u00aa\u0001\u001a\u000b \u00a8\u0001*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008/\u0010\u00a9\u0001R&\u0010\u00ad\u0001\u001a\u0012\u0012\r\u0012\u000b \u00a8\u0001*\u0004\u0018\u00010\u00130\u00130\u00ab\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u00080\u0010\u00ac\u0001R\u0016\u0010\u0011\u001a\u00030\u00ae\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u00086\u0010\u00af\u0001R\u0017\u0010\u00b2\u0001\u001a\u00030\u00b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\"\u0010\u00b1\u0001R\u0017\u0010\u00b4\u0001\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b3\u0001\u0010\u0098\u0001R\u0019\u0010\u00b7\u0001\u001a\u0005\u0018\u00010\u00b5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001f\u0010\u00b6\u0001R\u0019\u0010\u00ba\u0001\u001a\u0004\u0018\u00010$8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001R\u001d\u0010\u00bb\u0001\u001a\t\u0012\u0004\u0012\u00020$0\u00a5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001e\u0010\u00a6\u0001R\u001e\u0010\u00bd\u0001\u001a\t\u0012\u0004\u0012\u0002010\u00a5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00bc\u0001\u0010\u00a6\u0001R\u001d\u0010\u00be\u0001\u001a\t\u0012\u0004\u0012\u00020$0\u00a5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008!\u0010\u00a6\u0001R\u001e\u0010\u00c0\u0001\u001a\t\u0012\u0004\u0012\u00020\'0\u00a5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00bf\u0001\u0010\u00a6\u0001R%\u0010\u00c3\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00c1\u00010D0\u00a5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c2\u0001\u0010\u00a6\u0001R$\u0010\u00c5\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00c4\u00010D0\u00a5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008A\u0010\u00a6\u0001R!\u0010\u00ca\u0001\u001a\u00030\u00c6\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001\u001a\u0006\u0008\u009f\u0001\u0010\u00c9\u0001R\u008b\u0001\u0010\u00ce\u0001\u001an\u0012i\u0012g\u0012\r\u0012\u000b \u00a8\u0001*\u0004\u0018\u00010$0$\u0012\r\u0012\u000b \u00a8\u0001*\u0004\u0018\u00010101\u0012\r\u0012\u000b \u00a8\u0001*\u0004\u0018\u00010$0$ \u00a8\u0001*2\u0012\r\u0012\u000b \u00a8\u0001*\u0004\u0018\u00010$0$\u0012\r\u0012\u000b \u00a8\u0001*\u0004\u0018\u00010101\u0012\r\u0012\u000b \u00a8\u0001*\u0004\u0018\u00010$0$\u0018\u00010\u00cc\u00010\u00cc\u00010\u00cb\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008-\u0010\u00c8\u0001\u001a\u0006\u0008\u00a2\u0001\u0010\u00cd\u0001R\u001e\u0010\u00d0\u0001\u001a\n\u0012\u0005\u0012\u00030\u00cf\u00010\u00a5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0004\u0010\u00a6\u0001R\u001b\u0010\u00d3\u0001\u001a\u0005\u0018\u00010\u00d1\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0008\u0010\u00d2\u0001R\u001b\u0010\u00d6\u0001\u001a\u0005\u0018\u00010\u00d4\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0007\u0010\u00d5\u0001R\u001b\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0098\u0001\u0010\u00d7\u0001\u00a8\u0006\u00dc\u0001\u00b2\u0006\u000e\u0010*\u001a\u0004\u0018\u00010)8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010(\u001a\u00020\'8\nX\u008a\u0084\u0002\u00b2\u0006\r\u0010\u00db\u0001\u001a\u0002058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lfv6;",
        "Landroid/hardware/SensorEventListener;",
        "Liw6;",
        "",
        "W",
        "LcD1;",
        "map",
        "Y",
        "X",
        "V",
        "Lio/github/sceneview/ar/arcore/ArSession;",
        "session",
        "m",
        "",
        "exception",
        "a",
        "Lcom/google/ar/core/Config;",
        "config",
        "i",
        "Landroid/hardware/SensorEvent;",
        "event",
        "onSensorChanged",
        "Landroid/hardware/Sensor;",
        "sensor",
        "",
        "accuracy",
        "onAccuracyChanged",
        "Lorg/joda/time/DateTime;",
        "startTime",
        "c0",
        "J",
        "H",
        "M",
        "P",
        "F",
        "k0",
        "",
        "parkingStatusCanPark",
        "j0",
        "LSL4;",
        "resolvedLocation",
        "LbF0;",
        "currentParkingNest",
        "viaSkipBirdFlow",
        "g0",
        "U",
        "d0",
        "C",
        "D",
        "LFH3;",
        "parkingStatus",
        "s0",
        "p0",
        "",
        "E",
        "q0",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "position",
        "r0",
        "earthAccuracy",
        "Lkotlin/Pair;",
        "t0",
        "gpsAccuracy",
        "B",
        "x",
        "S",
        "o0",
        "m0",
        "Lco/bird/android/buava/Optional;",
        "",
        "barcodes",
        "e0",
        "Landroid/content/Context;",
        "b",
        "Landroid/content/Context;",
        "context",
        "Landroid/os/Handler;",
        "c",
        "Landroid/os/Handler;",
        "handler",
        "Lcom/uber/autodispose/ScopeProvider;",
        "d",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "Lrv6;",
        "e",
        "Lrv6;",
        "ui",
        "Le13;",
        "f",
        "Le13;",
        "navigator",
        "Lgl;",
        "g",
        "Lgl;",
        "appPreference",
        "LTq4;",
        "h",
        "LTq4;",
        "reactiveConfig",
        "Ldr4;",
        "Ldr4;",
        "locationManager",
        "Landroid/hardware/SensorManager;",
        "j",
        "Landroid/hardware/SensorManager;",
        "sensorManager",
        "LEa;",
        "k",
        "LEa;",
        "analyticsManager",
        "LDQ3;",
        "l",
        "LDQ3;",
        "permissionManager",
        "LYR4;",
        "LYR4;",
        "rideManager",
        "LoF3;",
        "n",
        "LoF3;",
        "parkingManager",
        "Ltm;",
        "o",
        "Ltm;",
        "arManager",
        "Lbn;",
        "p",
        "Lbn;",
        "areaManager",
        "q",
        "LcD1;",
        "googleMap",
        "Lco/bird/android/model/wire/WireRide;",
        "r",
        "Lco/bird/android/model/wire/WireRide;",
        "ride",
        "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;",
        "s",
        "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;",
        "polygonableRenderer",
        "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;",
        "t",
        "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;",
        "parkingNestRenderer",
        "Lcom/google/common/util/concurrent/SettableFuture;",
        "u",
        "Lcom/google/common/util/concurrent/SettableFuture;",
        "isArCoreAvailable",
        "v",
        "isGeospatialModeSupported",
        "w",
        "Z",
        "isGeospatialModeAvailableAtCurrentLocation",
        "Lcom/google/ar/core/VpsAvailability;",
        "geospatialAvailability",
        "y",
        "bestAccuracyMeters",
        "Lio/reactivex/disposables/c;",
        "z",
        "Lio/reactivex/disposables/c;",
        "timeoutTimerDisposable",
        "A",
        "()Z",
        "canSkipBirdScanOneTime",
        "La94;",
        "La94;",
        "useEarthPoseLocation",
        "kotlin.jvm.PlatformType",
        "Landroid/hardware/Sensor;",
        "sensorOrientation",
        "Lma4;",
        "Lma4;",
        "sensorEventRelay",
        "Lco/bird/android/model/wire/configs/Config;",
        "Lco/bird/android/model/wire/configs/Config;",
        "Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;",
        "Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;",
        "parkingLocationVerificationConfig",
        "G",
        "resultRequired",
        "",
        "Ljava/lang/Long;",
        "timeoutSeconds",
        "I",
        "Ljava/lang/Boolean;",
        "skipBirdScan",
        "hasMetAccuracyRequirementRelay",
        "K",
        "parkingStateRelay",
        "hasScannedBarcodeRelay",
        "Q",
        "resolvedLocationRelay",
        "Lco/bird/android/model/wire/WireLocation;",
        "R",
        "currentNestAnchorLocationRelay",
        "Lcom/google/ar/core/Anchor;",
        "currentNestAnchorRelay",
        "Lio/github/sceneview/ar/node/ArModelNode;",
        "T",
        "Lkotlin/Lazy;",
        "()Lio/github/sceneview/ar/node/ArModelNode;",
        "nestArModelNode",
        "LZ84;",
        "Lkotlin/Triple;",
        "()LZ84;",
        "scanModePropertyObservable",
        "LEH3;",
        "scanModeStateRelay",
        "LfM2;",
        "LfM2;",
        "locationMarker",
        "Lxj0;",
        "Lxj0;",
        "radiusCircle",
        "Lorg/joda/time/DateTime;",
        "startScanningTime",
        "<init>",
        "(Landroid/content/Context;Landroid/os/Handler;Lcom/uber/autodispose/ScopeProvider;Lrv6;Le13;Lgl;LTq4;Ldr4;Landroid/hardware/SensorManager;LEa;LDQ3;LYR4;LoF3;Ltm;Lbn;LcD1;Lco/bird/android/model/wire/WireRide;Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;)V",
        "timeScanningSeconds",
        "co.bird.android.feature.ar-parking"
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
        "SMAP\nVpsParkingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1138:1\n180#2:1139\n180#2:1140\n237#2:1141\n180#2:1144\n180#2:1145\n180#2:1146\n180#2:1147\n218#2:1161\n199#2:1162\n52#3,2:1142\n1#4:1148\n1549#5:1149\n1620#5,3:1150\n1549#5:1153\n1620#5,3:1154\n1549#5:1157\n1620#5,3:1158\n*S KotlinDebug\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter\n*L\n315#1:1139\n361#1:1140\n509#1:1141\n520#1:1144\n549#1:1145\n555#1:1146\n599#1:1147\n1009#1:1161\n1035#1:1162\n514#1:1142,2\n899#1:1149\n899#1:1150,3\n907#1:1153\n907#1:1154,3\n913#1:1157\n913#1:1158,3\n*E\n"
    }
.end annotation


# static fields
.field public static final p0:Lfv6$a;


# instance fields
.field public A:Z

.field public final B:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final C:Landroid/hardware/Sensor;

.field public final D:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Landroid/hardware/SensorEvent;",
            ">;"
        }
    .end annotation
.end field

.field public final E:Lco/bird/android/model/wire/configs/Config;

.field public final F:Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;

.field public final G:Z

.field public final H:Ljava/lang/Long;

.field public final I:Ljava/lang/Boolean;

.field public final J:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final K:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "LFH3;",
            ">;"
        }
    .end annotation
.end field

.field public final P:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final Q:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "LSL4;",
            ">;"
        }
    .end annotation
.end field

.field public final R:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;>;"
        }
    .end annotation
.end field

.field public final S:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Lcom/google/ar/core/Anchor;",
            ">;>;"
        }
    .end annotation
.end field

.field public final T:Lkotlin/Lazy;

.field public final U:Lkotlin/Lazy;

.field public final W:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "LEH3;",
            ">;"
        }
    .end annotation
.end field

.field public X:LfM2;

.field public Y:Lxj0;

.field public Z:Lorg/joda/time/DateTime;

.field public final b:Landroid/content/Context;

.field public final c:Landroid/os/Handler;

.field public final d:Lcom/uber/autodispose/ScopeProvider;

.field public final e:Lrv6;

.field public final f:Le13;

.field public final g:Lgl;

.field public final h:LTq4;

.field public final i:Ldr4;

.field public final j:Landroid/hardware/SensorManager;

.field public final k:LEa;

.field public final l:LDQ3;

.field public final m:LYR4;

.field public final n:LoF3;

.field public final o:Ltm;

.field public final p:Lbn;

.field public final q:LcD1;

.field public final r:Lco/bird/android/model/wire/WireRide;

.field public final s:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

.field public final t:Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;

.field public u:Lcom/google/common/util/concurrent/SettableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/SettableFuture<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final v:Lcom/google/common/util/concurrent/SettableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/SettableFuture<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public w:Z

.field public x:Lcom/google/common/util/concurrent/SettableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/SettableFuture<",
            "Lcom/google/ar/core/VpsAvailability;",
            ">;"
        }
    .end annotation
.end field

.field public y:D

.field public z:Lio/reactivex/disposables/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfv6$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfv6$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfv6;->p0:Lfv6$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/uber/autodispose/ScopeProvider;Lrv6;Le13;Lgl;LTq4;Ldr4;Landroid/hardware/SensorManager;LEa;LDQ3;LYR4;LoF3;Ltm;Lbn;LcD1;Lco/bird/android/model/wire/WireRide;Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;)V
    .locals 20

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

    move-object/from16 v15, p15

    move-object/from16 v0, p16

    const-string v0, "context"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appPreference"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sensorManager"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionManager"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideManager"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parkingManager"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arManager"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "areaManager"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googleMap"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ride"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "polygonableRenderer"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parkingNestRenderer"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v15, p16

    iput-object v1, v0, Lfv6;->b:Landroid/content/Context;

    iput-object v2, v0, Lfv6;->c:Landroid/os/Handler;

    iput-object v3, v0, Lfv6;->d:Lcom/uber/autodispose/ScopeProvider;

    iput-object v4, v0, Lfv6;->e:Lrv6;

    iput-object v5, v0, Lfv6;->f:Le13;

    iput-object v6, v0, Lfv6;->g:Lgl;

    iput-object v7, v0, Lfv6;->h:LTq4;

    iput-object v8, v0, Lfv6;->i:Ldr4;

    iput-object v9, v0, Lfv6;->j:Landroid/hardware/SensorManager;

    iput-object v10, v0, Lfv6;->k:LEa;

    iput-object v11, v0, Lfv6;->l:LDQ3;

    iput-object v12, v0, Lfv6;->m:LYR4;

    iput-object v13, v0, Lfv6;->n:LoF3;

    iput-object v14, v0, Lfv6;->o:Ltm;

    move-object/from16 v1, p15

    iput-object v1, v0, Lfv6;->p:Lbn;

    iput-object v15, v0, Lfv6;->q:LcD1;

    move-object/from16 v1, p17

    move-object/from16 v2, p18

    iput-object v1, v0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    iput-object v2, v0, Lfv6;->s:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    move-object/from16 v2, p19

    iput-object v2, v0, Lfv6;->t:Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;

    invoke-static {}, Lcom/google/common/util/concurrent/SettableFuture;->create()Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object v2

    const-string v3, "create()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lfv6;->u:Lcom/google/common/util/concurrent/SettableFuture;

    invoke-static {}, Lcom/google/common/util/concurrent/SettableFuture;->create()Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lfv6;->v:Lcom/google/common/util/concurrent/SettableFuture;

    const/4 v2, 0x1

    iput-boolean v2, v0, Lfv6;->w:Z

    invoke-static {}, Lcom/google/common/util/concurrent/SettableFuture;->create()Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lfv6;->x:Lcom/google/common/util/concurrent/SettableFuture;

    const-wide v5, 0x7fefffffffffffffL    # Double.MAX_VALUE

    iput-wide v5, v0, Lfv6;->y:D

    sget-object v3, La94;->h:La94$a;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v6, 0x0

    const/4 v10, 0x2

    invoke-static {v3, v5, v6, v10, v6}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v11

    iput-object v11, v0, Lfv6;->B:La94;

    const/4 v11, 0x3

    invoke-virtual {v9, v11}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v9

    iput-object v9, v0, Lfv6;->C:Landroid/hardware/Sensor;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v9

    const-string v11, "create<SensorEvent>()"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v9, v0, Lfv6;->D:Lma4;

    invoke-virtual/range {p17 .. p17}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v9

    invoke-static {v7, v9}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v7

    iput-object v7, v0, Lfv6;->E:Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v7}, Lco/bird/android/model/wire/configs/Config;->getParkingConfig()Lco/bird/android/model/wire/configs/ParkingConfig;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/wire/configs/ParkingConfig;->getParkingLocationVerification()Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;

    move-result-object v7

    iput-object v7, v0, Lfv6;->F:Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;

    invoke-virtual {v7}, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->getResultRequired()Ljava/lang/Boolean;

    move-result-object v9

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    iput-boolean v9, v0, Lfv6;->G:Z

    invoke-virtual {v7}, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->getTimeoutSeconds()Ljava/lang/Integer;

    move-result-object v11

    if-eqz v11, :cond_0

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v9

    int-to-long v11, v9

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_0

    :cond_0
    if-eqz v9, :cond_1

    move-object v9, v6

    goto :goto_0

    :cond_1
    const-wide/16 v11, 0xf

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    :goto_0
    iput-object v9, v0, Lfv6;->H:Ljava/lang/Long;

    invoke-virtual {v7}, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->getSkipBirdScan()Ljava/lang/Boolean;

    move-result-object v7

    iput-object v7, v0, Lfv6;->I:Ljava/lang/Boolean;

    invoke-static {v3, v5, v6, v10, v6}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v7

    iput-object v7, v0, Lfv6;->J:La94;

    new-instance v7, Lle6;

    invoke-virtual/range {p17 .. p17}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v1

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xe

    const/4 v14, 0x0

    move-object/from16 p9, v7

    move-object/from16 p10, v1

    move-object/from16 p11, v9

    move-object/from16 p12, v11

    move/from16 p13, v12

    move/from16 p14, v13

    move-object/from16 p15, v14

    invoke-direct/range {p9 .. p15}, Lle6;-><init>(Ljava/lang/String;Lco/bird/android/model/RiderAreaState;LbF0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3, v7, v6, v10, v6}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v1

    iput-object v1, v0, Lfv6;->K:La94;

    invoke-static {v3, v5, v6, v10, v6}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v1

    iput-object v1, v0, Lfv6;->P:La94;

    sget-object v1, LSL4;->p:LSL4$a;

    const/4 v5, 0x0

    const-wide/16 v11, 0x0

    const/4 v7, 0x0

    invoke-interface/range {p8 .. p8}, Ldr4;->p()LZ84;

    move-result-object v8

    invoke-virtual {v8}, LZ84;->a()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/location/Location;

    const-wide/16 v13, 0x0

    const/4 v9, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 p5, v1

    move-object/from16 p6, v5

    move-wide/from16 p7, v11

    move/from16 p9, v7

    move-object/from16 p10, v8

    move-wide/from16 p11, v13

    move/from16 p13, v9

    move-object/from16 p14, v15

    move-object/from16 p15, v16

    move/from16 p16, v17

    move/from16 p17, v18

    move/from16 p18, v19

    invoke-virtual/range {p5 .. p18}, LSL4$a;->a(Lcom/google/ar/core/GeospatialPose;DZLandroid/location/Location;DZLjava/lang/Double;Ljava/lang/Double;ZZZ)LSL4;

    move-result-object v1

    invoke-static {v3, v1, v6, v10, v6}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v1

    iput-object v1, v0, Lfv6;->Q:La94;

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v5

    invoke-static {v3, v5, v6, v10, v6}, La94$a;->createNonRedundant$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v5

    iput-object v5, v0, Lfv6;->R:La94;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-static {v3, v1, v6, v10, v6}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v1

    iput-object v1, v0, Lfv6;->S:La94;

    sget-object v1, Lfv6$m;->g:Lfv6$m;

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lfv6;->T:Lkotlin/Lazy;

    new-instance v1, Lfv6$q;

    invoke-direct {v1, v0}, Lfv6$q;-><init>(Lfv6;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lfv6;->U:Lkotlin/Lazy;

    sget-object v1, LEH3;->b:LEH3;

    invoke-static {v3, v1, v6, v10, v6}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v1

    iput-object v1, v0, Lfv6;->W:La94;

    invoke-virtual/range {p4 .. p4}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lco/bird/android/feature/ar/view/VpsView;->setListener(Liw6;)V

    invoke-virtual/range {p4 .. p4}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v1

    invoke-virtual {v1, v2}, Lco/bird/android/feature/ar/view/VpsView;->setEnableOcrAnalysis(Z)V

    invoke-virtual/range {p4 .. p4}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lco/bird/android/feature/ar/view/VpsView;->setEnableAnalysis(Z)V

    return-void
.end method

.method public static final G(Lfv6;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lfv6;->v:Lcom/google/common/util/concurrent/SettableFuture;

    invoke-virtual {v1}, Lcom/google/common/util/concurrent/SettableFuture;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    const-string v2, "Exception while checking if geospatial mode is supported, returning false: "

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lg46;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "useEarthPose = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p0, p0, Lfv6;->B:La94;

    const-string v0, "useEarthPose"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static final I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/buava/Optional;

    return-object p0
.end method

.method public static final O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Triple;

    return-object p0
.end method

.method public static final a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getArManager$p(Lfv6;)Ltm;
    .locals 0

    iget-object p0, p0, Lfv6;->o:Ltm;

    return-object p0
.end method

.method public static final synthetic access$getBestAccuracyMeters$p(Lfv6;)D
    .locals 2

    iget-wide v0, p0, Lfv6;->y:D

    return-wide v0
.end method

.method public static final synthetic access$getCanSkipBirdScanOneTime(Lfv6;)Z
    .locals 0

    invoke-virtual {p0}, Lfv6;->w()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getCurrentNestAnchorRelay$p(Lfv6;)La94;
    .locals 0

    iget-object p0, p0, Lfv6;->S:La94;

    return-object p0
.end method

.method public static final synthetic access$getGeospatialAvailability$p(Lfv6;)Lcom/google/common/util/concurrent/SettableFuture;
    .locals 0

    iget-object p0, p0, Lfv6;->x:Lcom/google/common/util/concurrent/SettableFuture;

    return-object p0
.end method

.method public static final synthetic access$getHasMetAccuracyRequirementRelay$p(Lfv6;)La94;
    .locals 0

    iget-object p0, p0, Lfv6;->J:La94;

    return-object p0
.end method

.method public static final synthetic access$getHasScannedBarcodeRelay$p(Lfv6;)La94;
    .locals 0

    iget-object p0, p0, Lfv6;->P:La94;

    return-object p0
.end method

.method public static final synthetic access$getLocationManager$p(Lfv6;)Ldr4;
    .locals 0

    iget-object p0, p0, Lfv6;->i:Ldr4;

    return-object p0
.end method

.method public static final synthetic access$getNavigator$p(Lfv6;)Le13;
    .locals 0

    iget-object p0, p0, Lfv6;->f:Le13;

    return-object p0
.end method

.method public static final synthetic access$getNestArModelNode(Lfv6;)Lio/github/sceneview/ar/node/ArModelNode;
    .locals 0

    invoke-virtual {p0}, Lfv6;->z()Lio/github/sceneview/ar/node/ArModelNode;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getParkingLocationVerificationConfig$p(Lfv6;)Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;
    .locals 0

    iget-object p0, p0, Lfv6;->F:Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;

    return-object p0
.end method

.method public static final synthetic access$getParkingManager$p(Lfv6;)LoF3;
    .locals 0

    iget-object p0, p0, Lfv6;->n:LoF3;

    return-object p0
.end method

.method public static final synthetic access$getParkingStateRelay$p(Lfv6;)La94;
    .locals 0

    iget-object p0, p0, Lfv6;->K:La94;

    return-object p0
.end method

.method public static final synthetic access$getResolvedLocationRelay$p(Lfv6;)La94;
    .locals 0

    iget-object p0, p0, Lfv6;->Q:La94;

    return-object p0
.end method

.method public static final synthetic access$getResultRequired$p(Lfv6;)Z
    .locals 0

    iget-boolean p0, p0, Lfv6;->G:Z

    return p0
.end method

.method public static final synthetic access$getRide$p(Lfv6;)Lco/bird/android/model/wire/WireRide;
    .locals 0

    iget-object p0, p0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    return-object p0
.end method

.method public static final synthetic access$getScanModeStateRelay$p(Lfv6;)La94;
    .locals 0

    iget-object p0, p0, Lfv6;->W:La94;

    return-object p0
.end method

.method public static final synthetic access$getSensorEventRelay$p(Lfv6;)Lma4;
    .locals 0

    iget-object p0, p0, Lfv6;->D:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getSensorManager$p(Lfv6;)Landroid/hardware/SensorManager;
    .locals 0

    iget-object p0, p0, Lfv6;->j:Landroid/hardware/SensorManager;

    return-object p0
.end method

.method public static final synthetic access$getSensorOrientation$p(Lfv6;)Landroid/hardware/Sensor;
    .locals 0

    iget-object p0, p0, Lfv6;->C:Landroid/hardware/Sensor;

    return-object p0
.end method

.method public static final synthetic access$getSkipBirdScan$p(Lfv6;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lfv6;->I:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final synthetic access$getStartScanningTime$p(Lfv6;)Lorg/joda/time/DateTime;
    .locals 0

    iget-object p0, p0, Lfv6;->Z:Lorg/joda/time/DateTime;

    return-object p0
.end method

.method public static final synthetic access$getTimeoutSeconds$p(Lfv6;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lfv6;->H:Ljava/lang/Long;

    return-object p0
.end method

.method public static final synthetic access$getUi$p(Lfv6;)Lrv6;
    .locals 0

    iget-object p0, p0, Lfv6;->e:Lrv6;

    return-object p0
.end method

.method public static final synthetic access$gpsLocationMeetsAccuracy(Lfv6;D)Lkotlin/Pair;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lfv6;->B(D)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isArCoreAvailable$p(Lfv6;)Lcom/google/common/util/concurrent/SettableFuture;
    .locals 0

    iget-object p0, p0, Lfv6;->u:Lcom/google/common/util/concurrent/SettableFuture;

    return-object p0
.end method

.method public static final synthetic access$isGeospatialModeAvailableAtCurrentLocation$p(Lfv6;)Z
    .locals 0

    iget-boolean p0, p0, Lfv6;->w:Z

    return p0
.end method

.method public static final synthetic access$isGeospatialModeSupported$p(Lfv6;)Lcom/google/common/util/concurrent/SettableFuture;
    .locals 0

    iget-object p0, p0, Lfv6;->v:Lcom/google/common/util/concurrent/SettableFuture;

    return-object p0
.end method

.method public static final synthetic access$loadTimeoutTimerIfNecessary(Lfv6;)V
    .locals 0

    invoke-virtual {p0}, Lfv6;->S()V

    return-void
.end method

.method public static final synthetic access$maybeSetThirdPartyLocation(Lfv6;LSL4;)V
    .locals 0

    invoke-virtual {p0, p1}, Lfv6;->U(LSL4;)V

    return-void
.end method

.method public static final synthetic access$resetFlow(Lfv6;Lorg/joda/time/DateTime;)V
    .locals 0

    invoke-virtual {p0, p1}, Lfv6;->c0(Lorg/joda/time/DateTime;)V

    return-void
.end method

.method public static final synthetic access$resetThirdPartyLocationOnCancel(Lfv6;)V
    .locals 0

    invoke-virtual {p0}, Lfv6;->d0()V

    return-void
.end method

.method public static final synthetic access$setBestAccuracyMeters$p(Lfv6;D)V
    .locals 0

    iput-wide p1, p0, Lfv6;->y:D

    return-void
.end method

.method public static final synthetic access$setCanSkipBirdScanOneTime$p(Lfv6;Z)V
    .locals 0

    iput-boolean p1, p0, Lfv6;->A:Z

    return-void
.end method

.method public static final synthetic access$setEmittedLocationAndClose(Lfv6;LSL4;LbF0;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lfv6;->g0(LSL4;LbF0;Z)V

    return-void
.end method

.method public static final synthetic access$setGeospatialModeAvailableAtCurrentLocation$p(Lfv6;Z)V
    .locals 0

    iput-boolean p1, p0, Lfv6;->w:Z

    return-void
.end method

.method public static final synthetic access$showParkingMode(Lfv6;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lfv6;->j0(Z)V

    return-void
.end method

.method public static final synthetic access$showScanSurroundingsUi(Lfv6;)V
    .locals 0

    invoke-virtual {p0}, Lfv6;->k0()V

    return-void
.end method

.method public static final synthetic access$showTimeoutDialog(Lfv6;)V
    .locals 0

    invoke-virtual {p0}, Lfv6;->m0()V

    return-void
.end method

.method public static final synthetic access$updateLocationProperties(Lfv6;LSL4;)V
    .locals 0

    invoke-virtual {p0, p1}, Lfv6;->p0(LSL4;)V

    return-void
.end method

.method public static final synthetic access$updateParkingStatusProperties(Lfv6;LFH3;)V
    .locals 0

    invoke-virtual {p0, p1}, Lfv6;->s0(LFH3;)V

    return-void
.end method

.method public static final synthetic access$vpsLocationMeetsAccuracy(Lfv6;D)Lkotlin/Pair;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lfv6;->t0(D)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lfv6;->a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lfv6;->K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0, p1}, Lfv6;->Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f0(Lfv6;LSL4;LFH3;Lco/bird/android/buava/Optional;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lfv6;->Q:La94;

    invoke-virtual {p1}, La94;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSL4;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lfv6;->K:La94;

    invoke-virtual {p2}, La94;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LFH3;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p3, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p3}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p3

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lfv6;->e0(LSL4;LFH3;Lco/bird/android/buava/Optional;)V

    return-void
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lfv6;->n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h0(Lfv6;LSL4;LbF0;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lfv6;->g0(LSL4;LbF0;Z)V

    return-void
.end method

.method public static final i0(Lfv6;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lfv6;->f:Le13;

    sget-object v0, Le13$b;->c:Le13$b;

    const/4 v1, 0x0

    new-array v1, v1, [Lkotlin/Pair;

    invoke-interface {p0, v0, v1}, Le13;->J(Le13$b;[Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic j(Lfv6;)V
    .locals 0

    invoke-static {p0}, Lfv6;->l0(Lfv6;)V

    return-void
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lfv6;->T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lfv6;->O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final l0(Lfv6;)V
    .locals 6

    const-string v0, "device"

    const-string v1, "this$0"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lfv6;->u:Lcom/google/common/util/concurrent/SettableFuture;

    invoke-virtual {v2}, Lcom/google/common/util/concurrent/SettableFuture;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    const-string v3, "avail"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "arCore is available, transitioning to next step"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const-string v2, "arCore is not available currently"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lfv6;->o:Ltm;

    sget-object v3, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS_V2:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v4, p0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireRide;->getBirdId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v3, v4, v5, v0}, Ltm;->c(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v2, Lnl4;->scan_surroundings_unavailable_description:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    const-string v3, "arCore availability exception: "

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lg46;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lfv6;->o:Ltm;

    sget-object v3, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS_V2:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v4, p0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireRide;->getBirdId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v3, v4, v5, v0}, Ltm;->c(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v0, Lnl4;->scan_surroundings_unavailable_description:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updating message res id for scan surrounding bottom sheet to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p0, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lrv6;->Yl(I)V

    :cond_1
    return-void
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lfv6;->Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic o(Lfv6;)V
    .locals 0

    invoke-static {p0}, Lfv6;->G(Lfv6;)V

    return-void
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lfv6;->R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 0

    invoke-static {p0, p1}, Lfv6;->N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lfv6;->b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic t(Lfv6;)V
    .locals 0

    invoke-static {p0}, Lfv6;->i0(Lfv6;)V

    return-void
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lfv6;->I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lfv6;->L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final y(Lkotlin/Lazy;)D
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "Ljava/lang/Double;",
            ">;)D"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final A()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lkotlin/Triple<",
            "Ljava/lang/Boolean;",
            "LFH3;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lfv6;->U:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public final B(D)Lkotlin/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lfv6;->x()Lkotlin/Pair;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    if-nez v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    iget-object v0, p0, Lfv6;->F:Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->getAllowDeviceLocationIfAccurateAfterSeconds()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    cmpl-double v0, v4, v0

    if-ltz v0, :cond_1

    cmpg-double p1, p1, v2

    if-gtz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final C(Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "ar session created"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lfv6;->u:Lcom/google/common/util/concurrent/SettableFuture;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/google/common/util/concurrent/SettableFuture;->set(Ljava/lang/Object;)Z

    iget-object v0, p0, Lfv6;->v:Lcom/google/common/util/concurrent/SettableFuture;

    sget-object v1, Lcom/google/ar/core/Config$GeospatialMode;->ENABLED:Lcom/google/ar/core/Config$GeospatialMode;

    invoke-virtual {p1, v1}, Lcom/google/ar/core/Session;->isGeospatialModeSupported(Lcom/google/ar/core/Config$GeospatialMode;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/common/util/concurrent/SettableFuture;->set(Ljava/lang/Object;)Z

    return-void
.end method

.method public final D(Ljava/lang/Throwable;)V
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "ar session failed: "

    invoke-static {p1, v1, v0}, Lg46;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lfv6;->u:Lcom/google/common/util/concurrent/SettableFuture;

    invoke-virtual {v0, p1}, Lcom/google/common/util/concurrent/SettableFuture;->setException(Ljava/lang/Throwable;)Z

    iget-object p1, p0, Lfv6;->v:Lcom/google/common/util/concurrent/SettableFuture;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcom/google/common/util/concurrent/SettableFuture;->set(Ljava/lang/Object;)Z

    iget-object p1, p0, Lfv6;->o:Ltm;

    sget-object v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS_V2:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v1, p0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireRide;->getBirdId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "device"

    invoke-interface {p1, v0, v1, v2, v3}, Ltm;->c(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final E(D)D
    .locals 5

    iget-object v0, p0, Lfv6;->E:Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getParkingConfig()Lco/bird/android/model/wire/configs/ParkingConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ParkingConfig;->getEnableHorizontalAccuracyLocation()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Double;->max(DD)D

    move-result-wide p1

    iget-object v0, p0, Lfv6;->E:Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getNestSearchAccuracyRadiusLimit()D

    move-result-wide v3

    invoke-static {p1, p2, v3, v4}, Ljava/lang/Double;->min(DD)D

    move-result-wide p1

    iget-object v0, p0, Lfv6;->E:Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getParkingConfig()Lco/bird/android/model/wire/configs/ParkingConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ParkingConfig;->getRiderNestAdditionalBufferMeters()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    :cond_1
    add-double/2addr p1, v1

    return-wide p1
.end method

.method public final F()V
    .locals 3

    iget-object v0, p0, Lfv6;->x:Lcom/google/common/util/concurrent/SettableFuture;

    invoke-virtual {v0}, Lcom/google/common/util/concurrent/SettableFuture;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/common/util/concurrent/SettableFuture;->create()Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object v0

    const-string v1, "create()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lfv6;->x:Lcom/google/common/util/concurrent/SettableFuture;

    :cond_0
    iget-object v0, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v0}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v0

    iget-object v1, p0, Lfv6;->i:Ldr4;

    invoke-interface {v1}, Ldr4;->p()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/Location;

    new-instance v2, Lfv6$c;

    invoke-direct {v2, p0}, Lfv6$c;-><init>(Lfv6;)V

    invoke-virtual {v0, v1, v2}, Lco/bird/android/feature/ar/view/VpsView;->N0(Landroid/location/Location;Lkotlin/jvm/functions/Function1;)Lcom/google/ar/core/VpsAvailabilityFuture;

    iget-object v0, p0, Lfv6;->v:Lcom/google/common/util/concurrent/SettableFuture;

    new-instance v1, Lev6;

    invoke-direct {v1, p0}, Lev6;-><init>(Lfv6;)V

    iget-object v2, p0, Lfv6;->b:Landroid/content/Context;

    invoke-static {v2}, LNA0;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/util/concurrent/SettableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final H()V
    .locals 3

    sget-object v0, Lee3;->a:Lee3;

    iget-object v0, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v0}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/feature/ar/view/VpsView;->R0()LZ84;

    move-result-object v0

    iget-object v1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/feature/ar/view/VpsView;->Q0()LZ84;

    move-result-object v1

    sget-object v2, Lfv6$d;->a:Lfv6$d;

    invoke-static {v0, v1, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "combineLatest(source1, s\u2026, t2: T2 -> (t1 to t2) })"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "Observables.combineLates\u2026bserveOn(Schedulers.io())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lfv6;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lfv6$e;

    invoke-direct {v1, p0}, Lfv6$e;-><init>(Lfv6;)V

    new-instance v2, LRu6;

    invoke-direct {v2, v1}, LRu6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final J()V
    .locals 3

    iget-object v0, p0, Lfv6;->B:La94;

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lfv6$f;

    invoke-direct {v1, p0}, Lfv6$f;-><init>(Lfv6;)V

    new-instance v2, LSu6;

    invoke-direct {v2, v1}, LSu6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object v0

    sget-object v1, Lfv6$g;->g:Lfv6$g;

    new-instance v2, LTu6;

    invoke-direct {v2, v1}, LTu6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v0

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Lio/reactivex/c;->U(J)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "private fun listenForLoc\u2026r)\n      .subscribe()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lfv6;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public final M()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "listenForNestAnchorLocationUpdates called"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lfv6;->K:La94;

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lfv6$h;->g:Lfv6$h;

    new-instance v2, Lcv6;

    invoke-direct {v2, v1}, Lcv6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "parkingStateRelay\n      \u2026.parkingNest?.location) }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lfv6;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    iget-object v2, p0, Lfv6;->R:La94;

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lfv6;->R:La94;

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "currentNestAnchorLocatio\u2026bserveOn(Schedulers.io())"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lfv6;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lfv6$i;

    invoke-direct {v1, p0}, Lfv6$i;-><init>(Lfv6;)V

    new-instance v2, Ldv6;

    invoke-direct {v2, v1}, Ldv6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final P()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "listenForNestAnchorUpdates called"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lfv6;->S:La94;

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lfv6$j;->g:Lfv6$j;

    new-instance v2, LUu6;

    invoke-direct {v2, v1}, LUu6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->switchMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "currentNestAnchorRelay\n \u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lfv6;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lfv6$k;

    invoke-direct {v1, p0}, Lfv6$k;-><init>(Lfv6;)V

    new-instance v2, LVu6;

    invoke-direct {v2, v1}, LVu6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final S()V
    .locals 3

    iget-object v0, p0, Lfv6;->H:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0}, Lfv6;->o0()V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lio/reactivex/p;->a0(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/p;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/p;->I(Lio/reactivex/E;)Lio/reactivex/p;

    move-result-object v0

    const-string v1, "timer(timeout, TimeUnit.\u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lfv6;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/p;->b(Lio/reactivex/q;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/MaybeSubscribeProxy;

    new-instance v1, Lfv6$l;

    invoke-direct {v1, p0}, Lfv6$l;-><init>(Lfv6;)V

    new-instance v2, LWu6;

    invoke-direct {v2, v1}, LWu6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/MaybeSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object v0

    iput-object v0, p0, Lfv6;->z:Lio/reactivex/disposables/c;

    :cond_0
    return-void
.end method

.method public final U(LSL4;)V
    .locals 9

    invoke-virtual {p1}, LSL4;->h()LTL4;

    move-result-object v0

    sget-object v1, LTL4;->c:LTL4;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lfv6;->i:Ldr4;

    new-instance v1, Landroid/location/Location;

    sget-object v2, LUw2;->d:LUw2;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, LSL4;->f()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    iget-wide v3, v3, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-virtual {v1, v3, v4}, Landroid/location/Location;->setLatitude(D)V

    invoke-virtual {p1}, LSL4;->f()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    iget-wide v3, v3, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-virtual {v1, v3, v4}, Landroid/location/Location;->setLongitude(D)V

    invoke-virtual {p1}, LSL4;->e()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-virtual {v1, v3}, Landroid/location/Location;->setAccuracy(F)V

    invoke-virtual {p1}, LSL4;->b()D

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Landroid/location/Location;->setAltitude(D)V

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1a

    if-lt v3, v4, :cond_0

    invoke-virtual {p1}, LSL4;->i()D

    move-result-wide v3

    double-to-float p1, v3

    invoke-static {v1, p1}, LQL4;->a(Landroid/location/Location;F)V

    :cond_0
    new-instance v4, LVw2;

    invoke-direct {v4, v1, v2}, LVw2;-><init>(Landroid/location/Location;LUw2;)V

    const/4 v5, 0x0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p1

    const/16 v1, 0x1e

    invoke-virtual {p1, v1}, Lorg/joda/time/DateTime;->plusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object v6

    const-string p1, "now().plusSeconds(VpsRes\u2026ATION_EXPIRATION_SECONDS)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    new-instance p1, Lr36;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lr36;-><init>(LVw2;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, p1}, Ldr4;->l(Lr36;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lfv6;->d0()V

    :goto_0
    return-void
.end method

.method public final V()V
    .locals 14

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "onBackPressed"

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lfv6;->d0()V

    iget-object v3, p0, Lfv6;->o:Ltm;

    sget-object v4, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS_V2:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v1, p0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v1

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, v2

    :goto_0
    iget-object v1, p0, Lfv6;->n:LoF3;

    invoke-interface {v1}, LoF3;->g()LbF0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LbF0;->e()Lco/bird/android/model/ParkingNest;

    move-result-object v1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, v2

    :goto_1
    iget-object v1, p0, Lfv6;->n:LoF3;

    invoke-interface {v1}, LoF3;->g()LbF0;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LbF0;->f()LmG3;

    move-result-object v2

    :cond_2
    sget-object v1, LmG3;->b:LmG3;

    if-ne v2, v1, :cond_3

    const/4 v0, 0x1

    :cond_3
    iget-wide v1, p0, Lfv6;->y:D

    iget-object v8, p0, Lfv6;->Q:La94;

    invoke-virtual {v8}, La94;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LSL4;

    invoke-virtual {v8}, LSL4;->e()D

    move-result-wide v8

    iget-object v10, p0, Lfv6;->Q:La94;

    invoke-virtual {v10}, La94;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LSL4;

    invoke-virtual {v10}, LSL4;->h()LTL4;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    iget-object v12, p0, Lfv6;->I:Ljava/lang/Boolean;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v10, "closed"

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    move-object v8, v0

    move-object v9, v10

    move-object v10, v1

    invoke-interface/range {v3 .. v13}, Ltm;->a(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/ParkingNest;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-void
.end method

.method public final W()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onCreateAfterMapReady called"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lfv6;->q:LcD1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LcD1;->n(Z)V

    return-void
.end method

.method public final X()V
    .locals 3

    iget-object v0, p0, Lfv6;->j:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    invoke-virtual {p0}, Lfv6;->z()Lio/github/sceneview/ar/node/ArModelNode;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/github/sceneview/node/Node;->y0(LQ83;)V

    iget-object v0, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v0}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lio/github/sceneview/SceneView;->setSelectedNode(Lio/github/sceneview/node/Node;)V

    iget-object v0, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v0}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lco/bird/android/feature/ar/view/VpsView;->setEnableAnalysis(Z)V

    iput-object v1, p0, Lfv6;->Z:Lorg/joda/time/DateTime;

    return-void
.end method

.method public final Y(LcD1;)V
    .locals 9

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array v0, p1, [Ljava/lang/Object;

    const-string v1, "onResume called"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v0}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v0

    invoke-virtual {v0}, Lio/github/sceneview/ar/ArSceneView;->s0()Lio/github/sceneview/ar/arcore/ArSession;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lfv6;->C(Lio/github/sceneview/ar/arcore/ArSession;)V

    :cond_0
    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {p0, v0}, Lfv6;->c0(Lorg/joda/time/DateTime;)V

    iget-object v1, p0, Lfv6;->o:Ltm;

    sget-object v2, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS_V2:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v0, p0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getBirdId()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lfv6;->n:LoF3;

    invoke-interface {v0}, LoF3;->g()LbF0;

    move-result-object v0

    const/4 v5, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LbF0;->e()Lco/bird/android/model/ParkingNest;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lco/bird/android/model/ParkingNest;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v5

    :goto_0
    iget-object v6, p0, Lfv6;->n:LoF3;

    invoke-interface {v6}, LoF3;->g()LbF0;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, LbF0;->f()LmG3;

    move-result-object v5

    :cond_2
    sget-object v6, LmG3;->b:LmG3;

    if-ne v5, v6, :cond_3

    const/4 p1, 0x1

    :cond_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget-object v7, p0, Lfv6;->Z:Lorg/joda/time/DateTime;

    iget-object v8, p0, Lfv6;->I:Ljava/lang/Boolean;

    move-object v5, v0

    invoke-interface/range {v1 .. v8}, Ltm;->h(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)V

    invoke-virtual {p0}, Lfv6;->J()V

    invoke-virtual {p0}, Lfv6;->H()V

    invoke-virtual {p0}, Lfv6;->M()V

    invoke-virtual {p0}, Lfv6;->P()V

    invoke-virtual {p0}, Lfv6;->F()V

    invoke-virtual {p0}, Lfv6;->A()LZ84;

    move-result-object p1

    sget-object v0, Lfv6$n;->g:Lfv6$n;

    new-instance v1, LZu6;

    invoke-direct {v1, v0}, LZu6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "scanModePropertyObservab\u2026dSchedulers.mainThread())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfv6;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lfv6$o;

    invoke-direct {v1, p0}, Lfv6$o;-><init>(Lfv6;)V

    new-instance v2, Lav6;

    invoke-direct {v2, v1}, Lav6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object p1, p0, Lfv6;->W:La94;

    invoke-virtual {p1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v1, "scanModeStateRelay\n     \u2026dSchedulers.mainThread())"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lfv6;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Lfv6$p;

    invoke-direct {v0, p0}, Lfv6$p;-><init>(Lfv6;)V

    new-instance v1, Lbv6;

    invoke-direct {v1, v0}, Lbv6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-virtual {p0}, Lfv6;->z()Lio/github/sceneview/ar/node/ArModelNode;

    move-result-object p1

    iget-object v0, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v0}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/github/sceneview/node/Node;->y0(LQ83;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onArSessionFailed called: "

    invoke-static {p1, v1, v0}, Lg46;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p0, p1}, Liw6$a;->d(Liw6;Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lfv6;->D(Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(Lcom/google/ar/core/HitResult;Landroid/view/MotionEvent;)V
    .locals 0

    invoke-static {p0, p1, p2}, Liw6$a;->g(Liw6;Lcom/google/ar/core/HitResult;Landroid/view/MotionEvent;)V

    return-void
.end method

.method public c(Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 0

    invoke-static {p0, p1}, Liw6$a;->e(Liw6;Lio/github/sceneview/ar/arcore/ArSession;)V

    return-void
.end method

.method public final c0(Lorg/joda/time/DateTime;)V
    .locals 1

    iput-object p1, p0, Lfv6;->Z:Lorg/joda/time/DateTime;

    invoke-virtual {p0}, Lfv6;->q0()V

    iget-object p1, p0, Lfv6;->Q:La94;

    invoke-virtual {p1}, La94;->j()V

    iget-object p1, p0, Lfv6;->J:La94;

    invoke-virtual {p1}, La94;->j()V

    iget-object p1, p0, Lfv6;->K:La94;

    invoke-virtual {p1}, La94;->j()V

    iget-object p1, p0, Lfv6;->P:La94;

    invoke-virtual {p1}, La94;->j()V

    invoke-virtual {p0}, Lfv6;->S()V

    invoke-virtual {p0}, Lfv6;->z()Lio/github/sceneview/ar/node/ArModelNode;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lio/github/sceneview/node/Node;->y0(LQ83;)V

    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object p1

    invoke-virtual {p1, v0}, Lio/github/sceneview/SceneView;->setSelectedNode(Lio/github/sceneview/node/Node;)V

    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lco/bird/android/feature/ar/view/VpsView;->setEnableAnalysis(Z)V

    return-void
.end method

.method public final d0()V
    .locals 1

    iget-object v0, p0, Lfv6;->i:Ldr4;

    invoke-interface {v0}, Ldr4;->a()V

    return-void
.end method

.method public final e0(LSL4;LFH3;Lco/bird/android/buava/Optional;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSL4;",
            "LFH3;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "\nResolved Location:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, LSL4;->k()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, "\nParking Status:\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string p1, "\nParking Verification Config:\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object p1, p0, Lfv6;->F:Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string p1, "\nseconds since startScanningTime: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object p1, p0, Lfv6;->Z:Lorg/joda/time/DateTime;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, LpT0;->h(Lorg/joda/time/DateTime;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string p1, "\nfocus mode: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object p1

    invoke-virtual {p1}, Lio/github/sceneview/ar/ArSceneView;->s0()Lio/github/sceneview/ar/arcore/ArSession;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/google/ar/core/Config;->getFocusMode()Lcom/google/ar/core/Config$FocusMode;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, p2

    :goto_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {p3}, Lco/bird/android/buava/Optional;->c()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "\nbarcodes: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p3}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p3, p0, Lfv6;->E:Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p3}, Lco/bird/android/model/wire/configs/Config;->getEnableLocationDebugInfoOnMapScreen()Z

    move-result p3

    if-eqz p3, :cond_3

    move-object p2, p1

    :cond_3
    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1, p2}, Lrv6;->Wl(Ljava/lang/String;)V

    return-void
.end method

.method public g(LPy1;)V
    .locals 0

    invoke-static {p0, p1}, Liw6$a;->f(Liw6;LPy1;)V

    return-void
.end method

.method public final g0(LSL4;LbF0;Z)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lfv6;->o:Ltm;

    sget-object v2, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS_V2:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v3, v0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual/range {p2 .. p2}, LbF0;->e()Lco/bird/android/model/ParkingNest;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, v5

    :goto_1
    if-eqz p2, :cond_2

    invoke-virtual/range {p2 .. p2}, LbF0;->f()LmG3;

    move-result-object v5

    :cond_2
    sget-object v7, LmG3;->b:LmG3;

    if-ne v5, v7, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    iget-wide v7, v0, Lfv6;->y:D

    iget-object v9, v0, Lfv6;->Q:La94;

    invoke-virtual {v9}, La94;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LSL4;

    invoke-virtual {v9}, LSL4;->e()D

    move-result-wide v9

    iget-object v11, v0, Lfv6;->Q:La94;

    invoke-virtual {v11}, La94;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LSL4;

    invoke-virtual {v11}, LSL4;->h()LTL4;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    iget-object v12, v0, Lfv6;->I:Ljava/lang/Boolean;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    const/4 v14, 0x0

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    const/16 v15, 0x20

    const/16 v16, 0x0

    move-object v5, v6

    move-object v6, v13

    move-object v7, v14

    move-object v10, v12

    move v12, v15

    move-object/from16 v13, v16

    invoke-static/range {v1 .. v13}, Ltm$a;->trackResolutionResult$default(Ltm;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/ParkingNest;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/Object;)V

    if-eqz p3, :cond_4

    const-wide/16 v1, 0x3e8

    goto :goto_3

    :cond_4
    const-wide/16 v1, 0xc8

    :goto_3
    invoke-virtual/range {p0 .. p1}, Lfv6;->U(LSL4;)V

    iget-object v3, v0, Lfv6;->c:Landroid/os/Handler;

    new-instance v4, LXu6;

    invoke-direct {v4, v0}, LXu6;-><init>(Lfv6;)V

    invoke-virtual {v3, v4, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public i(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V
    .locals 2

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Liw6$a;->b(Liw6;Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V

    iget-object p2, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p2}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lio/github/sceneview/ar/ArSceneView;->setInstantPlacementEnabled(Z)V

    sget-object p2, Lcom/google/ar/core/Config$DepthMode;->AUTOMATIC:Lcom/google/ar/core/Config$DepthMode;

    invoke-virtual {p1, p2}, Lcom/google/ar/core/Session;->isDepthModeSupported(Lcom/google/ar/core/Config$DepthMode;)Z

    move-result p2

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    const-string p1, "updating depth mode based off automatic support"

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object p1

    invoke-virtual {p1, v1}, Lio/github/sceneview/ar/ArSceneView;->setDepthOcclusionEnabled(Z)V

    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object p1

    invoke-virtual {p1, v1}, Lio/github/sceneview/ar/ArSceneView;->setDepthEnabled(Z)V

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/google/ar/core/Config$DepthMode;->RAW_DEPTH_ONLY:Lcom/google/ar/core/Config$DepthMode;

    invoke-virtual {p1, p2}, Lcom/google/ar/core/Session;->isDepthModeSupported(Lcom/google/ar/core/Config$DepthMode;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "updating depth mode based off raw depth only support"

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object p1

    invoke-virtual {p1, v1}, Lio/github/sceneview/ar/ArSceneView;->setDepthOcclusionEnabled(Z)V

    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object p1

    invoke-virtual {p1, v1}, Lio/github/sceneview/ar/ArSceneView;->setDepthEnabled(Z)V

    goto :goto_0

    :cond_1
    const-string p1, "updating depth mode based off no support"

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object p1

    invoke-virtual {p1, v0}, Lio/github/sceneview/ar/ArSceneView;->setDepthOcclusionEnabled(Z)V

    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object p1

    invoke-virtual {p1, v0}, Lio/github/sceneview/ar/ArSceneView;->setDepthEnabled(Z)V

    :goto_0
    return-void
.end method

.method public final j0(Z)V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "showParkingMode called"

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfv6;->K:La94;

    invoke-virtual {v1}, La94;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFH3;

    invoke-virtual {v1}, LFH3;->c()LbF0;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LbF0;->e()Lco/bird/android/model/ParkingNest;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setting parking mode with current parking nest = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v1}, Lrv6;->Vl()V

    iget-object v1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v1}, Lrv6;->Xl()V

    iget-object v1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v1}, Lrv6;->Pl()Landroid/widget/ImageView;

    move-result-object v1

    invoke-static {v1}, Ltu6;->l(Landroid/view/View;)V

    if-eqz p1, :cond_1

    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lco/bird/android/feature/ar/view/VpsView;->setEnableAnalysis(Z)V

    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Rl()Landroid/widget/ImageView;

    move-result-object p1

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object p1

    invoke-virtual {p1, v0}, Lco/bird/android/feature/ar/view/VpsView;->setEnableAnalysis(Z)V

    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Rl()Landroid/widget/ImageView;

    move-result-object p1

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    :goto_1
    return-void
.end method

.method public final k0()V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "showScanSurroundingsUi called"

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v1}, Lrv6;->Ul()V

    iget-object v1, p0, Lfv6;->e:Lrv6;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v0, v2, v3}, Lrv6;->showScanSurroundingBottomSheet$default(Lrv6;IILjava/lang/Object;)V

    iget-object v1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lco/bird/android/feature/ar/view/VpsView;->setEnableAnalysis(Z)V

    iget-object v0, p0, Lfv6;->u:Lcom/google/common/util/concurrent/SettableFuture;

    new-instance v1, LYu6;

    invoke-direct {v1, p0}, LYu6;-><init>(Lfv6;)V

    iget-object v2, p0, Lfv6;->b:Landroid/content/Context;

    invoke-static {v2}, LNA0;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/util/concurrent/SettableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v0}, Lrv6;->Pl()Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, Lfv6;->e:Lrv6;

    invoke-virtual {v0}, Lrv6;->Rl()Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    return-void
.end method

.method public m(Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 2

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onArSessionCreated called session="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p0, p1}, Liw6$a;->c(Liw6;Lio/github/sceneview/ar/arcore/ArSession;)V

    invoke-virtual {p0, p1}, Lfv6;->C(Lio/github/sceneview/ar/arcore/ArSession;)V

    return-void
.end method

.method public final m0()V
    .locals 4

    iget-object v0, p0, Lfv6;->J:La94;

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Lnl4;->scan_surroundings_timeout_description:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lfv6;->K:La94;

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFH3;

    invoke-virtual {v0}, LFH3;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lnl4;->bird_scan_timeout_description:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lfv6;->e:Lrv6;

    new-instance v2, LUH3;

    iget-boolean v3, p0, Lfv6;->G:Z

    invoke-direct {v2, v3, v0}, LUH3;-><init>(ZLjava/lang/Integer;)V

    const/4 v0, 0x0

    invoke-virtual {v1, v2, v0, v0}, LXC;->birdDialog(LNy;ZZ)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "ui.birdDialog(\n      ale\u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lfv6;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v1, Lfv6$r;

    invoke-direct {v1, p0}, Lfv6$r;-><init>(Lfv6;)V

    new-instance v2, LQu6;

    invoke-direct {v2, v1}, LQu6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final o0()V
    .locals 1

    iget-object v0, p0, Lfv6;->z:Lio/reactivex/disposables/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lfv6;->z:Lio/reactivex/disposables/c;

    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lfv6;->D:Lma4;

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final p0(LSL4;)V
    .locals 7

    invoke-virtual {p1}, LSL4;->f()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-virtual {p1}, LSL4;->e()D

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Lfv6;->E(D)D

    move-result-wide v1

    invoke-virtual {p1}, LSL4;->d()Ljava/lang/Double;

    move-result-object v3

    iget-object v4, p0, Lfv6;->q:LcD1;

    invoke-virtual {v4}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/maps/model/CameraPosition;->u(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/model/CameraPosition$a;

    move-result-object v4

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    double-to-float p1, v5

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LSL4;->c()Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v4, p1}, Lcom/google/android/gms/maps/model/CameraPosition$a;->a(F)Lcom/google/android/gms/maps/model/CameraPosition$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/CameraPosition$a;->c(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CameraPosition$a;

    move-result-object p1

    const/high16 v3, 0x42700000    # 60.0f

    invoke-virtual {p1, v3}, Lcom/google/android/gms/maps/model/CameraPosition$a;->d(F)Lcom/google/android/gms/maps/model/CameraPosition$a;

    move-result-object p1

    const/high16 v3, 0x41a00000    # 20.0f

    invoke-virtual {p1, v3}, Lcom/google/android/gms/maps/model/CameraPosition$a;->e(F)Lcom/google/android/gms/maps/model/CameraPosition$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/CameraPosition$a;->b()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object p1

    const-string v3, "builder(googleMap.camera\u2026OOM_LEVEL)\n      .build()"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lfv6;->q:LcD1;

    invoke-static {p1}, Lrc0;->a(Lcom/google/android/gms/maps/model/CameraPosition;)Lqc0;

    move-result-object p1

    invoke-virtual {v3, p1}, LcD1;->m(Lqc0;)V

    iget-object p1, p0, Lfv6;->q:LcD1;

    invoke-virtual {p0, p1, v0, v1, v2}, Lfv6;->r0(LcD1;Lcom/google/android/gms/maps/model/LatLng;D)V

    return-void
.end method

.method public final q0()V
    .locals 7

    iget-object v0, p0, Lfv6;->i:Ldr4;

    invoke-interface {v0}, Ldr4;->p()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    iget-object v1, p0, Lfv6;->p:Lbn;

    invoke-interface {v1}, Lbn;->r()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/16 v2, 0x14

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lio;->g(Ljava/util/List;Landroid/location/Location;Ljava/lang/Integer;)Ljava/util/List;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/Area;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "updateMapAreas called with areasToRender="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v2, v5}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lfv6;->s:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-virtual {v2, v1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->setPolygonables(Ljava/util/List;)V

    iget-object v1, p0, Lfv6;->p:Lbn;

    invoke-interface {v1}, Lbn;->V()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/16 v2, 0x28

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v0, v2}, LoG3;->a(Ljava/util/List;Landroid/location/Location;Ljava/lang/Integer;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/ParkingNest;

    new-instance v5, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;

    const/4 v6, 0x1

    invoke-direct {v5, v2, v6}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;-><init>(Lco/bird/android/model/ParkingNest;Z)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;

    invoke-virtual {v4}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;->getParkingNest()Lco/bird/android/model/ParkingNest;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/ParkingNest;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "updateMapAreas called with nestsToRender="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lfv6;->t:Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;

    invoke-virtual {v0, v1}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->render(Ljava/util/List;)V

    return-void
.end method

.method public r(Lrm;)V
    .locals 0

    invoke-static {p0, p1}, Liw6$a;->a(Liw6;Lrm;)V

    return-void
.end method

.method public final r0(LcD1;Lcom/google/android/gms/maps/model/LatLng;D)V
    .locals 7

    iget-object v0, p0, Lfv6;->X:LfM2;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v0, p2}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    iget-object v1, p0, Lfv6;->b:Landroid/content/Context;

    sget v2, Lrg4;->ic_user_location_v2:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LfB0;->icon$default(Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LPT;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->y1(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    iget-object v1, p0, Lfv6;->b:Landroid/content/Context;

    sget v2, Lnl4;->map_my_location:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->L1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->Y1(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->E(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {p1, v0}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object v0

    iput-object v0, p0, Lfv6;->X:LfM2;

    new-instance v0, Lcom/google/android/gms/maps/model/CircleOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/CircleOptions;-><init>()V

    invoke-virtual {v0, p2}, Lcom/google/android/gms/maps/model/CircleOptions;->s(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object p2

    invoke-virtual {p2, p3, p4}, Lcom/google/android/gms/maps/model/CircleOptions;->m0(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object p2

    iget-object p3, p0, Lfv6;->b:Landroid/content/Context;

    sget p4, LDf4;->birdBlue20:I

    invoke-virtual {p3, p4}, Landroid/content/Context;->getColor(I)I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/maps/model/CircleOptions;->u(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object p2

    iget-object p3, p0, Lfv6;->b:Landroid/content/Context;

    invoke-virtual {p3, p4}, Landroid/content/Context;->getColor(I)I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/maps/model/CircleOptions;->p0(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/google/android/gms/maps/model/CircleOptions;->E0(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object p2

    invoke-virtual {p1, p2}, LcD1;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lxj0;

    move-result-object p1

    iput-object p1, p0, Lfv6;->Y:Lxj0;

    goto :goto_2

    :cond_0
    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p2}, LfM2;->m(Lcom/google/android/gms/maps/model/LatLng;)V

    :goto_0
    iget-object p1, p0, Lfv6;->Y:Lxj0;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1, p2}, Lxj0;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    :goto_1
    iget-object p1, p0, Lfv6;->Y:Lxj0;

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1, p3, p4}, Lxj0;->b(D)V

    :goto_2
    return-void
.end method

.method public final s0(LFH3;)V
    .locals 9

    invoke-virtual {p1}, LFH3;->e()Lco/bird/android/model/RiderAreaState;

    move-result-object v0

    iget-object v1, p0, Lfv6;->K:La94;

    invoke-virtual {v1}, La94;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFH3;

    invoke-virtual {v1}, LFH3;->e()Lco/bird/android/model/RiderAreaState;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateParkingStatusProperties with parkingStatus: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lfv6;->r:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getUserGuestId()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v4, v0, v1}, LPy;->e(LFH3;ZLjava/lang/Boolean;Z)LQM4;

    move-result-object v0

    if-nez v0, :cond_8

    instance-of v0, p1, LKc0;

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    move-object v5, p1

    check-cast v5, LKc0;

    goto :goto_1

    :cond_2
    move-object v5, v3

    :goto_1
    if-eqz v5, :cond_3

    invoke-virtual {v5}, LKc0;->g()Z

    move-result v5

    if-ne v5, v2, :cond_3

    move v5, v2

    goto :goto_2

    :cond_3
    move v5, v1

    :goto_2
    const/4 v6, 0x2

    if-eqz v5, :cond_4

    new-instance v0, Lco/bird/android/core/base/viewmodel/b;

    invoke-direct {v0, v4, v1, v6, v3}, Lco/bird/android/core/base/viewmodel/b;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_4
    if-eqz v0, :cond_5

    check-cast p1, LKc0;

    goto :goto_3

    :cond_5
    move-object p1, v3

    :goto_3
    if-eqz p1, :cond_6

    invoke-virtual {p1}, LKc0;->b()Z

    move-result p1

    if-ne p1, v2, :cond_6

    goto :goto_4

    :cond_6
    move v2, v1

    :goto_4
    if-eqz v2, :cond_7

    new-instance v0, Lco/bird/android/core/base/viewmodel/a;

    invoke-direct {v0, v4, v1, v6, v3}, Lco/bird/android/core/base/viewmodel/a;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_7
    new-instance v0, LlA3;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, LlA3;-><init>(ZLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_8
    :goto_5
    iget-object p1, p0, Lfv6;->e:Lrv6;

    invoke-virtual {p1}, Lrv6;->Ql()Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;->j()Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;->g()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, LQM4;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p1}, Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;->e()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, LNy;->message(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;->f()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v0}, LQM4;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0}, LQM4;->c()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/content/Context;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;->setColor(I)V

    return-void
.end method

.method public final t0(D)Lkotlin/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lfv6;->x()Lkotlin/Pair;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    cmpg-double p1, p1, v0

    if-gtz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final w()Z
    .locals 2

    iget-boolean v0, p0, Lfv6;->A:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lfv6;->A:Z

    return v0
.end method

.method public final x()Lkotlin/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfv6;->Z:Lorg/joda/time/DateTime;

    new-instance v1, Lfv6$b;

    invoke-direct {v1, v0}, Lfv6$b;-><init>(Lorg/joda/time/DateTime;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v1}, Lfv6;->y(Lkotlin/Lazy;)D

    move-result-wide v3

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    cmpg-double v0, v3, v5

    if-gez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lfv6;->y(Lkotlin/Lazy;)D

    move-result-wide v0

    const/4 v2, 0x2

    int-to-double v2, v2

    sub-double/2addr v0, v2

    iget-object v2, p0, Lfv6;->F:Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->getRequiredHorizontalAccuracyMeters()D

    move-result-wide v2

    iget-object v4, p0, Lfv6;->F:Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->getHorizontalAccuracyAllowanceMetersPerSecond()Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    mul-double/2addr v4, v0

    goto :goto_0

    :cond_2
    const-wide/16 v4, 0x0

    :goto_0
    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    :goto_1
    return-object v2
.end method

.method public final z()Lio/github/sceneview/ar/node/ArModelNode;
    .locals 1

    iget-object v0, p0, Lfv6;->T:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/sceneview/ar/node/ArModelNode;

    return-object v0
.end method
