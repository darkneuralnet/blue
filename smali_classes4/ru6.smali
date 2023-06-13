.class public final synthetic Lru6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/f;


# instance fields
.field public final synthetic b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

.field public final synthetic c:Lsu6$a$a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lsu6$a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lru6;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iput-object p2, p0, Lru6;->c:Lsu6$a$a;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, Lru6;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v1, p0, Lru6;->c:Lsu6$a$a;

    invoke-static {v0, v1}, Lsu6$a;->a(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lsu6$a$a;)V

    return-void
.end method
