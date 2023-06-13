.class public final Lco/bird/android/model/persistence/Bird;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\u0008\u00a7\u0001\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00c9\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0010\u0012\u0006\u0010\"\u001a\u00020\u0010\u0012\u0006\u0010#\u001a\u00020$\u0012\u0008\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010&\u001a\u00020\'\u0012\u0008\u0010(\u001a\u0004\u0018\u00010)\u0012\u0008\u0010*\u001a\u0004\u0018\u00010)\u0012\u0008\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010,\u001a\u00020\u0010\u0012\u0006\u0010-\u001a\u00020\u0010\u0012\u0008\u0010.\u001a\u0004\u0018\u00010)\u0012\u0008\u0010/\u001a\u0004\u0018\u00010)\u0012\u0006\u00100\u001a\u00020\u0010\u0012\u0008\u00101\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u00102\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u00103\u001a\u0004\u0018\u000104\u0012\u000e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u001c\u0012\u0006\u00106\u001a\u00020\u0010\u0012\u0006\u00107\u001a\u00020\u0010\u0012\u0006\u00108\u001a\u00020\u0010\u0012\u0008\u00109\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010;\u001a\u0004\u0018\u00010)\u0012\u0008\u0010<\u001a\u0004\u0018\u00010=\u0012\u0006\u0010>\u001a\u00020\u0010\u0012\u0006\u0010?\u001a\u00020\u0010\u0012\u0006\u0010@\u001a\u00020A\u0012\u0006\u0010B\u001a\u00020\u0010\u0012\u0008\u0010C\u001a\u0004\u0018\u00010D\u0012\u0008\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010F\u001a\u0004\u0018\u00010G\u0012\u0008\u0010H\u001a\u0004\u0018\u00010I\u0012\u0008\u0010J\u001a\u0004\u0018\u00010)\u0012\u0006\u0010K\u001a\u00020L\u0012\u000c\u0010M\u001a\u0008\u0012\u0004\u0012\u00020N0\u001c\u0012\u0008\u0010O\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010Q\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010R\u001a\u0004\u0018\u00010)\u00a2\u0006\u0002\u0010SJ\n\u0010\u00b0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b1\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b2\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00b3\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00b4\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00b5\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00b9\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00ba\u0001\u001a\u00020\u0010H\u00c6\u0003J\u000c\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00bc\u0001\u001a\u00020\u001aH\u00c6\u0003J\u0010\u0010\u00bd\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cH\u00c6\u0003J\u000c\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010iJ\n\u0010\u00c0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c1\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00c2\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00c3\u0001\u001a\u00020$H\u00c6\u0003J\u000c\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00c5\u0001\u001a\u00020\'H\u00c6\u0003J\u000c\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00c7\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\u000c\u0010\u00c8\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\u000c\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00ca\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00cb\u0001\u001a\u00020\u0010H\u00c6\u0003J\u000c\u0010\u00cc\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\u000c\u0010\u00cd\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\n\u0010\u00ce\u0001\u001a\u00020\u0010H\u00c6\u0003J\u000c\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00d1\u0001\u001a\u00020\u0007H\u00c6\u0003J\u000c\u0010\u00d2\u0001\u001a\u0004\u0018\u000104H\u00c6\u0003J\u0012\u0010\u00d3\u0001\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u001cH\u00c6\u0003J\n\u0010\u00d4\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00d5\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00d6\u0001\u001a\u00020\u0010H\u00c6\u0003J\u000c\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00d9\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\u000c\u0010\u00da\u0001\u001a\u0004\u0018\u00010=H\u00c6\u0003J\n\u0010\u00db\u0001\u001a\u00020\u0010H\u00c6\u0003J\u0011\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010iJ\n\u0010\u00dd\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00de\u0001\u001a\u00020AH\u00c6\u0003J\n\u0010\u00df\u0001\u001a\u00020\u0010H\u00c6\u0003J\u000c\u0010\u00e0\u0001\u001a\u0004\u0018\u00010DH\u00c6\u0003J\u000c\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00e2\u0001\u001a\u0004\u0018\u00010GH\u00c6\u0003J\u000c\u0010\u00e3\u0001\u001a\u0004\u0018\u00010IH\u00c6\u0003J\u000c\u0010\u00e4\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\n\u0010\u00e5\u0001\u001a\u00020LH\u00c6\u0003J\u0010\u0010\u00e6\u0001\u001a\u0008\u0012\u0004\u0012\u00020N0\u001cH\u00c6\u0003J\n\u0010\u00e7\u0001\u001a\u00020\u0007H\u00c6\u0003J\u000c\u0010\u00e8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00e9\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00ea\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010}J\u000c\u0010\u00eb\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\n\u0010\u00ec\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u00ed\u0001\u001a\u00020\u0003H\u00c6\u0003J\u000c\u0010\u00ee\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00d2\u0005\u0010\u00ef\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a2\u000e\u0008\u0002\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010 \u001a\u00020\u00032\u0008\u0008\u0002\u0010!\u001a\u00020\u00102\u0008\u0008\u0002\u0010\"\u001a\u00020\u00102\u0008\u0008\u0002\u0010#\u001a\u00020$2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010&\u001a\u00020\'2\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010,\u001a\u00020\u00102\u0008\u0008\u0002\u0010-\u001a\u00020\u00102\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010)2\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010)2\u0008\u0008\u0002\u00100\u001a\u00020\u00102\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00103\u001a\u0004\u0018\u0001042\u0010\u0008\u0002\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u001c2\u0008\u0008\u0002\u00106\u001a\u00020\u00102\u0008\u0008\u0002\u00107\u001a\u00020\u00102\u0008\u0008\u0002\u00108\u001a\u00020\u00102\n\u0008\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010;\u001a\u0004\u0018\u00010)2\n\u0008\u0002\u0010<\u001a\u0004\u0018\u00010=2\u0008\u0008\u0002\u0010>\u001a\u00020\u00102\u0008\u0008\u0002\u0010?\u001a\u00020\u00102\u0008\u0008\u0002\u0010@\u001a\u00020A2\u0008\u0008\u0002\u0010B\u001a\u00020\u00102\n\u0008\u0002\u0010C\u001a\u0004\u0018\u00010D2\n\u0008\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\u0008\u0002\u0010H\u001a\u0004\u0018\u00010I2\n\u0008\u0002\u0010J\u001a\u0004\u0018\u00010)2\u0008\u0008\u0002\u0010K\u001a\u00020L2\u000e\u0008\u0002\u0010M\u001a\u0008\u0012\u0004\u0012\u00020N0\u001c2\n\u0008\u0002\u0010O\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010P\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010Q\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010R\u001a\u0004\u0018\u00010)H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00f0\u0001J\u0015\u0010\u00f1\u0001\u001a\u00020\u00102\t\u0010\u00f2\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00f3\u0001\u001a\u00020\u0007H\u00d6\u0001J\n\u0010\u00f4\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008T\u0010UR\u001c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008V\u0010WR\u0018\u0010E\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008X\u0010YR\u0016\u00100\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Z\u0010UR\u0016\u0010K\u001a\u00020L8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008[\u0010\\R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008]\u0010^R\u0018\u0010P\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008_\u0010YR\u0016\u0010,\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008`\u0010UR\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008a\u0010YR\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008b\u0010YR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008c\u0010YR\u0016\u0010#\u001a\u00020$8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008d\u0010eR\u0016\u0010!\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008f\u0010UR\u0016\u0010\"\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008g\u0010UR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010j\u001a\u0004\u0008h\u0010iR\u001c\u0010M\u001a\u0008\u0012\u0004\u0012\u00020N0\u001c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008k\u0010WR\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008l\u0010YR\u0016\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008m\u0010UR\u0016\u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008n\u0010UR\u0016\u0010-\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008o\u0010UR\u0016\u0010\u000c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008p\u0010YR\u0016\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008q\u0010UR\u0016\u0010?\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008r\u0010UR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008s\u0010UR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008t\u0010^R\u0016\u00107\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008u\u0010UR\u0018\u0010/\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008v\u0010wR\u0018\u0010O\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008x\u0010YR\u001a\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010j\u001a\u0004\u0008y\u0010iR\u0018\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008z\u0010wR\u0016\u0010\u0017\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008{\u0010UR\u001a\u0010Q\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010~\u001a\u0004\u0008|\u0010}R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u007f\u0010YR\u0019\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0080\u0001\u0010YR\"\u0010\u0081\u0001\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0011\n\u0000\u001a\u0005\u0008\u0081\u0001\u0010U\"\u0006\u0008\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0084\u0001\u0010\u0085\u0001R\u0019\u0010;\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0086\u0001\u0010wR\u001a\u0010C\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0087\u0001\u0010\u0088\u0001R\u0018\u0010@\u001a\u00020A8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0089\u0001\u0010\u008a\u0001R&\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0013\n\u0002\u0010~\u001a\u0005\u0008\u008c\u0001\u0010}\"\u0006\u0008\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u008f\u0001\u0010\u0090\u0001R\u0019\u0010R\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0091\u0001\u0010wR\u0017\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0092\u0001\u0010UR\u0017\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0093\u0001\u0010UR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0094\u0001\u0010YR\u0017\u00108\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0095\u0001\u0010UR\u0019\u0010:\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0096\u0001\u0010YR\u001a\u0010F\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0097\u0001\u0010\u0098\u0001R\u0017\u0010B\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0099\u0001\u0010UR\u001a\u0010<\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001R\u0019\u00109\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u009c\u0001\u0010YR\u0017\u0010>\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u009d\u0001\u0010UR\"\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0000\u0012\u0006\u0008\u009e\u0001\u0010\u009f\u0001\u001a\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R\u001f\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u001c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a2\u0001\u0010WR\u0017\u00106\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a3\u0001\u0010UR\u001a\u0010H\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001R\u0019\u0010J\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a6\u0001\u0010wR\u0017\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a7\u0001\u0010YR\u0019\u0010.\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a8\u0001\u0010wR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a9\u0001\u0010YR\u0017\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00aa\u0001\u0010UR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ab\u0001\u0010YR\u0018\u0010&\u001a\u00020\'8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001R\u0019\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ae\u0001\u0010YR\u0019\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00af\u0001\u0010w\u00a8\u0006\u00f5\u0001"
    }
    d2 = {
        "Lco/bird/android/model/persistence/Bird;",
        "",
        "id",
        "",
        "model",
        "taskId",
        "batteryLevel",
        "",
        "estimatedRange",
        "distance",
        "location",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "code",
        "stickerId",
        "serialNumber",
        "disconnected",
        "",
        "collect",
        "submerged",
        "lost",
        "locked",
        "ackLocked",
        "captive",
        "gpsFix",
        "broken",
        "label",
        "Lco/bird/android/model/persistence/nestedstructures/BirdLabel;",
        "actions",
        "",
        "Lco/bird/android/model/constant/BirdAction;",
        "bountyId",
        "bountyPrice",
        "bountyCurrency",
        "bountyLost",
        "bountyOverdue",
        "bountyKind",
        "Lco/bird/android/model/constant/BountyKind;",
        "brandName",
        "taskKind",
        "Lco/bird/android/model/constant/BirdTaskKind;",
        "gpsAt",
        "Lorg/joda/time/DateTime;",
        "trackedAt",
        "token",
        "bluetooth",
        "cellular",
        "startedAt",
        "dueAt",
        "asleep",
        "imei",
        "boardProtocol",
        "physicalLock",
        "Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;",
        "physicalLocks",
        "priorityCollect",
        "down",
        "needsInspection",
        "partnerId",
        "nestId",
        "lastRideEndedAt",
        "partnerBirdState",
        "Lco/bird/android/model/constant/PartnerBirdState;",
        "peril",
        "deliverable",
        "lifecycle",
        "Lco/bird/android/model/persistence/nestedstructures/Lifecycle;",
        "offline",
        "license",
        "Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;",
        "areaKey",
        "nestPurpose",
        "Lco/bird/android/model/constant/NestPurpose;",
        "privateBird",
        "Lco/bird/android/model/persistence/nestedstructures/PrivateBird;",
        "scannedAt",
        "badgeType",
        "Lco/bird/android/model/constant/MapPinBadge;",
        "bountyReasons",
        "Lco/bird/android/model/persistence/nestedstructures/BountyReason;",
        "ephemeralId",
        "bleMacAddress",
        "hasHelmet",
        "locationUpdatedAt",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V",
        "getAckLocked",
        "()Z",
        "getActions",
        "()Ljava/util/List;",
        "getAreaKey",
        "()Ljava/lang/String;",
        "getAsleep",
        "getBadgeType",
        "()Lco/bird/android/model/constant/MapPinBadge;",
        "getBatteryLevel",
        "()I",
        "getBleMacAddress",
        "getBluetooth",
        "getBoardProtocol",
        "getBountyCurrency",
        "getBountyId",
        "getBountyKind",
        "()Lco/bird/android/model/constant/BountyKind;",
        "getBountyLost",
        "getBountyOverdue",
        "getBountyPrice",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getBountyReasons",
        "getBrandName",
        "getBroken",
        "getCaptive",
        "getCellular",
        "getCode",
        "getCollect",
        "getDeliverable",
        "getDisconnected",
        "getDistance",
        "getDown",
        "getDueAt",
        "()Lorg/joda/time/DateTime;",
        "getEphemeralId",
        "getEstimatedRange",
        "getGpsAt",
        "getGpsFix",
        "getHasHelmet",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getId",
        "getImei",
        "isScanlessRideEligible",
        "setScanlessRideEligible",
        "(Z)V",
        "getLabel",
        "()Lco/bird/android/model/persistence/nestedstructures/BirdLabel;",
        "getLastRideEndedAt",
        "getLicense",
        "()Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;",
        "getLifecycle",
        "()Lco/bird/android/model/persistence/nestedstructures/Lifecycle;",
        "lightOn",
        "getLightOn",
        "setLightOn",
        "(Ljava/lang/Boolean;)V",
        "getLocation",
        "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "getLocationUpdatedAt",
        "getLocked",
        "getLost",
        "getModel",
        "getNeedsInspection",
        "getNestId",
        "getNestPurpose",
        "()Lco/bird/android/model/constant/NestPurpose;",
        "getOffline",
        "getPartnerBirdState",
        "()Lco/bird/android/model/constant/PartnerBirdState;",
        "getPartnerId",
        "getPeril",
        "getPhysicalLock$annotations",
        "()V",
        "getPhysicalLock",
        "()Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;",
        "getPhysicalLocks",
        "getPriorityCollect",
        "getPrivateBird",
        "()Lco/bird/android/model/persistence/nestedstructures/PrivateBird;",
        "getScannedAt",
        "getSerialNumber",
        "getStartedAt",
        "getStickerId",
        "getSubmerged",
        "getTaskId",
        "getTaskKind",
        "()Lco/bird/android/model/constant/BirdTaskKind;",
        "getToken",
        "getTrackedAt",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component2",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "component29",
        "component3",
        "component30",
        "component31",
        "component32",
        "component33",
        "component34",
        "component35",
        "component36",
        "component37",
        "component38",
        "component39",
        "component4",
        "component40",
        "component41",
        "component42",
        "component43",
        "component44",
        "component45",
        "component46",
        "component47",
        "component48",
        "component49",
        "component5",
        "component50",
        "component51",
        "component52",
        "component53",
        "component54",
        "component55",
        "component56",
        "component57",
        "component58",
        "component59",
        "component6",
        "component60",
        "component61",
        "component62",
        "component63",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/Bird;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "model-persistence_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final ackLocked:Z

.field private final actions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdAction;",
            ">;"
        }
    .end annotation
