.class public final synthetic Lcom/google/android/libraries/places/widget/zzi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfe3;


# instance fields
.field public final synthetic zza:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

.field public final synthetic zzb:Landroid/widget/EditText;

.field public final synthetic zzc:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/libraries/places/widget/zzi;->zza:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    iput-object p2, p0, Lcom/google/android/libraries/places/widget/zzi;->zzb:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/google/android/libraries/places/widget/zzi;->zzc:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/libraries/places/widget/zzi;->zza:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    iget-object v1, p0, Lcom/google/android/libraries/places/widget/zzi;->zzb:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/google/android/libraries/places/widget/zzi;->zzc:Landroid/view/View;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;->zzc(Landroid/widget/EditText;Landroid/view/View;Ljava/lang/CharSequence;)V

    return-void
.end method
