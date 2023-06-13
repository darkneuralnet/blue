.class public final Lio/reactivex/internal/schedulers/d$c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/schedulers/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final b:Lio/reactivex/internal/disposables/h;

.field public final c:Ljava/lang/Runnable;

.field public final synthetic d:Lio/reactivex/internal/schedulers/d$c;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/schedulers/d$c;Lio/reactivex/internal/disposables/h;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/internal/schedulers/d$c$c;->d:Lio/reactivex/internal/schedulers/d$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/reactivex/internal/schedulers/d$c$c;->b:Lio/reactivex/internal/disposables/h;

    iput-object p3, p0, Lio/reactivex/internal/schedulers/d$c$c;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/reactivex/internal/schedulers/d$c$c;->b:Lio/reactivex/internal/disposables/h;

    iget-object v1, p0, Lio/reactivex/internal/schedulers/d$c$c;->d:Lio/reactivex/internal/schedulers/d$c;

    iget-object v2, p0, Lio/reactivex/internal/schedulers/d$c$c;->c:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Lio/reactivex/internal/schedulers/d$c;->b(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/internal/disposables/h;->a(Lio/reactivex/disposables/c;)Z

    return-void
.end method