.end field

.field private final areaKey:Ljava/lang/String;

.field private final asleep:Z

.field private final badgeType:Lco/bird/android/model/constant/MapPinBadge;

.field private final batteryLevel:I

.field private final bleMacAddress:Ljava/lang/String;

.field private final bluetooth:Z

.field private final boardProtocol:Ljava/lang/String;

.field private final bountyCurrency:Ljava/lang/String;

.field private final bountyId:Ljava/lang/String;

.field private final bountyKind:Lco/bird/android/model/constant/BountyKind;

.field private final bountyLost:Z

.field private final bountyOverdue:Z

.field private final bountyPrice:Ljava/lang/Integer;

.field private final bountyReasons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/BountyReason;",
            ">;"
        }
    .end annotation
.end field

.field private final brandName:Ljava/lang/String;

.field private final broken:Z

.field private final captive:Z

.field private final cellular:Z

.field private final code:Ljava/lang/String;

.field private final collect:Z

.field private final deliverable:Z

.field private final disconnected:Z

.field private final distance:I

.field private final down:Z

.field private final dueAt:Lorg/joda/time/DateTime;

.field private final ephemeralId:Ljava/lang/String;

.field private final estimatedRange:Ljava/lang/Integer;

.field private final gpsAt:Lorg/joda/time/DateTime;

