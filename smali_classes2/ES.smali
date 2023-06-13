.class public final synthetic LES;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:LSS;


# direct methods
.method public synthetic constructor <init>(ZLSS;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LES;->b:Z

    iput-object p2, p0, LES;->c:LSS;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-boolean v0, p0, LES;->b:Z

    iget-object v1, p0, LES;->c:LSS;

    invoke-static {v0, v1}, LSS;->k(ZLSS;)V

    return-void
.end method
