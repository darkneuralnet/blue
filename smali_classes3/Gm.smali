.class public final enum LGm;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGm$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LGm;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0001\u0018\u0000 \u00032\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\u0008\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0007j\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "LGm;",
        "",
        "",
        "c",
        "",
        "b",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "a",
        "d",
        "e",
        "f",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final c:LGm$a;

.field public static final enum d:LGm;

.field public static final enum e:LGm;

.field public static final enum f:LGm;

.field public static final synthetic g:[LGm;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LGm;

    const/4 v1, 0x0

    const-string v2, "archive"

    const-string v3, "ARCHIVE"

    invoke-direct {v0, v3, v1, v2}, LGm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LGm;->d:LGm;

    new-instance v0, LGm;

    const/4 v1, 0x1

    const-string v2, "hosted_url"

    const-string v3, "HOSTED"

    invoke-direct {v0, v3, v1, v2}, LGm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LGm;->e:LGm;

    new-instance v0, LGm;

    const/4 v1, 0x2

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, LGm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LGm;->f:LGm;

    invoke-static {}, LGm;->a()[LGm;

    move-result-object v0

    sput-object v0, LGm;->g:[LGm;

    new-instance v0, LGm$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LGm$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LGm;->c:LGm$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LGm;->b:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[LGm;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LGm;

    const/4 v1, 0x0

    sget-object v2, LGm;->d:LGm;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LGm;->e:LGm;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LGm;->f:LGm;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LGm;
    .locals 1

    const-class v0, LGm;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LGm;

    return-object p0
.end method

.method public static values()[LGm;
    .locals 1

    sget-object v0, LGm;->g:[LGm;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LGm;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LGm;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    sget-object v0, LGm;->e:LGm;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
