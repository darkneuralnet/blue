.class public final LFq$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LOd3<",
        "LB73;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:LFq$f;

.field public static final b:LSk1;

.field public static final c:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LFq$f;

    invoke-direct {v0}, LFq$f;-><init>()V

    sput-object v0, LFq$f;->a:LFq$f;

    const-string v0, "networkType"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$f;->b:LSk1;

    const-string v0, "mobileSubtype"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$f;->c:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LB73;LPd3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LFq$f;->b:LSk1;

    invoke-virtual {p1}, LB73;->c()LB73$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$f;->c:LSk1;

    invoke-virtual {p1}, LB73;->b()LB73$b;

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

    check-cast p1, LB73;

    check-cast p2, LPd3;

    invoke-virtual {p0, p1, p2}, LFq$f;->a(LB73;LPd3;)V

    return-void
.end method
