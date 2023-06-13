.class public final Lio/reactivex/internal/schedulers/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/schedulers/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final b:Lio/reactivex/internal/schedulers/d$b;

.field public final synthetic c:Lio/reactivex/internal/schedulers/d;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/schedulers/d;Lio/reactivex/internal/schedulers/d$b;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/internal/schedulers/d$a;->c:Lio/reactivex/internal/schedulers/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/reactivex/internal/schedulers/d$a;->b:Lio/reactivex/internal/schedulers/d$b;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/reactivex/internal/schedulers/d$a;->b:Lio/reactivex/internal/schedulers/d$b;

    iget-object v1, v0, Lio/reactivex/internal/schedulers/d$b;->c:Lio/reactivex/internal/disposables/h;

    iget-object v2, p0, Lio/reactivex/internal/schedulers/d$a;->c:Lio/reactivex/internal/schedulers/d;

    invoke-virtual {v2, v0}, Lio/reactivex/internal/schedulers/d;->d(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/reactivex/internal/disposables/h;->a(Lio/reactivex/disposables/c;)Z

    return-void
.end method
