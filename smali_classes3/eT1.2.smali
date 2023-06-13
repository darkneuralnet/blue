.class public final synthetic LeT1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LfT1;

.field public final synthetic c:LZV1;

.field public final synthetic d:Ljava/util/Locale;

.field public final synthetic e:Lco/bird/android/model/identification/IdentificationDocumentType;

.field public final synthetic f:Ljava/util/Set;

.field public final synthetic g:Lco/bird/android/model/identification/IdentificationDebugResponse;


# direct methods
.method public synthetic constructor <init>(LfT1;LZV1;Ljava/util/Locale;Lco/bird/android/model/identification/IdentificationDocumentType;Ljava/util/Set;Lco/bird/android/model/identification/IdentificationDebugResponse;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LeT1;->b:LfT1;

    iput-object p2, p0, LeT1;->c:LZV1;

    iput-object p3, p0, LeT1;->d:Ljava/util/Locale;

    iput-object p4, p0, LeT1;->e:Lco/bird/android/model/identification/IdentificationDocumentType;

    iput-object p5, p0, LeT1;->f:Ljava/util/Set;

    iput-object p6, p0, LeT1;->g:Lco/bird/android/model/identification/IdentificationDebugResponse;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LeT1;->b:LfT1;

    iget-object v1, p0, LeT1;->c:LZV1;

    iget-object v2, p0, LeT1;->d:Ljava/util/Locale;

    iget-object v3, p0, LeT1;->e:Lco/bird/android/model/identification/IdentificationDocumentType;

    iget-object v4, p0, LeT1;->f:Ljava/util/Set;

    iget-object v5, p0, LeT1;->g:Lco/bird/android/model/identification/IdentificationDebugResponse;

    invoke-static/range {v0 .. v5}, LfT1;->a(LfT1;LZV1;Ljava/util/Locale;Lco/bird/android/model/identification/IdentificationDocumentType;Ljava/util/Set;Lco/bird/android/model/identification/IdentificationDebugResponse;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
