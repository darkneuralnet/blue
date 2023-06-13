.class public final LFq$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LOd3<",
        "LPF;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:LFq$b;

.field public static final b:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LFq$b;

    invoke-direct {v0}, LFq$b;-><init>()V

    sput-object v0, LFq$b;->a:LFq$b;

    const-string v0, "logRequest"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$b;->b:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LPF;LPd3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LFq$b;->b:LSk1;

    invoke-virtual {p1}, LPF;->c()Ljava/util/List;

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

    check-cast p1, LPF;

    check-cast p2, LPd3;

    invoke-virtual {p0, p1, p2}, LFq$b;->a(LPF;LPd3;)V

    return-void
.end method
