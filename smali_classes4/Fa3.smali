.class public final LFa3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LEa3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Leb3;",
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
            "Leb3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFa3;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LFa3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Leb3;",
            ">;)",
            "LFa3;"
        }
    .end annotation

    new-instance v0, LFa3;

    invoke-direct {v0, p0}, LFa3;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Leb3;)LEa3;
    .locals 1

    new-instance v0, LEa3;

    invoke-direct {v0, p0}, LEa3;-><init>(Leb3;)V

    return-object v0
.end method


# virtual methods
.method public b()LEa3;
    .locals 1

    iget-object v0, p0, LFa3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb3;

    invoke-static {v0}, LFa3;->c(Leb3;)LEa3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LFa3;->b()LEa3;

    move-result-object v0

    return-object v0
.end method
