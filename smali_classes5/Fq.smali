.class public final LFq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFx0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFq$f;,
        LFq$d;,
        LFq$a;,
        LFq$c;,
        LFq$e;,
        LFq$b;
    }
.end annotation


# static fields
.field public static final a:LFx0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LFq;

    invoke-direct {v0}, LFq;-><init>()V

    sput-object v0, LFq;->a:LFx0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configure(Ltb1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltb1<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, LFq$b;->a:LFq$b;

    const-class v1, LPF;

    invoke-interface {p1, v1, v0}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v1, Lkt;

    invoke-interface {p1, v1, v0}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    sget-object v0, LFq$e;->a:LFq$e;

    const-class v1, Lqx2;

    invoke-interface {p1, v1, v0}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v1, LMt;

    invoke-interface {p1, v1, v0}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    sget-object v0, LFq$c;->a:LFq$c;

    const-class v1, LIk0;

    invoke-interface {p1, v1, v0}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v1, Lst;

    invoke-interface {p1, v1, v0}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    sget-object v0, LFq$a;->a:LFq$a;

    const-class v1, Lcc;

    invoke-interface {p1, v1, v0}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v1, Lct;

    invoke-interface {p1, v1, v0}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    sget-object v0, LFq$d;->a:LFq$d;

    const-class v1, Lnx2;

    invoke-interface {p1, v1, v0}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v1, LLt;

    invoke-interface {p1, v1, v0}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    sget-object v0, LFq$f;->a:LFq$f;

    const-class v1, LB73;

    invoke-interface {p1, v1, v0}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v1, LQt;

    invoke-interface {p1, v1, v0}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    return-void
.end method
