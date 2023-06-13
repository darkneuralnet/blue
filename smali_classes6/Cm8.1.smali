.class public final synthetic LCm8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# static fields
.field public static final synthetic a:LCm8;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LCm8;

    invoke-direct {v0}, LCm8;-><init>()V

    sput-object v0, LCm8;->a:LCm8;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lmf7;

    const-class v1, LHC7;

    invoke-interface {p1, v1}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LHC7;

    const-class v2, LIh1;

    invoke-interface {p1, v2}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LIh1;

    invoke-direct {v0, v1, p1}, Lmf7;-><init>(LHC7;LIh1;)V

    return-object v0
.end method
