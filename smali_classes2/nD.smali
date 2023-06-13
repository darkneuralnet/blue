.class public final synthetic LnD;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LS74;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LS74;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnD;->b:LS74;

    iput p2, p0, LnD;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LnD;->b:LS74;

    iget v1, p0, LnD;->c:I

    invoke-static {v0, v1}, LsD;->a(LS74;I)V

    return-void
.end method
