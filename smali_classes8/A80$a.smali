.class public final LA80$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/disposables/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA80;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final b:Lx80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx80<",
            "*>;"
        }
    .end annotation
.end field

.field public volatile c:Z


# direct methods
.method public constructor <init>(Lx80;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA80$a;->b:Lx80;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LA80$a;->c:Z

    iget-object v0, p0, LA80$a;->b:Lx80;

    invoke-interface {v0}, Lx80;->cancel()V

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, LA80$a;->c:Z

    return v0
.end method
