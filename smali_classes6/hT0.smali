.class public final synthetic LhT0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/android/material/datepicker/a;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/datepicker/a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LhT0;->b:Lcom/google/android/material/datepicker/a;

    iput-wide p2, p0, LhT0;->c:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LhT0;->b:Lcom/google/android/material/datepicker/a;

    iget-wide v1, p0, LhT0;->c:J

    invoke-static {v0, v1, v2}, Lcom/google/android/material/datepicker/a;->b(Lcom/google/android/material/datepicker/a;J)V

    return-void
.end method
