.class public final Lns5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\tR&\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0005\u0012\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lns5;",
        "",
        "Lrs5;",
        "",
        "b",
        "Lrs5;",
        "a",
        "()Lrs5;",
        "getTestTagsAsResourceId$annotations",
        "()V",
        "TestTagsAsResourceId",
        "<init>",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lns5;

.field public static final b:Lrs5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrs5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lns5;

    invoke-direct {v0}, Lns5;-><init>()V

    sput-object v0, Lns5;->a:Lns5;

    new-instance v0, Lrs5;

    const-string v1, "TestTagsAsResourceId"

    sget-object v2, Lns5$a;->g:Lns5$a;

    invoke-direct {v0, v1, v2}, Lrs5;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    sput-object v0, Lns5;->b:Lrs5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lrs5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrs5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object v0, Lns5;->b:Lrs5;

    return-object v0
.end method
