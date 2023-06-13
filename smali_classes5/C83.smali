.class public LC83;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG96;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC83$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LG96<",
        "TR;>;"
    }
.end annotation


# static fields
.field public static final a:LC83;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LC83<",
            "*>;"
        }
    .end annotation
.end field

.field public static final b:LI96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LI96<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LC83;

    invoke-direct {v0}, LC83;-><init>()V

    sput-object v0, LC83;->a:LC83;

    new-instance v0, LC83$a;

    invoke-direct {v0}, LC83$a;-><init>()V

    sput-object v0, LC83;->b:LI96;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()LG96;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">()",
            "LG96<",
            "TR;>;"
        }
    .end annotation

    sget-object v0, LC83;->a:LC83;

    return-object v0
.end method

.method public static c()LI96;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">()",
            "LI96<",
            "TR;>;"
        }
    .end annotation

    sget-object v0, LC83;->b:LI96;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;LG96$a;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
