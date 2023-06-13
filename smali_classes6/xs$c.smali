.class public final Lxs$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LOd3<",
        "LD94;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lxs$c;

.field public static final b:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxs$c;

    invoke-direct {v0}, Lxs$c;-><init>()V

    sput-object v0, Lxs$c;->a:Lxs$c;

    const-string v0, "messagingClientEventExtension"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, Lxs$c;->b:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LD94;LPd3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Lxs$c;->b:LSk1;

    invoke-virtual {p1}, LD94;->b()LCT2;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LD94;

    check-cast p2, LPd3;

    invoke-virtual {p0, p1, p2}, Lxs$c;->a(LD94;LPd3;)V

    return-void
.end method
