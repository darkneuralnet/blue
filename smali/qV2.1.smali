.class public final LqV2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LoV2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LoV2<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u00c2\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "LqV2;",
        "LoV2;",
        "",
        "LV94;",
        "c",
        "LV94;",
        "getKey",
        "()LV94;",
        "key",
        "d",
        "Z",
        "a",
        "()Ljava/lang/Boolean;",
        "value",
        "<init>",
        "()V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:LqV2;

.field public static final c:LV94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LV94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LqV2;

    invoke-direct {v0}, LqV2;-><init>()V

    sput-object v0, LqV2;->b:LqV2;

    invoke-static {}, LZp5;->g()LV94;

    move-result-object v0

    sput-object v0, LqV2;->c:LV94;

    const/4 v0, 0x1

    sput-boolean v0, LqV2;->d:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    sget-boolean v0, LqV2;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public getKey()LV94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LV94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object v0, LqV2;->c:LV94;

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LqV2;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
