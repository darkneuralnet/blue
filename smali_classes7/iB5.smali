.class public final LiB5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY94;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LY94<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/Object;


# instance fields
.field public volatile a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "TT;>;"
        }
    .end annotation
.end field

.field public volatile b:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LiB5;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LY94;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LiB5;->c:Ljava/lang/Object;

    iput-object v0, p0, LiB5;->b:Ljava/lang/Object;

    iput-object p1, p0, LiB5;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P::",
            "LY94<",
            "TT;>;T:",
            "Ljava/lang/Object;",
            ">(TP;)",
            "LY94<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, LiB5;

    if-nez v0, :cond_1

    instance-of v0, p0, LV51;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LiB5;

    invoke-static {p0}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LY94;

    invoke-direct {v0, p0}, LiB5;-><init>(LY94;)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LiB5;->b:Ljava/lang/Object;

    sget-object v1, LiB5;->c:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LiB5;->a:LY94;

    if-nez v0, :cond_0

    iget-object v0, p0, LiB5;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LiB5;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, LiB5;->a:LY94;

    :cond_1
    :goto_0
    return-object v0
.end method
