.class public final Lxs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFx0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxs$a;,
        Lxs$b;,
        Lxs$c;
    }
.end annotation


# static fields
.field public static final a:LFx0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxs;

    invoke-direct {v0}, Lxs;-><init>()V

    sput-object v0, Lxs;->a:LFx0;

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

    const-class v0, LD94;

    sget-object v1, Lxs$c;->a:Lxs$c;

    invoke-interface {p1, v0, v1}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v0, LCT2;

    sget-object v1, Lxs$b;->a:Lxs$b;

    invoke-interface {p1, v0, v1}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    const-class v0, LBT2;

    sget-object v1, Lxs$a;->a:Lxs$a;

    invoke-interface {p1, v0, v1}, Ltb1;->a(Ljava/lang/Class;LOd3;)Ltb1;

    return-void
.end method
