.class public final synthetic LPX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LDX;

.field public final synthetic c:Lbi3;

.field public final synthetic d:Lio/reactivex/c;


# direct methods
.method public synthetic constructor <init>(LDX;Lbi3;Lio/reactivex/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPX;->b:LDX;

    iput-object p2, p0, LPX;->c:Lbi3;

    iput-object p3, p0, LPX;->d:Lio/reactivex/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LPX;->b:LDX;

    iget-object v1, p0, LPX;->c:Lbi3;

    iget-object v2, p0, LPX;->d:Lio/reactivex/c;

    invoke-static {v0, v1, v2}, LTX;->d(LDX;Lbi3;Lio/reactivex/c;)V

    return-void
.end method
