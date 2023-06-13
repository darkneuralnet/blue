.class public final synthetic LwY7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# static fields
.field public static final synthetic a:LwY7;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LwY7;

    invoke-direct {v0}, LwY7;-><init>()V

    sput-object v0, LwY7;->a:LwY7;

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

    new-instance v0, LF68;

    const-class v1, LLe8;

    invoke-interface {p1, v1}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLe8;

    const-class v2, LIh1;

    invoke-interface {p1, v2}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LIh1;

    invoke-direct {v0, v1, p1}, LF68;-><init>(LLe8;LIh1;)V

    return-object v0
.end method
