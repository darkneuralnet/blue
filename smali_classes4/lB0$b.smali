.class public final LlB0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LlB0;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;",
        "Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;",
        "it",
        "a",
        "(Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;)Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LlB0;


# direct methods
.method public constructor <init>(LlB0;)V
    .locals 0

    iput-object p1, p0, LlB0$b;->g:LlB0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;)Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LlB0$b;->g:LlB0;

    invoke-static {p1}, LlB0;->access$getPreference$p(LlB0;)Lgl;

    move-result-object p1

    invoke-virtual {p1}, Lgl;->H()Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;

    invoke-virtual {p0, p1}, LlB0$b;->a(Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;)Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;

    move-result-object p1

    return-object p1
.end method
