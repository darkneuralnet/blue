.class public LSh2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzh2;
.implements LLi0;
.implements LVE3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSh2$c;,
        LSh2$b;,
        LSh2$a;
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
    message = "This is internal API and may be removed in the future releases"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006\u00b6\u0001\u00a4\u0001\u00a6\u0001B\u0012\u0012\u0007\u0010\u00b3\u0001\u001a\u00020\u0015\u00a2\u0006\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001J#\u0010\u0008\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001d\u0010!\u001a\u00020\u0010*\u00020\u001a2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0019\u0010#\u001a\u00020\"2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008#\u0010$J@\u0010,\u001a\u00020+2\'\u0010)\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b\u00a2\u0006\u000c\u0008&\u0012\u0008\u0008\'\u0012\u0004\u0008\u0008(\u001c\u0012\u0004\u0012\u00020\u00100%j\u0002`(2\u0006\u0010*\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008,\u0010-J\'\u00100\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020+H\u0002\u00a2\u0006\u0004\u00080\u00101J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u000202H\u0002\u00a2\u0006\u0004\u00083\u00104J\u0017\u00105\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020+H\u0002\u00a2\u0006\u0004\u00085\u00106J\u000f\u00107\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u00087\u00108J\u0013\u00109\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00089\u0010:J\u001b\u0010;\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008;\u0010<J\u0019\u0010=\u001a\u00020\u000b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008=\u0010>J\u001b\u0010?\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008?\u0010<J\u0019\u0010@\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008@\u0010AJ\u001f\u0010B\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008B\u0010CJ%\u0010D\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008D\u0010EJ#\u0010F\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00132\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008F\u0010GJ\u0019\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008I\u0010JJ*\u0010L\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010K\u001a\u00020H2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0082\u0010\u00a2\u0006\u0004\u0008L\u0010MJ)\u0010O\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010N\u001a\u00020H2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008O\u0010PJ\u0015\u0010R\u001a\u0004\u0018\u00010H*\u00020QH\u0002\u00a2\u0006\u0004\u0008R\u0010SJ\u0019\u0010U\u001a\u00020T2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008U\u0010VJ\u0015\u0010W\u001a\u0004\u0018\u00010\u0004H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008W\u0010:J\u0019\u0010Y\u001a\u00020\u00102\u0008\u0010X\u001a\u0004\u0018\u00010\u0001H\u0004\u00a2\u0006\u0004\u0008Y\u0010ZJ\r\u0010[\u001a\u00020\u0015\u00a2\u0006\u0004\u0008[\u00108J\u000f\u0010\\\u001a\u00020\u0010H\u0014\u00a2\u0006\u0004\u0008\\\u0010]J\u0011\u0010`\u001a\u00060^j\u0002`_\u00a2\u0006\u0004\u0008`\u0010aJ#\u0010c\u001a\u00060^j\u0002`_*\u00020\u000b2\n\u0008\u0002\u0010b\u001a\u0004\u0018\u00010TH\u0004\u00a2\u0006\u0004\u0008c\u0010dJ6\u0010f\u001a\u00020e2\'\u0010)\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b\u00a2\u0006\u000c\u0008&\u0012\u0008\u0008\'\u0012\u0004\u0008\u0008(\u001c\u0012\u0004\u0012\u00020\u00100%j\u0002`(\u00a2\u0006\u0004\u0008f\u0010gJF\u0010i\u001a\u00020e2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010h\u001a\u00020\u00152\'\u0010)\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b\u00a2\u0006\u000c\u0008&\u0012\u0008\u0008\'\u0012\u0004\u0008\u0008(\u001c\u0012\u0004\u0012\u00020\u00100%j\u0002`(\u00a2\u0006\u0004\u0008i\u0010jJ\u0013\u0010k\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008k\u0010:J\u0017\u0010l\u001a\u00020\u00102\u0006\u0010/\u001a\u00020+H\u0000\u00a2\u0006\u0004\u0008l\u00106J\u001f\u0010m\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0018\u00010^j\u0004\u0018\u0001`_H\u0016\u00a2\u0006\u0004\u0008m\u0010nJ\u000f\u0010o\u001a\u00020TH\u0014\u00a2\u0006\u0004\u0008o\u0010pJ\u0017\u0010q\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008q\u0010rJ\u0015\u0010t\u001a\u00020\u00102\u0006\u0010s\u001a\u00020\u0003\u00a2\u0006\u0004\u0008t\u0010uJ\u0017\u0010v\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008v\u0010 J\u0017\u0010w\u001a\u00020\u00152\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008w\u0010 J\u0019\u0010x\u001a\u00020\u00152\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0000\u00a2\u0006\u0004\u0008x\u0010yJ\u0013\u0010z\u001a\u00060^j\u0002`_H\u0016\u00a2\u0006\u0004\u0008z\u0010aJ\u0019\u0010{\u001a\u00020\u00152\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000\u00a2\u0006\u0004\u0008{\u0010yJ\u001b\u0010|\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000\u00a2\u0006\u0004\u0008|\u0010<J\u0015\u0010~\u001a\u00020}2\u0006\u0010K\u001a\u00020\u0002\u00a2\u0006\u0004\u0008~\u0010\u007fJ\u001a\u0010\u0081\u0001\u001a\u00020\u00102\u0007\u0010\u0080\u0001\u001a\u00020\u000bH\u0010\u00a2\u0006\u0005\u0008\u0081\u0001\u0010rJ\u001b\u0010\u0082\u0001\u001a\u00020\u00102\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0014\u00a2\u0006\u0005\u0008\u0082\u0001\u0010rJ\u001a\u0010\u0083\u0001\u001a\u00020\u00152\u0007\u0010\u0080\u0001\u001a\u00020\u000bH\u0014\u00a2\u0006\u0005\u0008\u0083\u0001\u0010 J\u001c\u0010\u0084\u0001\u001a\u00020\u00102\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0006\u0008\u0084\u0001\u0010\u0085\u0001J\u001c\u0010\u0086\u0001\u001a\u00020\u00102\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0006\u0008\u0086\u0001\u0010\u0085\u0001J\u0011\u0010\u0087\u0001\u001a\u00020TH\u0016\u00a2\u0006\u0005\u0008\u0087\u0001\u0010pJ\u0011\u0010\u0088\u0001\u001a\u00020TH\u0007\u00a2\u0006\u0005\u0008\u0088\u0001\u0010pJ\u0011\u0010\u0089\u0001\u001a\u00020TH\u0010\u00a2\u0006\u0005\u0008\u0089\u0001\u0010pJ\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0004H\u0000\u00a2\u0006\u0006\u0008\u008a\u0001\u0010\u008b\u0001J\u0017\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0004H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0005\u0008\u008c\u0001\u0010:JZ\u0010\u0094\u0001\u001a\u00020\u0010\"\u0005\u0008\u0000\u0010\u008d\u0001\"\u0005\u0008\u0001\u0010\u008e\u00012\u000e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u008f\u00012%\u0010\u0093\u0001\u001a \u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0092\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0091\u0001H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u0094\u0001\u0010\u0095\u0001JZ\u0010\u0096\u0001\u001a\u00020\u0010\"\u0005\u0008\u0000\u0010\u008d\u0001\"\u0005\u0008\u0001\u0010\u008e\u00012\u000e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u008f\u00012%\u0010\u0093\u0001\u001a \u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0092\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0091\u0001H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0095\u0001R\u001e\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0097\u0001\u0010>R\u0019\u0010\u009c\u0001\u001a\u0007\u0012\u0002\u0008\u00030\u0099\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001R.\u0010\u00a2\u0001\u001a\u0004\u0018\u00010}2\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010}8@@@X\u0080\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u009e\u0001\u0010\u009f\u0001\"\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00a3\u0001\u0010\u008b\u0001R\u0016\u0010\u00a5\u0001\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a4\u0001\u00108R\u0013\u0010\u00a7\u0001\u001a\u00020\u00158F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a6\u0001\u00108R\u0013\u0010\u00a8\u0001\u001a\u00020\u00158F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a8\u0001\u00108R\u0016\u0010\u00aa\u0001\u001a\u00020\u00158PX\u0090\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a9\u0001\u00108R\u001b\u0010\u00ae\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010\u00ab\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001R\u0016\u0010\u00b0\u0001\u001a\u00020\u00158TX\u0094\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00af\u0001\u00108R\u0016\u0010\u00b2\u0001\u001a\u00020\u00158PX\u0090\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00b1\u0001\u00108\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u00b7\u0001"
    }
    d2 = {
        "LSh2;",
        "Lzh2;",
        "LLi0;",
        "LVE3;",
        "",
        "LSh2$c;",
        "state",
        "proposedUpdate",
        "k0",
        "(LSh2$c;Ljava/lang/Object;)Ljava/lang/Object;",
        "",
        "",
        "exceptions",
        "o0",
        "(LSh2$c;Ljava/util/List;)Ljava/lang/Throwable;",
        "rootCause",
        "",
        "V",
        "(Ljava/lang/Throwable;Ljava/util/List;)V",
        "Li12;",
        "update",
        "",
        "W0",
        "(Li12;Ljava/lang/Object;)Z",
        "h0",
        "(Li12;Ljava/lang/Object;)V",
        "LM83;",
        "list",
        "cause",
        "G0",
        "(LM83;Ljava/lang/Throwable;)V",
        "e0",
        "(Ljava/lang/Throwable;)Z",
        "H0",
        "",
        "R0",
        "(Ljava/lang/Object;)I",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "Lkotlinx/coroutines/CompletionHandler;",
        "handler",
        "onCancelling",
        "LPh2;",
        "D0",
        "(Lkotlin/jvm/functions/Function1;Z)LPh2;",
        "expect",
        "node",
        "U",
        "(Ljava/lang/Object;LM83;LPh2;)Z",
        "LMa1;",
        "L0",
        "(LMa1;)V",
        "M0",
        "(LPh2;)V",
        "y0",
        "()Z",
        "z0",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "d0",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "j0",
        "(Ljava/lang/Object;)Ljava/lang/Throwable;",
        "A0",
        "r0",
        "(Li12;)LM83;",
        "X0",
        "(Li12;Ljava/lang/Throwable;)Z",
        "Y0",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "Z0",
        "(Li12;Ljava/lang/Object;)Ljava/lang/Object;",
        "LKi0;",
        "l0",
        "(Li12;)LKi0;",
        "child",
        "a1",
        "(LSh2$c;LKi0;Ljava/lang/Object;)Z",
        "lastChild",
        "i0",
        "(LSh2$c;LKi0;Ljava/lang/Object;)V",
        "Lbx2;",
        "F0",
        "(Lbx2;)LKi0;",
        "",
        "S0",
        "(Ljava/lang/Object;)Ljava/lang/String;",
        "Z",
        "parent",
        "w0",
        "(Lzh2;)V",
        "start",
        "K0",
        "()V",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "F",
        "()Ljava/util/concurrent/CancellationException;",
        "message",
        "T0",
        "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;",
        "Lo51;",
        "n",
        "(Lkotlin/jvm/functions/Function1;)Lo51;",
        "invokeImmediately",
        "D",
        "(ZZLkotlin/jvm/functions/Function1;)Lo51;",
        "P",
        "O0",
        "f",
        "(Ljava/util/concurrent/CancellationException;)V",
        "f0",
        "()Ljava/lang/String;",
        "c0",
        "(Ljava/lang/Throwable;)V",
        "parentJob",
        "z",
        "(LVE3;)V",
        "g0",
        "a0",
        "b0",
        "(Ljava/lang/Object;)Z",
        "O",
        "B0",
        "C0",
        "LJi0;",
        "Q",
        "(LLi0;)LJi0;",
        "exception",
        "v0",
        "I0",
        "u0",
        "J0",
        "(Ljava/lang/Object;)V",
        "W",
        "toString",
        "V0",
        "E0",
        "m0",
        "()Ljava/lang/Object;",
        "Y",
        "T",
        "R",
        "Lrr5;",
        "select",
        "Lkotlin/Function2;",
        "Lkotlin/coroutines/Continuation;",
        "block",
        "N0",
        "(Lrr5;Lkotlin/jvm/functions/Function2;)V",
        "P0",
        "n0",
        "exceptionOrNull",
        "Lkotlin/coroutines/CoroutineContext$Key;",
        "getKey",
        "()Lkotlin/coroutines/CoroutineContext$Key;",
        "key",
        "value",
        "s0",
        "()LJi0;",
        "Q0",
        "(LJi0;)V",
        "parentHandle",
        "t0",
        "b",
        "isActive",
        "c",
        "isCompleted",
        "isCancelled",
        "q0",
        "onCancelComplete",
        "Lkotlin/sequences/Sequence;",
        "d",
        "()Lkotlin/sequences/Sequence;",
        "children",
        "x0",
        "isScopedCoroutine",
        "p0",
        "handlesException",
        "active",
        "<init>",
        "(Z)V",
        "a",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final synthetic b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _parentHandle:Ljava/lang/Object;

.field private volatile synthetic _state:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_state"

    const-class v2, LSh2;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LSh2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-static {}, LTh2;->c()LMa1;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, LTh2;->d()LMa1;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LSh2;->_state:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, LSh2;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic N(LSh2;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, LSh2;->f0()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic T(LSh2;LSh2$c;LKi0;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LSh2;->i0(LSh2$c;LKi0;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic U0(LSh2;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LSh2;->T0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toCancellationException"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final A0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, LSh2$c;

    if-eqz v3, :cond_7

    monitor-enter v2

    :try_start_0
    move-object v3, v2

    check-cast v3, LSh2$c;

    invoke-virtual {v3}, LSh2$c;->i()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, LTh2;->f()LuX5;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object p1

    :cond_1
    :try_start_1
    move-object v3, v2

    check-cast v3, LSh2$c;

    invoke-virtual {v3}, LSh2$c;->g()Z

    move-result v3

    if-nez p1, :cond_2

    if-nez v3, :cond_4

    :cond_2
    if-nez v1, :cond_3

    invoke-virtual {p0, p1}, LSh2;->j0(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_3
    move-object p1, v2

    check-cast p1, LSh2$c;

    invoke-virtual {p1, v1}, LSh2$c;->a(Ljava/lang/Throwable;)V

    :cond_4
    move-object p1, v2

    check-cast p1, LSh2$c;

    invoke-virtual {p1}, LSh2$c;->f()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v3, 0x1

    if-eqz v1, :cond_5

    move-object v0, p1

    :cond_5
    monitor-exit v2

    if-eqz v0, :cond_6

    check-cast v2, LSh2$c;

    invoke-virtual {v2}, LSh2$c;->e()LM83;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, LSh2;->G0(LM83;Ljava/lang/Throwable;)V

    :cond_6
    invoke-static {}, LTh2;->a()LuX5;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_7
    instance-of v3, v2, Li12;

    if-eqz v3, :cond_b

    if-nez v1, :cond_8

    invoke-virtual {p0, p1}, LSh2;->j0(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_8
    move-object v3, v2

    check-cast v3, Li12;

    invoke-interface {v3}, Li12;->b()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {p0, v3, v1}, LSh2;->X0(Li12;Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, LTh2;->a()LuX5;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance v3, Lqs0;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v3, v1, v4, v5, v0}, Lqs0;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v2, v3}, LSh2;->Y0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, LTh2;->a()LuX5;

    move-result-object v4

    if-eq v3, v4, :cond_a

    invoke-static {}, LTh2;->b()LuX5;

    move-result-object v2

    if-eq v3, v2, :cond_0

    return-object v3

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot happen in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {}, LTh2;->f()LuX5;

    move-result-object p1

    return-object p1
.end method

.method public final B0(Ljava/lang/Object;)Z
    .locals 3

    :cond_0
    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, LSh2;->Y0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LTh2;->a()LuX5;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object v1, LTh2;->b:LuX5;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    return v2

    :cond_2
    invoke-static {}, LTh2;->b()LuX5;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, LSh2;->W(Ljava/lang/Object;)V

    return v2
.end method

.method public final C0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    :cond_0
    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, LSh2;->Y0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LTh2;->a()LuX5;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, LTh2;->b()LuX5;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Job "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, LSh2;->n0(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final D(ZZLkotlin/jvm/functions/Function1;)Lo51;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)",
            "Lo51;"
        }
    .end annotation

    invoke-virtual {p0, p3, p1}, LSh2;->D0(Lkotlin/jvm/functions/Function1;Z)LPh2;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LMa1;

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, LMa1;

    invoke-virtual {v2}, LMa1;->b()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v2, LSh2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v1, v0}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    invoke-virtual {p0, v2}, LSh2;->L0(LMa1;)V

    goto :goto_0

    :cond_2
    instance-of v2, v1, Li12;

    const/4 v3, 0x0

    if-eqz v2, :cond_c

    move-object v2, v1

    check-cast v2, Li12;

    invoke-interface {v2}, Li12;->e()LM83;

    move-result-object v2

    if-nez v2, :cond_4

    if-eqz v1, :cond_3

    check-cast v1, LPh2;

    invoke-virtual {p0, v1}, LSh2;->M0(LPh2;)V

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    sget-object v4, LW83;->b:LW83;

    if-eqz p1, :cond_9

    instance-of v5, v1, LSh2$c;

    if-eqz v5, :cond_9

    monitor-enter v1

    :try_start_0
    move-object v3, v1

    check-cast v3, LSh2$c;

    invoke-virtual {v3}, LSh2$c;->f()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_5

    instance-of v5, p3, LKi0;

    if-eqz v5, :cond_8

    move-object v5, v1

    check-cast v5, LSh2$c;

    invoke-virtual {v5}, LSh2$c;->h()Z

    move-result v5

    if-nez v5, :cond_8

    :cond_5
    invoke-virtual {p0, v1, v2, v0}, LSh2;->U(Ljava/lang/Object;LM83;LPh2;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_6

    monitor-exit v1

    goto :goto_0

    :cond_6
    if-nez v3, :cond_7

    monitor-exit v1

    return-object v0

    :cond_7
    move-object v4, v0

    :cond_8
    :try_start_1
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_9
    :goto_1
    if-eqz v3, :cond_b

    if-eqz p2, :cond_a

    invoke-interface {p3, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    return-object v4

    :cond_b
    invoke-virtual {p0, v1, v2, v0}, LSh2;->U(Ljava/lang/Object;LM83;LPh2;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_c
    if-eqz p2, :cond_f

    instance-of p1, v1, Lqs0;

    if-eqz p1, :cond_d

    check-cast v1, Lqs0;

    goto :goto_2

    :cond_d
    move-object v1, v3

    :goto_2
    if-eqz v1, :cond_e

    iget-object v3, v1, Lqs0;->a:Ljava/lang/Throwable;

    :cond_e
    invoke-interface {p3, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    sget-object p1, LW83;->b:LW83;

    return-object p1
.end method

.method public final D0(Lkotlin/jvm/functions/Function1;Z)LPh2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;Z)",
            "LPh2;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    instance-of p2, p1, LAh2;

    if-eqz p2, :cond_0

    move-object v0, p1

    check-cast v0, LAh2;

    :cond_0
    if-nez v0, :cond_4

    new-instance v0, LU92;

    invoke-direct {v0, p1}, LU92;-><init>(Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_1
    instance-of p2, p1, LPh2;

    if-eqz p2, :cond_2

    move-object v0, p1

    check-cast v0, LPh2;

    :cond_2
    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, LV92;

    invoke-direct {v0, p1}, LV92;-><init>(Lkotlin/jvm/functions/Function1;)V

    :cond_4
    :goto_0
    invoke-virtual {v0, p0}, LPh2;->R(LSh2;)V

    return-object v0
.end method

.method public E0()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LdV0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final F()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LSh2$c;

    const-string v2, "Job is still new or active: "

    if-eqz v1, :cond_1

    check-cast v0, LSh2$c;

    invoke-virtual {v0}, LSh2$c;->f()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LdV0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is cancelling"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LSh2;->T0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v1, v0, Li12;

    if-nez v1, :cond_3

    instance-of v1, v0, Lqs0;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lqs0;

    iget-object v0, v0, Lqs0;->a:Ljava/lang/Throwable;

    const/4 v1, 0x1

    invoke-static {p0, v0, v2, v1, v2}, LSh2;->U0(LSh2;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Lkotlinx/coroutines/JobCancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LdV0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " has completed normally"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lzh2;)V

    :goto_0
    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final F0(Lbx2;)LKi0;
    .locals 1

    :goto_0
    invoke-virtual {p1}, Lbx2;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lbx2;->E()Lbx2;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lbx2;->D()Lbx2;

    move-result-object p1

    invoke-virtual {p1}, Lbx2;->I()Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p1, LKi0;

    if-eqz v0, :cond_1

    check-cast p1, LKi0;

    return-object p1

    :cond_1
    instance-of v0, p1, LM83;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final G0(LM83;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p0, p2}, LSh2;->I0(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Lbx2;->A()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbx2;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, LAh2;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, LPh2;

    :try_start_0
    invoke-virtual {v2, p2}, Lss0;->P(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception in completion handler "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lbx2;->D()Lbx2;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, LSh2;->v0(Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {p0, p2}, LSh2;->e0(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final H0(LM83;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p1}, Lbx2;->A()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbx2;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, LPh2;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, LPh2;

    :try_start_0
    invoke-virtual {v2, p2}, Lss0;->P(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception in completion handler "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lbx2;->D()Lbx2;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, LSh2;->v0(Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public I0(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public J0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public K0()V
    .locals 0

    return-void
.end method

.method public final L0(LMa1;)V
    .locals 2

    new-instance v0, LM83;

    invoke-direct {v0}, LM83;-><init>()V

    invoke-virtual {p1}, LMa1;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, La02;

    invoke-direct {v1, v0}, La02;-><init>(LM83;)V

    move-object v0, v1

    :goto_0
    sget-object v1, LSh2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final M0(LPh2;)V
    .locals 2

    new-instance v0, LM83;

    invoke-direct {v0}, LM83;-><init>()V

    invoke-virtual {p1, v0}, Lbx2;->w(Lbx2;)Z

    invoke-virtual {p1}, Lbx2;->D()Lbx2;

    move-result-object v0

    sget-object v1, LSh2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final N0(Lrr5;Lkotlin/jvm/functions/Function2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lrr5<",
            "-TR;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    :cond_0
    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Lrr5;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    instance-of v1, v0, Li12;

    if-nez v1, :cond_4

    invoke-interface {p1}, Lrr5;->l()Z

    move-result v1

    if-eqz v1, :cond_3

    instance-of v1, v0, Lqs0;

    if-eqz v1, :cond_2

    check-cast v0, Lqs0;

    iget-object p2, v0, Lqs0;->a:Ljava/lang/Throwable;

    invoke-interface {p1, p2}, Lrr5;->o(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    invoke-static {v0}, LTh2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Lrr5;->m()Lkotlin/coroutines/Continuation;

    move-result-object p1

    invoke-static {p2, v0, p1}, LFd6;->b(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    :cond_3
    :goto_0
    return-void

    :cond_4
    invoke-virtual {p0, v0}, LSh2;->R0(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ler5;

    invoke-direct {v0, p1, p2}, Ler5;-><init>(Lrr5;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {p0, v0}, LSh2;->n(Lkotlin/jvm/functions/Function1;)Lo51;

    move-result-object p2

    invoke-interface {p1, p2}, Lrr5;->j(Lo51;)V

    return-void
.end method

.method public O()Ljava/util/concurrent/CancellationException;
    .locals 5

    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LSh2$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, LSh2$c;

    invoke-virtual {v1}, LSh2$c;->f()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lqs0;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lqs0;

    iget-object v1, v1, Lqs0;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Li12;

    if-nez v1, :cond_4

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, Lkotlinx/coroutines/JobCancellationException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Parent job is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, LSh2;->S0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lzh2;)V

    :cond_3
    return-object v2

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot be cancelling child in this state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final O0(LPh2;)V
    .locals 3

    :cond_0
    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LPh2;

    if-eqz v1, :cond_2

    if-eq v0, p1, :cond_1

    return-void

    :cond_1
    sget-object v1, LSh2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LTh2;->c()LMa1;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_2
    instance-of v1, v0, Li12;

    if-eqz v1, :cond_3

    check-cast v0, Li12;

    invoke-interface {v0}, Li12;->e()LM83;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lbx2;->J()Z

    :cond_3
    return-void
.end method

.method public final P(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

    invoke-virtual {p0}, LSh2;->y0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, LKh2;->m(Lkotlin/coroutines/CoroutineContext;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, LSh2;->z0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final P0(Lrr5;Lkotlin/jvm/functions/Function2;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lrr5<",
            "-TR;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lqs0;

    if-eqz v1, :cond_0

    check-cast v0, Lqs0;

    iget-object p2, v0, Lqs0;->a:Ljava/lang/Throwable;

    invoke-interface {p1, p2}, Lrr5;->o(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {v0}, LTh2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Lrr5;->m()Lkotlin/coroutines/Continuation;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lad0;->e(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final Q(LLi0;)LJi0;
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    new-instance v3, LKi0;

    invoke-direct {v3, p1}, LKi0;-><init>(LLi0;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lzh2$a;->d(Lzh2;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lo51;

    move-result-object p1

    check-cast p1, LJi0;

    return-object p1
.end method

.method public final Q0(LJi0;)V
    .locals 0

    iput-object p1, p0, LSh2;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method public final R0(Ljava/lang/Object;)I
    .locals 4

    instance-of v0, p1, LMa1;

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, LMa1;

    invoke-virtual {v0}, LMa1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_0
    sget-object v0, LSh2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LTh2;->c()LMa1;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, LSh2;->K0()V

    return v2

    :cond_2
    instance-of v0, p1, La02;

    if-eqz v0, :cond_4

    sget-object v0, LSh2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-object v3, p1

    check-cast v3, La02;

    invoke-virtual {v3}, La02;->e()LM83;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, LSh2;->K0()V

    return v2

    :cond_4
    return v3
.end method

.method public final S0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p1, LSh2$c;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p1, LSh2$c;

    invoke-virtual {p1}, LSh2$c;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LSh2$c;->h()Z

    move-result p1

    if-eqz p1, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p1, Li12;

    if-eqz v0, :cond_3

    check-cast p1, Li12;

    invoke-interface {p1}, Li12;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lqs0;

    if-eqz p1, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method

.method public final T0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;
    .locals 1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    new-instance v0, Lkotlinx/coroutines/JobCancellationException;

    if-nez p2, :cond_1

    invoke-static {p0}, LSh2;->N(LSh2;)Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-direct {v0, p2, p1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lzh2;)V

    :cond_2
    return-object v0
.end method

.method public final U(Ljava/lang/Object;LM83;LPh2;)Z
    .locals 2

    new-instance v0, LSh2$d;

    invoke-direct {v0, p3, p0, p1}, LSh2$d;-><init>(Lbx2;LSh2;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p2}, Lbx2;->E()Lbx2;

    move-result-object p1

    invoke-virtual {p1, p3, p2, v0}, Lbx2;->O(Lbx2;Lbx2;Lbx2$b;)I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    return v1
.end method

.method public final V(Ljava/lang/Throwable;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1, v0}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-eq v1, p1, :cond_1

    if-eq v1, p1, :cond_1

    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v1}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final V0()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LSh2;->E0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, LSh2;->S0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public W(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final W0(Li12;Ljava/lang/Object;)Z
    .locals 2

    sget-object v0, LSh2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, LTh2;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LSh2;->I0(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p2}, LSh2;->J0(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, LSh2;->h0(Li12;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final X0(Li12;Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0, p1}, LSh2;->r0(Li12;)LM83;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    new-instance v2, LSh2$c;

    invoke-direct {v2, v0, v1, p2}, LSh2$c;-><init>(LM83;ZLjava/lang/Throwable;)V

    sget-object v3, LSh2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, p1, v2}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0, v0, p2}, LSh2;->G0(LM83;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final Y(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :cond_0
    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Li12;

    if-nez v1, :cond_2

    instance-of p1, v0, Lqs0;

    if-nez p1, :cond_1

    invoke-static {v0}, LTh2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    check-cast v0, Lqs0;

    iget-object p1, v0, Lqs0;->a:Ljava/lang/Throwable;

    throw p1

    :cond_2
    invoke-virtual {p0, v0}, LSh2;->R0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p0, p1}, LSh2;->Z(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final Y0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Li12;

    if-nez v0, :cond_0

    invoke-static {}, LTh2;->a()LuX5;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, LMa1;

    if-nez v0, :cond_1

    instance-of v0, p1, LPh2;

    if-eqz v0, :cond_3

    :cond_1
    instance-of v0, p1, LKi0;

    if-nez v0, :cond_3

    instance-of v0, p2, Lqs0;

    if-nez v0, :cond_3

    check-cast p1, Li12;

    invoke-virtual {p0, p1, p2}, LSh2;->W0(Li12;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object p2

    :cond_2
    invoke-static {}, LTh2;->b()LuX5;

    move-result-object p1

    return-object p1

    :cond_3
    check-cast p1, Li12;

    invoke-virtual {p0, p1, p2}, LSh2;->Z0(Li12;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final Z(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LSh2$a;

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {v0, v1, p0}, LSh2$a;-><init>(Lkotlin/coroutines/Continuation;LSh2;)V

    invoke-virtual {v0}, LXc0;->u()V

    new-instance v1, LjN4;

    invoke-direct {v1, v0}, LjN4;-><init>(LXc0;)V

    invoke-virtual {p0, v1}, LSh2;->n(Lkotlin/jvm/functions/Function1;)Lo51;

    move-result-object v1

    invoke-static {v0, v1}, LZc0;->a(LWc0;Lo51;)V

    invoke-virtual {v0}, LXc0;->q()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object v0
.end method

.method public final Z0(Li12;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0, p1}, LSh2;->r0(Li12;)LM83;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, LTh2;->b()LuX5;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, p1, LSh2$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, LSh2$c;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    const/4 v3, 0x0

    if-nez v1, :cond_2

    new-instance v1, LSh2$c;

    invoke-direct {v1, v0, v3, v2}, LSh2$c;-><init>(LM83;ZLjava/lang/Throwable;)V

    :cond_2
    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, LSh2$c;->h()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {}, LTh2;->a()LuX5;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_3
    const/4 v5, 0x1

    :try_start_1
    invoke-virtual {v1, v5}, LSh2$c;->k(Z)V

    if-eq v1, p1, :cond_4

    sget-object v6, LSh2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v6, p0, p1, v1}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-static {}, LTh2;->b()LuX5;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_4
    :try_start_2
    invoke-virtual {v1}, LSh2$c;->g()Z

    move-result v6

    instance-of v7, p2, Lqs0;

    if-eqz v7, :cond_5

    move-object v7, p2

    check-cast v7, Lqs0;

    goto :goto_1

    :cond_5
    move-object v7, v2

    :goto_1
    if-eqz v7, :cond_6

    iget-object v7, v7, Lqs0;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v7}, LSh2$c;->a(Ljava/lang/Throwable;)V

    :cond_6
    invoke-virtual {v1}, LSh2$c;->f()Ljava/lang/Throwable;

    move-result-object v7

    if-nez v6, :cond_7

    move v3, v5

    :cond_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_8

    move-object v2, v7

    :cond_8
    iput-object v2, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    if-eqz v2, :cond_9

    invoke-virtual {p0, v0, v2}, LSh2;->G0(LM83;Ljava/lang/Throwable;)V

    :cond_9
    invoke-virtual {p0, p1}, LSh2;->l0(Li12;)LKi0;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p0, v1, p1, p2}, LSh2;->a1(LSh2$c;LKi0;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object p1, LTh2;->b:LuX5;

    return-object p1

    :cond_a
    invoke-virtual {p0, v1, p2}, LSh2;->k0(LSh2$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final a0(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-virtual {p0, p1}, LSh2;->b0(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final a1(LSh2$c;LKi0;Ljava/lang/Object;)Z
    .locals 6

    :cond_0
    iget-object v0, p2, LKi0;->f:LLi0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, LSh2$b;

    invoke-direct {v3, p0, p1, p2, p3}, LSh2$b;-><init>(LSh2;LSh2$c;LKi0;Ljava/lang/Object;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lzh2$a;->d(Lzh2;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lo51;

    move-result-object v0

    sget-object v1, LW83;->b:LW83;

    if-eq v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {p0, p2}, LSh2;->F0(Lbx2;)LKi0;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public b()Z
    .locals 2

    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Li12;

    if-eqz v1, :cond_0

    check-cast v0, Li12;

    invoke-interface {v0}, Li12;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b0(Ljava/lang/Object;)Z
    .locals 3

    invoke-static {}, LTh2;->a()LuX5;

    move-result-object v0

    invoke-virtual {p0}, LSh2;->q0()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, LSh2;->d0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LTh2;->b:LuX5;

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-static {}, LTh2;->a()LuX5;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1}, LSh2;->A0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_1
    invoke-static {}, LTh2;->a()LuX5;

    move-result-object p1

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, LTh2;->b:LuX5;

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, LTh2;->f()LuX5;

    move-result-object p1

    if-ne v0, p1, :cond_4

    const/4 v2, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v0}, LSh2;->W(Ljava/lang/Object;)V

    :goto_0
    return v2
.end method

.method public final c()Z
    .locals 1

    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Li12;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public c0(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, LSh2;->b0(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d()Lkotlin/sequences/Sequence;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lzh2;",
            ">;"
        }
    .end annotation

    new-instance v0, LSh2$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LSh2$e;-><init>(LSh2;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequence(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;

    move-result-object v0

    return-object v0
.end method

.method public final d0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    :cond_0
    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Li12;

    if-eqz v1, :cond_2

    instance-of v1, v0, LSh2$c;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, LSh2$c;

    invoke-virtual {v1}, LSh2$c;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lqs0;

    invoke-virtual {p0, p1}, LSh2;->j0(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v2, v5, v3, v4}, Lqs0;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0, v1}, LSh2;->Y0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LTh2;->b()LuX5;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_2
    :goto_0
    invoke-static {}, LTh2;->a()LuX5;

    move-result-object p1

    return-object p1
.end method

.method public final e0(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0}, LSh2;->x0()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    invoke-virtual {p0}, LSh2;->s0()LJi0;

    move-result-object v2

    if-eqz v2, :cond_4

    sget-object v3, LW83;->b:LW83;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, LJi0;->d(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method public f(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    invoke-static {p0}, LSh2;->N(LSh2;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lzh2;)V

    :cond_0
    invoke-virtual {p0, p1}, LSh2;->c0(Ljava/lang/Throwable;)V

    return-void
.end method

.method public f0()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public fold(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lkotlin/jvm/functions/Function2<",
            "-TR;-",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lzh2$a;->b(Lzh2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g0(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, LSh2;->b0(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LSh2;->p0()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            ">(",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lzh2$a;->c(Lzh2;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lkotlin/coroutines/CoroutineContext$Key;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lzh2;->a0:Lzh2$b;

    return-object v0
.end method

.method public final h0(Li12;Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0}, LSh2;->s0()LJi0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lo51;->dispose()V

    sget-object v0, LW83;->b:LW83;

    invoke-virtual {p0, v0}, LSh2;->Q0(LJi0;)V

    :cond_0
    instance-of v0, p2, Lqs0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lqs0;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object v1, p2, Lqs0;->a:Ljava/lang/Throwable;

    :cond_2
    instance-of p2, p1, LPh2;

    if-eqz p2, :cond_3

    :try_start_0
    move-object p2, p1

    check-cast p2, LPh2;

    invoke-virtual {p2, v1}, Lss0;->P(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    new-instance v0, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in completion handler "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, LSh2;->v0(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Li12;->e()LM83;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0, p1, v1}, LSh2;->H0(LM83;Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final i0(LSh2$c;LKi0;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p2}, LSh2;->F0(Lbx2;)LKi0;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1, p2, p3}, LSh2;->a1(LSh2$c;LKi0;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1, p3}, LSh2;->k0(LSh2$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LSh2;->W(Ljava/lang/Object;)V

    return-void
.end method

.method public final isCancelled()Z
    .locals 2

    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lqs0;

    if-nez v1, :cond_1

    instance-of v1, v0, LSh2$c;

    if-eqz v1, :cond_0

    check-cast v0, LSh2$c;

    invoke-virtual {v0}, LSh2$c;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final j0(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_2

    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    invoke-static {p0}, LSh2;->N(LSh2;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lzh2;)V

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_3

    check-cast p1, LVE3;

    invoke-interface {p1}, LVE3;->O()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    :cond_2
    :goto_1
    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k0(LSh2$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lqs0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lqs0;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lqs0;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, LSh2$c;->g()Z

    move-result v2

    invoke-virtual {p1, v0}, LSh2$c;->j(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0, p1, v3}, LSh2;->o0(LSh2$c;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {p0, v4, v3}, LSh2;->V(Ljava/lang/Throwable;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p1

    const/4 v3, 0x0

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    if-ne v4, v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance p2, Lqs0;

    const/4 v0, 0x2

    invoke-direct {p2, v4, v3, v0, v1}, Lqs0;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    if-eqz v4, :cond_8

    invoke-virtual {p0, v4}, LSh2;->e0(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0, v4}, LSh2;->u0(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    const/4 v3, 0x1

    :cond_6
    if-eqz v3, :cond_8

    if-eqz p2, :cond_7

    move-object v0, p2

    check-cast v0, Lqs0;

    invoke-virtual {v0}, Lqs0;->b()Z

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_3
    if-nez v2, :cond_9

    invoke-virtual {p0, v4}, LSh2;->I0(Ljava/lang/Throwable;)V

    :cond_9
    invoke-virtual {p0, p2}, LSh2;->J0(Ljava/lang/Object;)V

    sget-object v0, LSh2;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, LTh2;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Li1;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {p0, p1, p2}, LSh2;->h0(Li12;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method public final l0(Li12;)LKi0;
    .locals 2

    instance-of v0, p1, LKi0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LKi0;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    invoke-interface {p1}, Li12;->e()LM83;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, LSh2;->F0(Lbx2;)LKi0;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :cond_2
    :goto_1
    return-object v1
.end method

.method public final m0()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Li12;

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    instance-of v1, v0, Lqs0;

    if-nez v1, :cond_0

    invoke-static {v0}, LTh2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Lqs0;

    iget-object v0, v0, Lqs0;->a:Ljava/lang/Throwable;

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public minusKey(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "*>;)",
            "Lkotlin/coroutines/CoroutineContext;"
        }
    .end annotation

    invoke-static {p0, p1}, Lzh2$a;->e(Lzh2;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lkotlin/jvm/functions/Function1;)Lo51;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)",
            "Lo51;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, p1}, LSh2;->D(ZZLkotlin/jvm/functions/Function1;)Lo51;

    move-result-object p1

    return-object p1
.end method

.method public final n0(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, Lqs0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lqs0;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p1, Lqs0;->a:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method public final o0(LSh2$c;Ljava/util/List;)Ljava/lang/Throwable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSh2$c;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LSh2$c;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    invoke-static {p0}, LSh2;->N(LSh2;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lzh2;)V

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    move-object p1, p2

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/Throwable;

    instance-of v4, v4, Ljava/util/concurrent/CancellationException;

    xor-int/2addr v4, v3

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_3
    move-object v2, v1

    :goto_0
    check-cast v2, Ljava/lang/Throwable;

    if-eqz v2, :cond_4

    return-object v2

    :cond_4
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Throwable;

    instance-of v2, p2, Lkotlinx/coroutines/TimeoutCancellationException;

    if-eqz v2, :cond_8

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/Throwable;

    if-eq v4, p2, :cond_6

    instance-of v4, v4, Lkotlinx/coroutines/TimeoutCancellationException;

    if-eqz v4, :cond_6

    move v4, v3

    goto :goto_1

    :cond_6
    move v4, v0

    :goto_1
    if-eqz v4, :cond_5

    move-object v1, v2

    :cond_7
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_8

    return-object v1

    :cond_8
    return-object p2
.end method

.method public p0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    invoke-static {p0, p1}, Lzh2$a;->f(Lzh2;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    return-object p1
.end method

.method public q0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final r0(Li12;)LM83;
    .locals 3

    invoke-interface {p1}, Li12;->e()LM83;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, LMa1;

    if-eqz v0, :cond_0

    new-instance v0, LM83;

    invoke-direct {v0}, LM83;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LPh2;

    if-eqz v0, :cond_1

    check-cast p1, LPh2;

    invoke-virtual {p0, p1}, LSh2;->M0(LPh2;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State should have list: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final s0()LJi0;
    .locals 1

    iget-object v0, p0, LSh2;->_parentHandle:Ljava/lang/Object;

    check-cast v0, LJi0;

    return-object v0
.end method

.method public final start()Z
    .locals 2

    :goto_0
    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LSh2;->R0(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final t0()Ljava/lang/Object;
    .locals 2

    :goto_0
    iget-object v0, p0, LSh2;->_state:Ljava/lang/Object;

    instance-of v1, v0, LGh3;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    check-cast v0, LGh3;

    invoke-virtual {v0, p0}, LGh3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LSh2;->V0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LdV0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u0(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public v0(Ljava/lang/Throwable;)V
    .locals 0

    throw p1
.end method

.method public final w0(Lzh2;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, LW83;->b:LW83;

    invoke-virtual {p0, p1}, LSh2;->Q0(LJi0;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lzh2;->start()Z

    invoke-interface {p1, p0}, Lzh2;->Q(LLi0;)LJi0;

    move-result-object p1

    invoke-virtual {p0, p1}, LSh2;->Q0(LJi0;)V

    invoke-virtual {p0}, LSh2;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lo51;->dispose()V

    sget-object p1, LW83;->b:LW83;

    invoke-virtual {p0, p1}, LSh2;->Q0(LJi0;)V

    :cond_1
    return-void
.end method

.method public x0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final y0()Z
    .locals 2

    :cond_0
    invoke-virtual {p0}, LSh2;->t0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Li12;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-virtual {p0, v0}, LSh2;->R0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0
.end method

.method public final z(LVE3;)V
    .locals 0

    invoke-virtual {p0, p1}, LSh2;->b0(Ljava/lang/Object;)Z

    return-void
.end method

.method public final z0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
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

    new-instance v0, LXc0;

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LXc0;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {v0}, LXc0;->u()V

    new-instance v1, LkN4;

    invoke-direct {v1, v0}, LkN4;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v1}, LSh2;->n(Lkotlin/jvm/functions/Function1;)Lo51;

    move-result-object v1

    invoke-static {v0, v1}, LZc0;->a(LWc0;Lo51;)V

    invoke-virtual {v0}, LXc0;->q()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_1

    return-object v0

    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
