.class public final Lcom/google/android/libraries/places/internal/zzgk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/internal/zzgj;


# instance fields
.field private final zza:Lcom/google/android/libraries/places/internal/zzet;

.field private final zzb:Lcom/google/android/libraries/places/internal/zzex;


# direct methods
.method public constructor <init>(Lcom/google/android/libraries/places/internal/zzex;Lcom/google/android/libraries/places/internal/zzet;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzgk;->zzb:Lcom/google/android/libraries/places/internal/zzex;

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzgk;->zza:Lcom/google/android/libraries/places/internal/zzet;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/libraries/places/internal/zzgi;)V
    .locals 5

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzxp;->zza()Lcom/google/android/libraries/places/internal/zzxm;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzz()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxm;->zzg(Z)Lcom/google/android/libraries/places/internal/zzxm;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzx()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxm;->zzd(Z)Lcom/google/android/libraries/places/internal/zzxm;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzy()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxm;->zze(Z)Lcom/google/android/libraries/places/internal/zzxm;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzd()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxm;->zzj(I)Lcom/google/android/libraries/places/internal/zzxm;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzb()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxm;->zzc(I)Lcom/google/android/libraries/places/internal/zzxm;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zza()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxm;->zzb(I)Lcom/google/android/libraries/places/internal/zzxm;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zze()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxm;->zzk(I)Lcom/google/android/libraries/places/internal/zzxm;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzk()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxm;->zzh(I)Lcom/google/android/libraries/places/internal/zzxm;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzg()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxm;->zzl(I)Lcom/google/android/libraries/places/internal/zzxm;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzc()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxm;->zzf(I)Lcom/google/android/libraries/places/internal/zzxm;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzA()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxm;->zzi(Z)Lcom/google/android/libraries/places/internal/zzxm;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzf()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxm;->zza(I)Lcom/google/android/libraries/places/internal/zzxm;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzi()Lcom/google/android/libraries/places/internal/zzfj;

    move-result-object v1

    sget-object v2, Lcom/google/android/libraries/places/internal/zzfj;->zza:Lcom/google/android/libraries/places/internal/zzfj;

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-ne v1, v2, :cond_0

    invoke-virtual {v0, v4}, Lcom/google/android/libraries/places/internal/zzxm;->zzn(I)Lcom/google/android/libraries/places/internal/zzxm;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzi()Lcom/google/android/libraries/places/internal/zzfj;

    move-result-object v1

    sget-object v2, Lcom/google/android/libraries/places/internal/zzfj;->zzb:Lcom/google/android/libraries/places/internal/zzfj;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxm;->zzn(I)Lcom/google/android/libraries/places/internal/zzxm;

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v3}, Lcom/google/android/libraries/places/internal/zzxm;->zzn(I)Lcom/google/android/libraries/places/internal/zzxm;

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzj()Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;

    move-result-object v1

    sget-object v2, Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;->FULLSCREEN:Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;

    if-ne v1, v2, :cond_2

    invoke-virtual {v0, v4}, Lcom/google/android/libraries/places/internal/zzxm;->zzm(I)Lcom/google/android/libraries/places/internal/zzxm;

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzgi;->zzj()Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;

    move-result-object p1

    sget-object v1, Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;->OVERLAY:Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;

    if-ne p1, v1, :cond_3

    invoke-virtual {v0, v3}, Lcom/google/android/libraries/places/internal/zzxm;->zzm(I)Lcom/google/android/libraries/places/internal/zzxm;

    :cond_3
    :goto_1
    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzxp;

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzgk;->zza:Lcom/google/android/libraries/places/internal/zzet;

    invoke-static {v0}, Lcom/google/android/libraries/places/internal/zzey;->zzb(Lcom/google/android/libraries/places/internal/zzet;)Lcom/google/android/libraries/places/internal/zzxv;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxv;->zzl(I)Lcom/google/android/libraries/places/internal/zzxv;

    invoke-virtual {v0, p1}, Lcom/google/android/libraries/places/internal/zzxv;->zzc(Lcom/google/android/libraries/places/internal/zzxp;)Lcom/google/android/libraries/places/internal/zzxv;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzya;

    invoke-static {p1}, Lcom/google/android/libraries/places/internal/zzey;->zza(Lcom/google/android/libraries/places/internal/zzya;)Lcom/google/android/libraries/places/internal/zzlg;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzgk;->zzb:Lcom/google/android/libraries/places/internal/zzex;

    invoke-virtual {v0, p1}, Lcom/google/android/libraries/places/internal/zzex;->zza(Lcom/google/android/libraries/places/internal/zzlg;)V

    return-void
.end method
