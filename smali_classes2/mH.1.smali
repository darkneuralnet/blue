.class public final synthetic LmH;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LTH;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(LTH;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmH;->b:LTH;

    iput-boolean p2, p0, LmH;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LmH;->b:LTH;

    iget-boolean v1, p0, LmH;->c:Z

    invoke-static {v0, v1}, LTH;->H(LTH;Z)V

    return-void
.end method