.field private final gpsFix:Z

.field private final hasHelmet:Ljava/lang/Boolean;

.field private final id:Ljava/lang/String;

.field private final imei:Ljava/lang/String;

.field private isScanlessRideEligible:Z

.field private final label:Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

.field private final lastRideEndedAt:Lorg/joda/time/DateTime;

.field private final license:Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

.field private final lifecycle:Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

.field private lightOn:Ljava/lang/Boolean;

.field private final location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

.field private final locationUpdatedAt:Lorg/joda/time/DateTime;

.field private final locked:Z

.field private final lost:Z

.field private final model:Ljava/lang/String;

.field private final needsInspection:Z

.field private final nestId:Ljava/lang/String;

.field private final nestPurpose:Lco/bird/android/model/constant/NestPurpose;

.field private final offline:Z

.field private final partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

.field private final partnerId:Ljava/lang/String;

.field private final peril:Z

.field private final physicalLock:Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

.field private final physicalLocks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;",
            ">;"
        }
    .end annotation
.end field

.field private final priorityCollect:Z

.field private final privateBird:Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

.field private final scannedAt:Lorg/joda/time/DateTime;

.field private final serialNumber:Ljava/lang/String;

.field private final startedAt:Lorg/joda/time/DateTime;

.field private final stickerId:Ljava/lang/String;

.field private final submerged:Z

.field private final taskId:Ljava/lang/String;

.field private final taskKind:Lco/bird/android/model/constant/BirdTaskKind;

.field private final token:Ljava/lang/String;

