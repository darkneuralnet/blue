.class public final synthetic LuY7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# static fields
.field public static final synthetic a:LuY7;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LuY7;

    invoke-direct {v0}, LuY7;-><init>()V

    sput-object v0, LuY7;->a:LuY7;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LIh1;

    const-class v1, LzU2;

    invoke-interface {p1, v1}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object p1

    invoke-direct {v0, p1}, LIh1;-><init>(LX94;)V

    return-object v0
.end method
