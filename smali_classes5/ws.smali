.class public final Lws;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFx0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lws$f;,
        Lws$b;,
        Lws$c;,
        Lws$d;,
        Lws$g;,
        Lws$a;,
        Lws$e;
    }
.end annotation


# static fields
.field public static final a:LFx0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lws;

    invoke-direct {v0}, Lws;-><init>()V

    sput-object v0, Lws;->a:LFx0;

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

    const-class v0, LE94;

    sget-object v1, Lws$e;->a:Lws$e;

    invoke-interface {p1, v0, v1}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v0, LJk0;

    sget-object v1, Lws$a;->a:Lws$a;

    invoke-interface {p1, v0, v1}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v0, Lq46;

    sget-object v1, Lws$g;->a:Lws$g;

    invoke-interface {p1, v0, v1}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v0, Lsx2;

    sget-object v1, Lws$d;->a:Lws$d;

    invoke-interface {p1, v0, v1}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v0, Lox2;

    sget-object v1, Lws$c;->a:Lws$c;

    invoke-interface {p1, v0, v1}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v0, LSC1;

    sget-object v1, Lws$b;->a:Lws$b;

    invoke-interface {p1, v0, v1}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v0, LdR5;

    sget-object v1, Lws$f;->a:Lws$f;

    invoke-interface {p1, v0, v1}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    return-void
.end method
