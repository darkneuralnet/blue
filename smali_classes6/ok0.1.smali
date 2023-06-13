.class public final Lok0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Landroid/content/ContentResolver;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lok0;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)Lok0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/content/Context;",
            ">;)",
            "Lok0;"
        }
    .end annotation

    new-instance v0, Lok0;

    invoke-direct {v0, p0}, Lok0;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Landroid/content/ContentResolver;
    .locals 0

    invoke-static {p0}, Lgk0$c;->h(Landroid/content/Context;)Landroid/content/ContentResolver;

    move-result-object p0

    invoke-static {p0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/ContentResolver;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/content/ContentResolver;
    .locals 1

    iget-object v0, p0, Lok0;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lok0;->c(Landroid/content/Context;)Landroid/content/ContentResolver;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lok0;->b()Landroid/content/ContentResolver;

    move-result-object v0

    return-object v0
.end method