.field private final trackedAt:Lorg/joda/time/DateTime;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Integer;",
            "I",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZZZZZZZ",
            "Lco/bird/android/model/persistence/nestedstructures/BirdLabel;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/BirdAction;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "ZZ",
            "Lco/bird/android/model/constant/BountyKind;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/BirdTaskKind;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/String;",
            "ZZ",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;",
            ">;ZZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            "Lco/bird/android/model/constant/PartnerBirdState;",
            "ZZ",
            "Lco/bird/android/model/persistence/nestedstructures/Lifecycle;",
            "Z",
            "Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/NestPurpose;",
            "Lco/bird/android/model/persistence/nestedstructures/PrivateBird;",
            "Lorg/joda/time/DateTime;",
            "Lco/bird/android/model/constant/MapPinBadge;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/BountyReason;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lorg/joda/time/DateTime;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p7

    move-object/from16 v3, p8

    move-object/from16 v4, p10

    move-object/from16 v5, p20

    move-object/from16 v6, p21

    move-object/from16 v7, p24

    move-object/from16 v8, p27

    move-object/from16 v9, p29

    move-object/from16 v10, p51

    move-object/from16 v11, p58

    move-object/from16 v12, p59

    const-string v13, "id"

    invoke-static {p1, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "location"

    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "code"

    invoke-static {v3, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "serialNumber"

    invoke-static {v4, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "label"

    invoke-static {v5, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "actions"

    invoke-static {v6, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "bountyCurrency"

    invoke-static {v7, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "bountyKind"

    invoke-static {v8, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "taskKind"

    invoke-static {v9, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "lifecycle"

    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "badgeType"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "bountyReasons"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->id:Ljava/lang/String;

    move-object/from16 v1, p2

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->model:Ljava/lang/String;

    move-object/from16 v1, p3

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->taskId:Ljava/lang/String;

    move/from16 v1, p4

    iput v1, v0, Lco/bird/android/model/persistence/Bird;->batteryLevel:I

    move-object/from16 v1, p5

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->estimatedRange:Ljava/lang/Integer;

    move/from16 v1, p6

    iput v1, v0, Lco/bird/android/model/persistence/Bird;->distance:I

    iput-object v2, v0, Lco/bird/android/model/persistence/Bird;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    iput-object v3, v0, Lco/bird/android/model/persistence/Bird;->code:Ljava/lang/String;

    move-object/from16 v1, p9

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->stickerId:Ljava/lang/String;

    iput-object v4, v0, Lco/bird/android/model/persistence/Bird;->serialNumber:Ljava/lang/String;

    move/from16 v1, p11

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->disconnected:Z

    move/from16 v1, p12

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->collect:Z

    move/from16 v1, p13

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->submerged:Z

    move/from16 v1, p14

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->lost:Z

    move/from16 v1, p15

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->locked:Z

    move/from16 v1, p16

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->ackLocked:Z

    move/from16 v1, p17

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->captive:Z

    move/from16 v1, p18

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->gpsFix:Z

    move/from16 v1, p19

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->broken:Z

    iput-object v5, v0, Lco/bird/android/model/persistence/Bird;->label:Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    iput-object v6, v0, Lco/bird/android/model/persistence/Bird;->actions:Ljava/util/List;

    move-object/from16 v1, p22

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->bountyId:Ljava/lang/String;

    move-object/from16 v1, p23

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->bountyPrice:Ljava/lang/Integer;

    iput-object v7, v0, Lco/bird/android/model/persistence/Bird;->bountyCurrency:Ljava/lang/String;

    move/from16 v1, p25

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->bountyLost:Z

    move/from16 v1, p26

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->bountyOverdue:Z

    iput-object v8, v0, Lco/bird/android/model/persistence/Bird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    move-object/from16 v1, p28

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->brandName:Ljava/lang/String;

    iput-object v9, v0, Lco/bird/android/model/persistence/Bird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    move-object/from16 v1, p30

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->gpsAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p31

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->trackedAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p32

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->token:Ljava/lang/String;

    move/from16 v1, p33

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->bluetooth:Z

    move/from16 v1, p34

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->cellular:Z

    move-object/from16 v1, p35

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->startedAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p36

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->dueAt:Lorg/joda/time/DateTime;

    move/from16 v1, p37

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->asleep:Z

    move-object/from16 v1, p38

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->imei:Ljava/lang/String;

    move-object/from16 v1, p39

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->boardProtocol:Ljava/lang/String;

    move-object/from16 v1, p40

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->physicalLock:Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    move-object/from16 v1, p41

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->physicalLocks:Ljava/util/List;

    move/from16 v1, p42

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->priorityCollect:Z

    move/from16 v1, p43

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->down:Z

    move/from16 v1, p44

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->needsInspection:Z

    move-object/from16 v1, p45

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->partnerId:Ljava/lang/String;

    move-object/from16 v1, p46

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->nestId:Ljava/lang/String;

    move-object/from16 v1, p47

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p48

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    move/from16 v1, p49

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->peril:Z

    move/from16 v1, p50

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->deliverable:Z

    iput-object v10, v0, Lco/bird/android/model/persistence/Bird;->lifecycle:Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move/from16 v1, p52

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->offline:Z

    move-object/from16 v1, p53

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->license:Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    move-object/from16 v1, p54

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->areaKey:Ljava/lang/String;

    move-object/from16 v1, p55

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    move-object/from16 v1, p56

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->privateBird:Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    move-object/from16 v1, p57

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->scannedAt:Lorg/joda/time/DateTime;

    iput-object v11, v0, Lco/bird/android/model/persistence/Bird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    iput-object v12, v0, Lco/bird/android/model/persistence/Bird;->bountyReasons:Ljava/util/List;

    move-object/from16 v1, p60

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->ephemeralId:Ljava/lang/String;

    move-object/from16 v1, p61

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->bleMacAddress:Ljava/lang/String;

    move-object/from16 v1, p62

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->hasHelmet:Ljava/lang/Boolean;

    move-object/from16 v1, p63

    iput-object v1, v0, Lco/bird/android/model/persistence/Bird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/Bird;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;IILjava/lang/Object;)Lco/bird/android/model/persistence/Bird;
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p64

    move/from16 v2, p65

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-object v3, v0, Lco/bird/android/model/persistence/Bird;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lco/bird/android/model/persistence/Bird;->model:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lco/bird/android/model/persistence/Bird;->taskId:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lco/bird/android/model/persistence/Bird;->batteryLevel:I

    goto :goto_3

    :cond_3
    move/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lco/bird/android/model/persistence/Bird;->estimatedRange:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Lco/bird/android/model/persistence/Bird;->distance:I

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lco/bird/android/model/persistence/Bird;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lco/bird/android/model/persistence/Bird;->code:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lco/bird/android/model/persistence/Bird;->stickerId:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lco/bird/android/model/persistence/Bird;->serialNumber:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-boolean v13, v0, Lco/bird/android/model/persistence/Bird;->disconnected:Z

    goto :goto_a

    :cond_a
    move/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-boolean v14, v0, Lco/bird/android/model/persistence/Bird;->collect:Z

    goto :goto_b

    :cond_b
    move/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->submerged:Z

    goto :goto_c

    :cond_c
    move/from16 v15, p13

    :goto_c
    move/from16 p13, v15

    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->lost:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->locked:Z

    goto :goto_e

    :cond_e
    move/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v17, v1, v16

    move/from16 p15, v15

    if-eqz v17, :cond_f

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->ackLocked:Z

    goto :goto_f

    :cond_f
    move/from16 v15, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v18, v1, v17

    move/from16 p16, v15

    if-eqz v18, :cond_10

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->captive:Z

    goto :goto_10

    :cond_10
    move/from16 v15, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v19, v1, v18

    move/from16 p17, v15

    if-eqz v19, :cond_11

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->gpsFix:Z

    goto :goto_11

    :cond_11
    move/from16 v15, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v20, v1, v19

    move/from16 p18, v15

    if-eqz v20, :cond_12

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->broken:Z

    goto :goto_12

    :cond_12
    move/from16 v15, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v21, v1, v20

    move/from16 p19, v15

    if-eqz v21, :cond_13

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->label:Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v22, v1, v21

    move-object/from16 p20, v15

    if-eqz v22, :cond_14

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->actions:Ljava/util/List;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v23, v1, v22

    move-object/from16 p21, v15

    if-eqz v23, :cond_15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->bountyId:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v15, p22

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, v1, v23

    move-object/from16 p22, v15

    if-eqz v23, :cond_16

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->bountyPrice:Ljava/lang/Integer;

    goto :goto_16

    :cond_16
    move-object/from16 v15, p23

    :goto_16
    const/high16 v23, 0x800000

    and-int v23, v1, v23

    move-object/from16 p23, v15

    if-eqz v23, :cond_17

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->bountyCurrency:Ljava/lang/String;

    goto :goto_17

    :cond_17
    move-object/from16 v15, p24

    :goto_17
    const/high16 v23, 0x1000000

    and-int v23, v1, v23

    move-object/from16 p24, v15

    if-eqz v23, :cond_18

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->bountyLost:Z

    goto :goto_18

    :cond_18
    move/from16 v15, p25

    :goto_18
    const/high16 v23, 0x2000000

    and-int v23, v1, v23

    move/from16 p25, v15

    if-eqz v23, :cond_19

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->bountyOverdue:Z

    goto :goto_19

    :cond_19
    move/from16 v15, p26

    :goto_19
    const/high16 v23, 0x4000000

    and-int v23, v1, v23

    move/from16 p26, v15

    if-eqz v23, :cond_1a

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    goto :goto_1a

    :cond_1a
    move-object/from16 v15, p27

    :goto_1a
    const/high16 v23, 0x8000000

    and-int v23, v1, v23

    move-object/from16 p27, v15

    if-eqz v23, :cond_1b

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->brandName:Ljava/lang/String;

    goto :goto_1b

    :cond_1b
    move-object/from16 v15, p28

    :goto_1b
    const/high16 v23, 0x10000000

    and-int v23, v1, v23

    move-object/from16 p28, v15

    if-eqz v23, :cond_1c

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    goto :goto_1c

    :cond_1c
    move-object/from16 v15, p29

    :goto_1c
    const/high16 v23, 0x20000000

    and-int v23, v1, v23

    move-object/from16 p29, v15

    if-eqz v23, :cond_1d

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->gpsAt:Lorg/joda/time/DateTime;

    goto :goto_1d

    :cond_1d
    move-object/from16 v15, p30

    :goto_1d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, v1, v23

    move-object/from16 p30, v15

    if-eqz v23, :cond_1e

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->trackedAt:Lorg/joda/time/DateTime;

    goto :goto_1e

    :cond_1e
    move-object/from16 v15, p31

    :goto_1e
    const/high16 v23, -0x80000000

    and-int v1, v1, v23

    if-eqz v1, :cond_1f

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->token:Ljava/lang/String;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p32

    :goto_1f
    and-int/lit8 v23, v2, 0x1

    move-object/from16 p32, v1

    if-eqz v23, :cond_20

    iget-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->bluetooth:Z

    goto :goto_20

    :cond_20
    move/from16 v1, p33

    :goto_20
    and-int/lit8 v23, v2, 0x2

    move/from16 p33, v1

    if-eqz v23, :cond_21

    iget-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->cellular:Z

    goto :goto_21

    :cond_21
    move/from16 v1, p34

    :goto_21
    and-int/lit8 v23, v2, 0x4

    move/from16 p34, v1

    if-eqz v23, :cond_22

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->startedAt:Lorg/joda/time/DateTime;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p35

    :goto_22
    and-int/lit8 v23, v2, 0x8

    move-object/from16 p35, v1

    if-eqz v23, :cond_23

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->dueAt:Lorg/joda/time/DateTime;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v23, v2, 0x10

    move-object/from16 p36, v1

    if-eqz v23, :cond_24

    iget-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->asleep:Z

    goto :goto_24

    :cond_24
    move/from16 v1, p37

    :goto_24
    and-int/lit8 v23, v2, 0x20

    move/from16 p37, v1

    if-eqz v23, :cond_25

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->imei:Ljava/lang/String;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p38

    :goto_25
    and-int/lit8 v23, v2, 0x40

    move-object/from16 p38, v1

    if-eqz v23, :cond_26

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->boardProtocol:Ljava/lang/String;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p39

    :goto_26
    move-object/from16 p39, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->physicalLock:Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p40

    :goto_27
    move-object/from16 p40, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->physicalLocks:Ljava/util/List;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p41

    :goto_28
    move-object/from16 p41, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->priorityCollect:Z

    goto :goto_29

    :cond_29
    move/from16 v1, p42

    :goto_29
    move/from16 p42, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->down:Z

    goto :goto_2a

    :cond_2a
    move/from16 v1, p43

    :goto_2a
    move/from16 p43, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->needsInspection:Z

    goto :goto_2b

    :cond_2b
    move/from16 v1, p44

    :goto_2b
    move/from16 p44, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->partnerId:Ljava/lang/String;

    goto :goto_2c

    :cond_2c
    move-object/from16 v1, p45

    :goto_2c
    move-object/from16 p45, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->nestId:Ljava/lang/String;

    goto :goto_2d

    :cond_2d
    move-object/from16 v1, p46

    :goto_2d
    move-object/from16 p46, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    goto :goto_2e

    :cond_2e
    move-object/from16 v1, p47

    :goto_2e
    and-int v16, v2, v16

    move-object/from16 p47, v1

    if-eqz v16, :cond_2f

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    goto :goto_2f

    :cond_2f
    move-object/from16 v1, p48

    :goto_2f
    and-int v16, v2, v17

    move-object/from16 p48, v1

    if-eqz v16, :cond_30

    iget-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->peril:Z

    goto :goto_30

    :cond_30
    move/from16 v1, p49

    :goto_30
    and-int v16, v2, v18

    move/from16 p49, v1

    if-eqz v16, :cond_31

    iget-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->deliverable:Z

    goto :goto_31

    :cond_31
    move/from16 v1, p50

    :goto_31
    and-int v16, v2, v19

    move/from16 p50, v1

    if-eqz v16, :cond_32

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->lifecycle:Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    goto :goto_32

    :cond_32
    move-object/from16 v1, p51

    :goto_32
    and-int v16, v2, v20

    move-object/from16 p51, v1

    if-eqz v16, :cond_33

    iget-boolean v1, v0, Lco/bird/android/model/persistence/Bird;->offline:Z

    goto :goto_33

    :cond_33
    move/from16 v1, p52

    :goto_33
    and-int v16, v2, v21

    move/from16 p52, v1

    if-eqz v16, :cond_34

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->license:Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    goto :goto_34

    :cond_34
    move-object/from16 v1, p53

    :goto_34
    and-int v16, v2, v22

    move-object/from16 p53, v1

    if-eqz v16, :cond_35

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->areaKey:Ljava/lang/String;

    goto :goto_35

    :cond_35
    move-object/from16 v1, p54

    :goto_35
    const/high16 v16, 0x400000

    and-int v16, v2, v16

    move-object/from16 p54, v1

    if-eqz v16, :cond_36

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    goto :goto_36

    :cond_36
    move-object/from16 v1, p55

    :goto_36
    const/high16 v16, 0x800000

    and-int v16, v2, v16

    move-object/from16 p55, v1

    if-eqz v16, :cond_37

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->privateBird:Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    goto :goto_37

    :cond_37
    move-object/from16 v1, p56

    :goto_37
    const/high16 v16, 0x1000000

    and-int v16, v2, v16

    move-object/from16 p56, v1

    if-eqz v16, :cond_38

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->scannedAt:Lorg/joda/time/DateTime;

    goto :goto_38

    :cond_38
    move-object/from16 v1, p57

    :goto_38
    const/high16 v16, 0x2000000

    and-int v16, v2, v16

    move-object/from16 p57, v1

    if-eqz v16, :cond_39

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    goto :goto_39

    :cond_39
    move-object/from16 v1, p58

    :goto_39
    const/high16 v16, 0x4000000

    and-int v16, v2, v16

    move-object/from16 p58, v1

    if-eqz v16, :cond_3a

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->bountyReasons:Ljava/util/List;

    goto :goto_3a

    :cond_3a
    move-object/from16 v1, p59

    :goto_3a
    const/high16 v16, 0x8000000

    and-int v16, v2, v16

    move-object/from16 p59, v1

    if-eqz v16, :cond_3b

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->ephemeralId:Ljava/lang/String;

    goto :goto_3b

    :cond_3b
    move-object/from16 v1, p60

    :goto_3b
    const/high16 v16, 0x10000000

    and-int v16, v2, v16

    move-object/from16 p60, v1

    if-eqz v16, :cond_3c

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->bleMacAddress:Ljava/lang/String;

    goto :goto_3c

    :cond_3c
    move-object/from16 v1, p61

    :goto_3c
    const/high16 v16, 0x20000000

    and-int v16, v2, v16

    move-object/from16 p61, v1

    if-eqz v16, :cond_3d

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->hasHelmet:Ljava/lang/Boolean;

    goto :goto_3d

    :cond_3d
    move-object/from16 v1, p62

    :goto_3d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v2, v2, v16

    if-eqz v2, :cond_3e

    iget-object v2, v0, Lco/bird/android/model/persistence/Bird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    goto :goto_3e

    :cond_3e
    move-object/from16 v2, p63

    :goto_3e
    move-object/from16 p1, v3

    move-object/from16 p2, v4

    move-object/from16 p3, v5

    move/from16 p4, v6

    move-object/from16 p5, v7

    move/from16 p6, v8

    move-object/from16 p7, v9

    move-object/from16 p8, v10

    move-object/from16 p9, v11

    move-object/from16 p10, v12

    move/from16 p11, v13

    move/from16 p12, v14

    move-object/from16 p31, v15

    move-object/from16 p62, v1

    move-object/from16 p63, v2

    invoke-virtual/range {p0 .. p63}, Lco/bird/android/model/persistence/Bird;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/Bird;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getPhysicalLock$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "use physicalLocks"
    .end annotation

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->serialNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->disconnected:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->collect:Z

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->submerged:Z

    return v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->lost:Z

    return v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->locked:Z

    return v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->ackLocked:Z

    return v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->captive:Z

    return v0
.end method

.method public final component18()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->gpsFix:Z

    return v0
.end method

.method public final component19()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->broken:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->model:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Lco/bird/android/model/persistence/nestedstructures/BirdLabel;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->label:Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    return-object v0
.end method

.method public final component21()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->actions:Ljava/util/List;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->bountyId:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->bountyPrice:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->bountyCurrency:Ljava/lang/String;

    return-object v0
.end method

.method public final component25()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->bountyLost:Z

    return v0
.end method

.method public final component26()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->bountyOverdue:Z

    return v0
.end method

.method public final component27()Lco/bird/android/model/constant/BountyKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    return-object v0
.end method

.method public final component28()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->brandName:Ljava/lang/String;

    return-object v0
.end method

.method public final component29()Lco/bird/android/model/constant/BirdTaskKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->taskId:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->gpsAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component31()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->trackedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component32()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->token:Ljava/lang/String;

    return-object v0
.end method

.method public final component33()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->bluetooth:Z

    return v0
.end method

.method public final component34()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->cellular:Z

    return v0
.end method

.method public final component35()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->startedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component36()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->dueAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component37()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->asleep:Z

    return v0
.end method

.method public final component38()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->imei:Ljava/lang/String;

    return-object v0
.end method

.method public final component39()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->boardProtocol:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/Bird;->batteryLevel:I

    return v0
.end method

.method public final component40()Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->physicalLock:Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    return-object v0
.end method

.method public final component41()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->physicalLocks:Ljava/util/List;

    return-object v0
.end method

.method public final component42()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->priorityCollect:Z

    return v0
.end method

.method public final component43()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->down:Z

    return v0
.end method

.method public final component44()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->needsInspection:Z

    return v0
.end method

.method public final component45()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component46()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->nestId:Ljava/lang/String;

    return-object v0
.end method

.method public final component47()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component48()Lco/bird/android/model/constant/PartnerBirdState;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    return-object v0
.end method

.method public final component49()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->peril:Z

    return v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->estimatedRange:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component50()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->deliverable:Z

    return v0
.end method

.method public final component51()Lco/bird/android/model/persistence/nestedstructures/Lifecycle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->lifecycle:Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    return-object v0
.end method

.method public final component52()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->offline:Z

    return v0
.end method

.method public final component53()Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->license:Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    return-object v0
.end method

.method public final component54()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->areaKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component55()Lco/bird/android/model/constant/NestPurpose;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    return-object v0
.end method

.method public final component56()Lco/bird/android/model/persistence/nestedstructures/PrivateBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->privateBird:Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    return-object v0
.end method

.method public final component57()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->scannedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component58()Lco/bird/android/model/constant/MapPinBadge;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    return-object v0
.end method

.method public final component59()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/BountyReason;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->bountyReasons:Ljava/util/List;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/Bird;->distance:I

    return v0
.end method

.method public final component60()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->ephemeralId:Ljava/lang/String;

    return-object v0
.end method

.method public final component61()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->bleMacAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final component62()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->hasHelmet:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component63()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/persistence/nestedstructures/Geolocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->stickerId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/Bird;
    .locals 66
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Integer;",
            "I",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZZZZZZZ",
            "Lco/bird/android/model/persistence/nestedstructures/BirdLabel;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/BirdAction;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "ZZ",
            "Lco/bird/android/model/constant/BountyKind;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/BirdTaskKind;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/String;",
            "ZZ",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;",
            ">;ZZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            "Lco/bird/android/model/constant/PartnerBirdState;",
            "ZZ",
            "Lco/bird/android/model/persistence/nestedstructures/Lifecycle;",
            "Z",
            "Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/NestPurpose;",
            "Lco/bird/android/model/persistence/nestedstructures/PrivateBird;",
            "Lorg/joda/time/DateTime;",
            "Lco/bird/android/model/constant/MapPinBadge;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/BountyReason;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lorg/joda/time/DateTime;",
            ")",
            "Lco/bird/android/model/persistence/Bird;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move-object/from16 v23, p23

    move-object/from16 v24, p24

    move/from16 v25, p25

    move/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p28

    move-object/from16 v29, p29

    move-object/from16 v30, p30

    move-object/from16 v31, p31

    move-object/from16 v32, p32

    move/from16 v33, p33

    move/from16 v34, p34

    move-object/from16 v35, p35

    move-object/from16 v36, p36

    move/from16 v37, p37

    move-object/from16 v38, p38

    move-object/from16 v39, p39

    move-object/from16 v40, p40

    move-object/from16 v41, p41

    move/from16 v42, p42

    move/from16 v43, p43

    move/from16 v44, p44

    move-object/from16 v45, p45

    move-object/from16 v46, p46

    move-object/from16 v47, p47

    move-object/from16 v48, p48

    move/from16 v49, p49

    move/from16 v50, p50

    move-object/from16 v51, p51

    move/from16 v52, p52

    move-object/from16 v53, p53

    move-object/from16 v54, p54

    move-object/from16 v55, p55

    move-object/from16 v56, p56

    move-object/from16 v57, p57

    move-object/from16 v58, p58

    move-object/from16 v59, p59

    move-object/from16 v60, p60

    move-object/from16 v61, p61

    move-object/from16 v62, p62

    move-object/from16 v63, p63

    const-string v0, "id"

    move-object/from16 v64, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "code"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialNumber"

    move-object/from16 v1, p10

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    move-object/from16 v1, p20

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actions"

    move-object/from16 v1, p21

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bountyCurrency"

    move-object/from16 v1, p24

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bountyKind"

    move-object/from16 v1, p27

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskKind"

    move-object/from16 v1, p29

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    move-object/from16 v1, p51

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "badgeType"

    move-object/from16 v1, p58

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bountyReasons"

    move-object/from16 v1, p59

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v65, Lco/bird/android/model/persistence/Bird;

    move-object/from16 v0, v65

    move-object/from16 v1, v64

    invoke-direct/range {v0 .. v63}, Lco/bird/android/model/persistence/Bird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V

    return-object v65
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/Bird;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/Bird;

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->model:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->model:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->taskId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->taskId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/bird/android/model/persistence/Bird;->batteryLevel:I

    iget v3, p1, Lco/bird/android/model/persistence/Bird;->batteryLevel:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->estimatedRange:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->estimatedRange:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/bird/android/model/persistence/Bird;->distance:I

    iget v3, p1, Lco/bird/android/model/persistence/Bird;->distance:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->code:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->code:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->stickerId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->stickerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->serialNumber:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->serialNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->disconnected:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->disconnected:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->collect:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->collect:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->submerged:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->submerged:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->lost:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->lost:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->locked:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->locked:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->ackLocked:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->ackLocked:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->captive:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->captive:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->gpsFix:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->gpsFix:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->broken:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->broken:Z

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->label:Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->label:Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->actions:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->actions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->bountyId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->bountyId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->bountyPrice:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->bountyPrice:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->bountyCurrency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->bountyCurrency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->bountyLost:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->bountyLost:Z

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->bountyOverdue:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->bountyOverdue:Z

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->brandName:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->brandName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->gpsAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->gpsAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->trackedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->trackedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->token:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->token:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->bluetooth:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->bluetooth:Z

    if-eq v1, v3, :cond_22

    return v2

    :cond_22
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->cellular:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->cellular:Z

    if-eq v1, v3, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->startedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->startedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->dueAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->dueAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->asleep:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->asleep:Z

    if-eq v1, v3, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->imei:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->imei:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->boardProtocol:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->boardProtocol:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->physicalLock:Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->physicalLock:Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->physicalLocks:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->physicalLocks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->priorityCollect:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->priorityCollect:Z

    if-eq v1, v3, :cond_2b

    return v2

    :cond_2b
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->down:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->down:Z

    if-eq v1, v3, :cond_2c

    return v2

    :cond_2c
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->needsInspection:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->needsInspection:Z

    if-eq v1, v3, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->partnerId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->partnerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    return v2

    :cond_2e
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->nestId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->nestId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    return v2

    :cond_2f
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    return v2

    :cond_30
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    if-eq v1, v3, :cond_31

    return v2

    :cond_31
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->peril:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->peril:Z

    if-eq v1, v3, :cond_32

    return v2

    :cond_32
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->deliverable:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->deliverable:Z

    if-eq v1, v3, :cond_33

    return v2

    :cond_33
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->lifecycle:Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->lifecycle:Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_34

    return v2

    :cond_34
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->offline:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Bird;->offline:Z

    if-eq v1, v3, :cond_35

    return v2

    :cond_35
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->license:Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->license:Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_36

    return v2

    :cond_36
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->areaKey:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->areaKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_37

    return v2

    :cond_37
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    if-eq v1, v3, :cond_38

    return v2

    :cond_38
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->privateBird:Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->privateBird:Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_39

    return v2

    :cond_39
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->scannedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->scannedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3a

    return v2

    :cond_3a
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    if-eq v1, v3, :cond_3b

    return v2

    :cond_3b
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->bountyReasons:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->bountyReasons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3c

    return v2

    :cond_3c
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->ephemeralId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->ephemeralId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3d

    return v2

    :cond_3d
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->bleMacAddress:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->bleMacAddress:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3e

    return v2

    :cond_3e
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->hasHelmet:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/android/model/persistence/Bird;->hasHelmet:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3f

    return v2

    :cond_3f
    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    iget-object p1, p1, Lco/bird/android/model/persistence/Bird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_40

    return v2

    :cond_40
    return v0
.end method

.method public final getAckLocked()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->ackLocked:Z

    return v0
.end method

.method public final getActions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->actions:Ljava/util/List;

    return-object v0
.end method

.method public final getAreaKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->areaKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getAsleep()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->asleep:Z

    return v0
.end method

.method public final getBadgeType()Lco/bird/android/model/constant/MapPinBadge;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    return-object v0
.end method

.method public final getBatteryLevel()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/Bird;->batteryLevel:I

    return v0
.end method

.method public final getBleMacAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->bleMacAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getBluetooth()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->bluetooth:Z

    return v0
.end method

.method public final getBoardProtocol()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->boardProtocol:Ljava/lang/String;

    return-object v0
.end method

.method public final getBountyCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->bountyCurrency:Ljava/lang/String;

    return-object v0
.end method

.method public final getBountyId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->bountyId:Ljava/lang/String;

    return-object v0
.end method

.method public final getBountyKind()Lco/bird/android/model/constant/BountyKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    return-object v0
.end method

.method public final getBountyLost()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->bountyLost:Z

    return v0
.end method

.method public final getBountyOverdue()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->bountyOverdue:Z

    return v0
.end method

.method public final getBountyPrice()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->bountyPrice:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getBountyReasons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/BountyReason;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->bountyReasons:Ljava/util/List;

    return-object v0
.end method

.method public final getBrandName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->brandName:Ljava/lang/String;

    return-object v0
.end method

.method public final getBroken()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->broken:Z

    return v0
.end method

.method public final getCaptive()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->captive:Z

    return v0
.end method

.method public final getCellular()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->cellular:Z

    return v0
.end method

.method public final getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getCollect()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->collect:Z

    return v0
.end method

.method public final getDeliverable()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->deliverable:Z

    return v0
.end method

.method public final getDisconnected()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->disconnected:Z

    return v0
.end method

.method public final getDistance()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/Bird;->distance:I

    return v0
.end method

.method public final getDown()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->down:Z

    return v0
.end method

.method public final getDueAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->dueAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getEphemeralId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->ephemeralId:Ljava/lang/String;

    return-object v0
.end method

.method public final getEstimatedRange()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->estimatedRange:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getGpsAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->gpsAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getGpsFix()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->gpsFix:Z

    return v0
.end method

.method public final getHasHelmet()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->hasHelmet:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImei()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->imei:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Lco/bird/android/model/persistence/nestedstructures/BirdLabel;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->label:Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    return-object v0
.end method

.method public final getLastRideEndedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getLicense()Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->license:Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    return-object v0
.end method

.method public final getLifecycle()Lco/bird/android/model/persistence/nestedstructures/Lifecycle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->lifecycle:Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    return-object v0
.end method

.method public final getLightOn()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->lightOn:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getLocation()Lco/bird/android/model/persistence/nestedstructures/Geolocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    return-object v0
.end method

.method public final getLocationUpdatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getLocked()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->locked:Z

    return v0
.end method

.method public final getLost()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->lost:Z

    return v0
.end method

.method public final getModel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->model:Ljava/lang/String;

    return-object v0
.end method

.method public final getNeedsInspection()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->needsInspection:Z

    return v0
.end method

.method public final getNestId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->nestId:Ljava/lang/String;

    return-object v0
.end method

.method public final getNestPurpose()Lco/bird/android/model/constant/NestPurpose;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    return-object v0
.end method

.method public final getOffline()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->offline:Z

    return v0
.end method

.method public final getPartnerBirdState()Lco/bird/android/model/constant/PartnerBirdState;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    return-object v0
.end method

.method public final getPartnerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPeril()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->peril:Z

    return v0
.end method

.method public final getPhysicalLock()Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->physicalLock:Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    return-object v0
.end method

.method public final getPhysicalLocks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->physicalLocks:Ljava/util/List;

    return-object v0
.end method

.method public final getPriorityCollect()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->priorityCollect:Z

    return v0
.end method

.method public final getPrivateBird()Lco/bird/android/model/persistence/nestedstructures/PrivateBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->privateBird:Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    return-object v0
.end method

.method public final getScannedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->scannedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getSerialNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->serialNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->startedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getStickerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->stickerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmerged()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->submerged:Z

    return v0
.end method

.method public final getTaskId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->taskId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTaskKind()Lco/bird/android/model/constant/BirdTaskKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    return-object v0
.end method

.method public final getToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->token:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->trackedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/persistence/Bird;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->model:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->taskId:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/persistence/Bird;->batteryLevel:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->estimatedRange:Ljava/lang/Integer;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/persistence/Bird;->distance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->code:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->stickerId:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->serialNumber:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->disconnected:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    move v1, v3

    :cond_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->collect:Z

    if-eqz v1, :cond_5

    move v1, v3

    :cond_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->submerged:Z

    if-eqz v1, :cond_6

    move v1, v3

    :cond_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->lost:Z

    if-eqz v1, :cond_7

    move v1, v3

    :cond_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->locked:Z

    if-eqz v1, :cond_8

    move v1, v3

    :cond_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->ackLocked:Z

    if-eqz v1, :cond_9

    move v1, v3

    :cond_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->captive:Z

    if-eqz v1, :cond_a

    move v1, v3

    :cond_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->gpsFix:Z

    if-eqz v1, :cond_b

    move v1, v3

    :cond_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->broken:Z

    if-eqz v1, :cond_c

    move v1, v3

    :cond_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->label:Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/BirdLabel;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->actions:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->bountyId:Ljava/lang/String;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_4

    :cond_d
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->bountyPrice:Ljava/lang/Integer;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_5

    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->bountyCurrency:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->bountyLost:Z

    if-eqz v1, :cond_f

    move v1, v3

    :cond_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->bountyOverdue:Z

    if-eqz v1, :cond_10

    move v1, v3

    :cond_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->brandName:Ljava/lang/String;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_6

    :cond_11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->gpsAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_7

    :cond_12
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->trackedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_8

    :cond_13
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->token:Ljava/lang/String;

    if-nez v1, :cond_14

    move v1, v2

    goto :goto_9

    :cond_14
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->bluetooth:Z

    if-eqz v1, :cond_15

    move v1, v3

    :cond_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->cellular:Z

    if-eqz v1, :cond_16

    move v1, v3

    :cond_16
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->startedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_17

    move v1, v2

    goto :goto_a

    :cond_17
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->dueAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_18

    move v1, v2

    goto :goto_b

    :cond_18
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->asleep:Z

    if-eqz v1, :cond_19

    move v1, v3

    :cond_19
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->imei:Ljava/lang/String;

    if-nez v1, :cond_1a

    move v1, v2

    goto :goto_c

    :cond_1a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->boardProtocol:Ljava/lang/String;

    if-nez v1, :cond_1b

    move v1, v2

    goto :goto_d

    :cond_1b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->physicalLock:Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    if-nez v1, :cond_1c

    move v1, v2

    goto :goto_e

    :cond_1c
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->physicalLocks:Ljava/util/List;

    if-nez v1, :cond_1d

    move v1, v2

    goto :goto_f

    :cond_1d
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->priorityCollect:Z

    if-eqz v1, :cond_1e

    move v1, v3

    :cond_1e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->down:Z

    if-eqz v1, :cond_1f

    move v1, v3

    :cond_1f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->needsInspection:Z

    if-eqz v1, :cond_20

    move v1, v3

    :cond_20
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->partnerId:Ljava/lang/String;

    if-nez v1, :cond_21

    move v1, v2

    goto :goto_10

    :cond_21
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->nestId:Ljava/lang/String;

    if-nez v1, :cond_22

    move v1, v2

    goto :goto_11

    :cond_22
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_23

    move v1, v2

    goto :goto_12

    :cond_23
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    if-nez v1, :cond_24

    move v1, v2

    goto :goto_13

    :cond_24
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->peril:Z

    if-eqz v1, :cond_25

    move v1, v3

    :cond_25
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->deliverable:Z

    if-eqz v1, :cond_26

    move v1, v3

    :cond_26
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->lifecycle:Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Bird;->offline:Z

    if-eqz v1, :cond_27

    goto :goto_14

    :cond_27
    move v3, v1

    :goto_14
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->license:Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    if-nez v1, :cond_28

    move v1, v2

    goto :goto_15

    :cond_28
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->areaKey:Ljava/lang/String;

    if-nez v1, :cond_29

    move v1, v2

    goto :goto_16

    :cond_29
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_16
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    if-nez v1, :cond_2a

    move v1, v2

    goto :goto_17

    :cond_2a
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_17
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->privateBird:Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    if-nez v1, :cond_2b

    move v1, v2

    goto :goto_18

    :cond_2b
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->hashCode()I

    move-result v1

    :goto_18
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->scannedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_2c

    move v1, v2

    goto :goto_19

    :cond_2c
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_19
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->bountyReasons:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->ephemeralId:Ljava/lang/String;

    if-nez v1, :cond_2d

    move v1, v2

    goto :goto_1a

    :cond_2d
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->bleMacAddress:Ljava/lang/String;

    if-nez v1, :cond_2e

    move v1, v2

    goto :goto_1b

    :cond_2e
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->hasHelmet:Ljava/lang/Boolean;

    if-nez v1, :cond_2f

    move v1, v2

    goto :goto_1c

    :cond_2f
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Bird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_30

    goto :goto_1d

    :cond_30
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v2

    :goto_1d
    add-int/2addr v0, v2

    return v0
.end method

.method public final isScanlessRideEligible()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Bird;->isScanlessRideEligible:Z

    return v0
.end method

.method public final setLightOn(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/persistence/Bird;->lightOn:Ljava/lang/Boolean;

    return-void
.end method

.method public final setScanlessRideEligible(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/model/persistence/Bird;->isScanlessRideEligible:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 65

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/model/persistence/Bird;->id:Ljava/lang/String;

    iget-object v2, v0, Lco/bird/android/model/persistence/Bird;->model:Ljava/lang/String;

    iget-object v3, v0, Lco/bird/android/model/persistence/Bird;->taskId:Ljava/lang/String;

    iget v4, v0, Lco/bird/android/model/persistence/Bird;->batteryLevel:I

    iget-object v5, v0, Lco/bird/android/model/persistence/Bird;->estimatedRange:Ljava/lang/Integer;

    iget v6, v0, Lco/bird/android/model/persistence/Bird;->distance:I

    iget-object v7, v0, Lco/bird/android/model/persistence/Bird;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    iget-object v8, v0, Lco/bird/android/model/persistence/Bird;->code:Ljava/lang/String;

    iget-object v9, v0, Lco/bird/android/model/persistence/Bird;->stickerId:Ljava/lang/String;

    iget-object v10, v0, Lco/bird/android/model/persistence/Bird;->serialNumber:Ljava/lang/String;

    iget-boolean v11, v0, Lco/bird/android/model/persistence/Bird;->disconnected:Z

    iget-boolean v12, v0, Lco/bird/android/model/persistence/Bird;->collect:Z

    iget-boolean v13, v0, Lco/bird/android/model/persistence/Bird;->submerged:Z

    iget-boolean v14, v0, Lco/bird/android/model/persistence/Bird;->lost:Z

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->locked:Z

    move/from16 v16, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->ackLocked:Z

    move/from16 v17, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->captive:Z

    move/from16 v18, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->gpsFix:Z

    move/from16 v19, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->broken:Z

    move/from16 v20, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->label:Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    move-object/from16 v21, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->actions:Ljava/util/List;

    move-object/from16 v22, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->bountyId:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->bountyPrice:Ljava/lang/Integer;

    move-object/from16 v24, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->bountyCurrency:Ljava/lang/String;

    move-object/from16 v25, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->bountyLost:Z

    move/from16 v26, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->bountyOverdue:Z

    move/from16 v27, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    move-object/from16 v28, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->brandName:Ljava/lang/String;

    move-object/from16 v29, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    move-object/from16 v30, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->gpsAt:Lorg/joda/time/DateTime;

    move-object/from16 v31, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->trackedAt:Lorg/joda/time/DateTime;

    move-object/from16 v32, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->token:Ljava/lang/String;

    move-object/from16 v33, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->bluetooth:Z

    move/from16 v34, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->cellular:Z

    move/from16 v35, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->startedAt:Lorg/joda/time/DateTime;

    move-object/from16 v36, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->dueAt:Lorg/joda/time/DateTime;

    move-object/from16 v37, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->asleep:Z

    move/from16 v38, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->imei:Ljava/lang/String;

    move-object/from16 v39, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->boardProtocol:Ljava/lang/String;

    move-object/from16 v40, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->physicalLock:Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    move-object/from16 v41, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->physicalLocks:Ljava/util/List;

    move-object/from16 v42, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->priorityCollect:Z

    move/from16 v43, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->down:Z

    move/from16 v44, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->needsInspection:Z

    move/from16 v45, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->partnerId:Ljava/lang/String;

    move-object/from16 v46, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->nestId:Ljava/lang/String;

    move-object/from16 v47, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    move-object/from16 v48, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    move-object/from16 v49, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->peril:Z

    move/from16 v50, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->deliverable:Z

    move/from16 v51, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->lifecycle:Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-object/from16 v52, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Bird;->offline:Z

    move/from16 v53, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->license:Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    move-object/from16 v54, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->areaKey:Ljava/lang/String;

    move-object/from16 v55, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    move-object/from16 v56, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->privateBird:Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    move-object/from16 v57, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->scannedAt:Lorg/joda/time/DateTime;

    move-object/from16 v58, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    move-object/from16 v59, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->bountyReasons:Ljava/util/List;

    move-object/from16 v60, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->ephemeralId:Ljava/lang/String;

    move-object/from16 v61, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->bleMacAddress:Ljava/lang/String;

    move-object/from16 v62, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->hasHelmet:Ljava/lang/Boolean;

    move-object/from16 v63, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Bird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v64, v15

    const-string v15, "Bird(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", model="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", taskId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", batteryLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", estimatedRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", location="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", stickerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", serialNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", disconnected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", collect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", submerged="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", lost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", locked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", ackLocked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", captive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", gpsFix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", broken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", label="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", actions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bountyId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bountyPrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bountyCurrency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bountyLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bountyOverdue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bountyKind="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", brandName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", taskKind="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gpsAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trackedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bluetooth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cellular="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", startedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dueAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", asleep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", imei="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", boardProtocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", physicalLock="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", physicalLocks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v42

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", priorityCollect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", down="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", needsInspection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", partnerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nestId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v47

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lastRideEndedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v48

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", partnerBirdState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v49

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", peril="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v50

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", deliverable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v51

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", lifecycle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v52

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v53

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", license="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v54

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", areaKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v55

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nestPurpose="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v56

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", privateBird="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v57

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scannedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v58

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", badgeType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v59

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bountyReasons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v60

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ephemeralId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v61

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bleMacAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v62

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hasHelmet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v63

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", locationUpdatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v64

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
