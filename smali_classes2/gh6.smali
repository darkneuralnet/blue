.class public final synthetic Lgh6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Lkh6;


# direct methods
.method public synthetic constructor <init>(ZLkh6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lgh6;->b:Z

    iput-object p2, p0, Lgh6;->c:Lkh6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-boolean v0, p0, Lgh6;->b:Z

    iget-object v1, p0, Lgh6;->c:Lkh6;

    invoke-static {v0, v1}, Lkh6;->f(ZLkh6;)V

    return-void
.end method
