.class public final synthetic LPo9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# static fields
.field public static final synthetic a:LPo9;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LPo9;

    invoke-direct {v0}, LPo9;-><init>()V

    sput-object v0, LPo9;->a:LPo9;

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

    new-instance v0, LZy5;

    const-class v1, Landroid/content/Context;

    invoke-interface {p1, v1}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-direct {v0, p1}, LZy5;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
