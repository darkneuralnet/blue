.class public final synthetic Laz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/bottomsheet/BaseBottomSheet;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/bottomsheet/BaseBottomSheet;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laz;->b:Lco/bird/android/bottomsheet/BaseBottomSheet;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Laz;->b:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-static {v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->c(Lco/bird/android/bottomsheet/BaseBottomSheet;)V

    return-void
.end method
