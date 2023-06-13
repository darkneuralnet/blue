.class public final synthetic Lqu6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/z;


# instance fields
.field public final synthetic b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqu6;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/y;)V
    .locals 1

    iget-object v0, p0, Lqu6;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-static {v0, p1}, Lsu6;->a(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lio/reactivex/y;)V

    return-void
.end method
