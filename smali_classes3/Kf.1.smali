.class public final LKf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LJf;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTo2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTo2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKf;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LKf;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTo2;",
            ">;)",
            "LKf;"
        }
    .end annotation

    new-instance v0, LKf;

    invoke-direct {v0, p0}, LKf;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LTo2;)LJf;
    .locals 1

    new-instance v0, LJf;

    invoke-direct {v0, p0}, LJf;-><init>(LTo2;)V

    return-object v0
.end method


# virtual methods
.method public b()LJf;
    .locals 1

    iget-object v0, p0, LKf;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTo2;

    invoke-static {v0}, LKf;->c(LTo2;)LJf;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LKf;->b()LJf;

    move-result-object v0

    return-object v0
.end method
