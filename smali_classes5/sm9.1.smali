.class public final synthetic Lsm9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lym9;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lym9;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsm9;->a:Lym9;

    iput-wide p2, p0, Lsm9;->b:J

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lsm9;->a:Lym9;

    iget-wide v1, p0, Lsm9;->b:J

    invoke-virtual {v0, v1, v2, p1}, Lym9;->b(JLjava/lang/Exception;)V

    return-void
.end method
