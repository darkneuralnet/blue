.class public final synthetic LY44;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lg54;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lg54;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY44;->b:Lg54;

    iput-boolean p2, p0, LY44;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LY44;->b:Lg54;

    iget-boolean v1, p0, LY44;->c:Z

    invoke-static {v0, v1}, Lg54;->o(Lg54;Z)V

    return-void
.end method
