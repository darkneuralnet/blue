.class public final synthetic LV50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Ln60;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ln60;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV50;->b:Ln60;

    iput p2, p0, LV50;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LV50;->b:Ln60;

    iget v1, p0, LV50;->c:I

    invoke-static {v0, v1}, Ln60;->s(Ln60;I)V

    return-void
.end method
