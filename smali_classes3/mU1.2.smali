.class public final LmU1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LmU1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\"\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0018\u00a8\u0006\u001e\u00b2\u0006\u000c\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "LmU1;",
        "",
        "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;",
        "acceptableManualEntry",
        "Lco/bird/android/model/identification/IdentificationManualEntryFormData;",
        "currentFormData",
        "",
        "LH6;",
        "a",
        "Lco/bird/android/model/identification/IdentificationManualEntryFormField;",
        "formField",
        "c",
        "",
        "e",
        "Lco/bird/android/model/identification/IdentificationDocumentType;",
        "currentDocumentType",
        "b",
        "Ljava/util/Locale;",
        "currentLocale",
        "g",
        "Lco/bird/android/model/identification/IdentificationGender;",
        "currentGender",
        "f",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "LG6;",
        "item",
        "co.bird.android.feature.identification"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdentificationManualEntryFormConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormConverter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1#2:292\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmU1;->a:Landroid/content/Context;

    return-void
.end method

.method public static final synthetic access$generateErrorForField(LmU1;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LmU1;->e(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getContext$p(LmU1;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LmU1;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final d(Lkotlin/Lazy;)LG6;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "LG6;",
            ">;)",
            "LG6;"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LG6;

    return-object p0
.end method


# virtual methods
.method public final a(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;",
            "Lco/bird/android/model/identification/IdentificationManualEntryFormData;",
            ")",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    const-string v0, "acceptableManualEntry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentFormData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xb

    new-array v0, v0, [LH6;

    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getIdentificationDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, LmU1;->b(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationDocumentType;)LH6;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->FIRST_NAME:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    invoke-virtual {p0, p1, p2, v1}, LmU1;->c(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)LH6;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->MIDDLE_NAME:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    invoke-virtual {p0, p1, p2, v1}, LmU1;->c(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)LH6;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->LAST_NAME:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    invoke-virtual {p0, p1, p2, v1}, LmU1;->c(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)LH6;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->ID_NUMBER:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    invoke-virtual {p0, p1, p2, v1}, LmU1;->c(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)LH6;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->ISSUING_AUTHORITY:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    invoke-virtual {p0, p1, p2, v1}, LmU1;->c(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)LH6;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->ISSUE_DATE:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    invoke-virtual {p0, p1, p2, v1}, LmU1;->c(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)LH6;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->EXPIRATION_DATE:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    invoke-virtual {p0, p1, p2, v1}, LmU1;->c(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)LH6;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->DATE_OF_BIRTH:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    invoke-virtual {p0, p1, p2, v1}, LmU1;->c(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)LH6;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getGender()Lco/bird/android/model/identification/IdentificationGender;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, LmU1;->f(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationGender;)LH6;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getNationality()Ljava/util/Locale;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, LmU1;->g(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Ljava/util/Locale;)LH6;

    move-result-object p1

    const/16 p2, 0xa

    aput-object p1, v0, p2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationDocumentType;)LH6;
    .locals 13

    const/4 v0, 0x0

    if-nez p2, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getAllowedSpecialDocumentTypes()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lco/bird/android/model/identification/IdentificationDocumentType;

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    if-nez p2, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getAllowedDocumentTypes()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lco/bird/android/model/identification/IdentificationDocumentType;

    goto :goto_1

    :cond_1
    move-object p2, v0

    :goto_1
    if-nez p2, :cond_2

    sget-object p2, Lco/bird/android/model/identification/IdentificationDocumentType;->DRIVER_LICENSE:Lco/bird/android/model/identification/IdentificationDocumentType;

    :cond_2
    move-object v5, p2

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getAllowedSpecialDocumentTypes()Ljava/util/List;

    move-result-object p2

    if-nez p2, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_3
    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getAllowedDocumentTypes()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_2
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p2, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    const/4 v1, 0x1

    xor-int/2addr p2, v1

    if-eqz p2, :cond_5

    goto :goto_3

    :cond_5
    move-object p1, v0

    :goto_3
    const/4 p2, 0x0

    if-eqz p1, :cond_6

    invoke-interface {p1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    move p1, v1

    goto :goto_4

    :cond_6
    move p1, p2

    :goto_4
    if-eqz p1, :cond_7

    iget-object p1, p0, LmU1;->a:Landroid/content/Context;

    sget v0, Lnl4;->identification_document_type_invalid_selection:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_7
    move-object v3, v0

    new-instance p1, LG6;

    iget-object v0, p0, LmU1;->a:Landroid/content/Context;

    sget v2, Lnl4;->identification_document_type_title:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    sget v8, Lhj4;->item_selector_header:I

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v6, p1

    invoke-direct/range {v6 .. v11}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v0, v1, [LG6;

    new-instance v12, LG6;

    new-instance v7, LnU1;

    iget-object v1, p0, LmU1;->a:Landroid/content/Context;

    invoke-static {v5, v1}, LJi1;->d(Lco/bird/android/model/identification/IdentificationDocumentType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    sget v1, Lrg4;->ic_chevron_right:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v6, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->DOCUMENT_TYPE:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LnU1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)V

    sget v8, Lhj4;->item_manual_entry_selector:I

    move-object v6, v12

    invoke-direct/range {v6 .. v11}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v12, v0, p2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance p2, LH6;

    const/4 v9, 0x0

    move-object v6, p2

    move-object v8, p1

    invoke-direct/range {v6 .. v11}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2
.end method

.method public final c(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)LH6;
    .locals 8

    new-instance v0, LmU1$b;

    invoke-direct {v0, p3, p0, p1, p2}, LmU1$b;-><init>(Lco/bird/android/model/identification/IdentificationManualEntryFormField;LmU1;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sget-object v1, LmU1$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v1, p3

    const/4 v1, 0x0

    packed-switch p3, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_0
    :goto_0
    :pswitch_0
    move-object p1, v1

    goto :goto_1

    :pswitch_1
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getImplicitAgeYears()Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {v0}, LmU1;->d(Lkotlin/Lazy;)LG6;

    move-result-object p1

    goto :goto_1

    :pswitch_2
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getImplicitExpirationDays()Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {v0}, LmU1;->d(Lkotlin/Lazy;)LG6;

    move-result-object p1

    goto :goto_1

    :pswitch_3
    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getIdentificationDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object p1

    sget-object p2, Lco/bird/android/model/identification/IdentificationDocumentType;->EMIRATES_ID:Lco/bird/android/model/identification/IdentificationDocumentType;

    if-ne p1, p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0}, LmU1;->d(Lkotlin/Lazy;)LG6;

    move-result-object p1

    goto :goto_1

    :pswitch_4
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getRequireIssueDate()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0}, LmU1;->d(Lkotlin/Lazy;)LG6;

    move-result-object p1

    goto :goto_1

    :pswitch_5
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getRequireName()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0}, LmU1;->d(Lkotlin/Lazy;)LG6;

    move-result-object p1

    goto :goto_1

    :pswitch_6
    invoke-static {v0}, LmU1;->d(Lkotlin/Lazy;)LG6;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_2

    new-instance v1, LH6;

    const/4 p2, 0x1

    new-array p2, p2, [LG6;

    const/4 p3, 0x0

    aput-object p1, p2, p3

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)Ljava/lang/String;
    .locals 12

    sget-object v0, LmU1$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    packed-switch p3, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getNationality()Ljava/util/Locale;

    move-result-object p2

    if-nez p2, :cond_e

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getRequireNationality()Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, LmU1;->a:Landroid/content/Context;

    sget p2, Lnl4;->manual_entry_validation_nationality_required:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_9

    :pswitch_1
    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getGender()Lco/bird/android/model/identification/IdentificationGender;

    move-result-object p2

    if-nez p2, :cond_e

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getRequireGender()Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, LmU1;->a:Landroid/content/Context;

    sget p2, Lnl4;->manual_entry_validation_gender_required:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_9

    :pswitch_2
    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getIdentificationDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object p3

    sget-object v3, Lco/bird/android/model/identification/IdentificationDocumentType;->UNKNOWN:Lco/bird/android/model/identification/IdentificationDocumentType;

    if-eq p3, v3, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getAllowedDocumentTypes()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getIdentificationDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_e

    :cond_1
    iget-object p1, p0, LmU1;->a:Landroid/content/Context;

    sget p2, Lnl4;->identification_document_type_invalid_selection:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_9

    :pswitch_3
    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getDateOfBirth()Lorg/joda/time/DateTime;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->isAfterNow()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    if-nez v0, :cond_e

    iget-object p1, p0, LmU1;->a:Landroid/content/Context;

    sget p2, Lnl4;->manual_entry_validation_date_invalid:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_9

    :pswitch_4
    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getExpirationDate()Lorg/joda/time/DateTime;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->isBeforeNow()Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    move v0, v2

    :goto_2
    if-nez v0, :cond_e

    iget-object p1, p0, LmU1;->a:Landroid/content/Context;

    sget p2, Lnl4;->manual_entry_validation_date_invalid:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_9

    :pswitch_5
    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getIssuingAuthority()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getRequireIssuingAuthority()Ljava/util/List;

    move-result-object p1

    if-eqz p2, :cond_e

    if-eqz p1, :cond_4

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    move p2, v0

    goto :goto_3

    :cond_4
    move p2, v2

    :goto_3
    if-eqz p2, :cond_e

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    const-string v4, ", "

    const-string v5, "["

    const-string v6, "]"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x38

    const/4 v11, 0x0

    invoke-static/range {v3 .. v11}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, LmU1;->a:Landroid/content/Context;

    sget p3, Lnl4;->manual_entry_validation_valid_authorities_missing:I

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v2

    invoke-virtual {p2, p3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_9

    :pswitch_6
    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getIssueDate()Lorg/joda/time/DateTime;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->isAfterNow()Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    move v0, v2

    :goto_4
    if-nez v0, :cond_e

    iget-object p1, p0, LmU1;->a:Landroid/content/Context;

    sget p2, Lnl4;->manual_entry_validation_date_invalid:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_9

    :pswitch_7
    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getLastName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_5

    :cond_6
    move v0, v2

    :cond_7
    :goto_5
    if-eqz v0, :cond_e

    iget-object p1, p0, LmU1;->a:Landroid/content/Context;

    sget p2, Lnl4;->required:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    :pswitch_8
    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getFirstName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_6

    :cond_8
    move v0, v2

    :cond_9
    :goto_6
    if-eqz v0, :cond_e

    iget-object p1, p0, LmU1;->a:Landroid/content/Context;

    sget p2, Lnl4;->required:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    :pswitch_9
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getRequireIdNumberRegex()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance p3, Lkotlin/text/Regex;

    invoke-direct {p3, p1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :cond_a
    move-object p3, v1

    :goto_7
    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getIdNumber()Ljava/lang/String;

    move-result-object p1

    if-eqz p3, :cond_b

    if-eqz p1, :cond_b

    invoke-virtual {p3, p1}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_b

    iget-object p1, p0, LmU1;->a:Landroid/content/Context;

    sget p2, Lnl4;->manual_entry_validation_invalid_id:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    :cond_b
    if-eqz p1, :cond_d

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_8

    :cond_c
    move v0, v2

    :cond_d
    :goto_8
    if-eqz v0, :cond_e

    iget-object p1, p0, LmU1;->a:Landroid/content/Context;

    sget p2, Lnl4;->required:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :cond_e
    :goto_9
    :pswitch_a
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationGender;)LH6;
    .locals 11

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getRequireGender()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    if-nez p2, :cond_1

    iget-object p1, p0, LmU1;->a:Landroid/content/Context;

    sget v0, Lnl4;->manual_entry_validation_gender_required:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v3, v0

    new-instance p1, LH6;

    const/4 v0, 0x1

    new-array v0, v0, [LG6;

    new-instance v10, LG6;

    new-instance v7, LnU1;

    iget-object v1, p0, LmU1;->a:Landroid/content/Context;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationGender;->toStringResId()I

    move-result v2

    goto :goto_0

    :cond_2
    sget v2, Lnl4;->manual_entry_gender:I

    :goto_0
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v1, "context.getString(\n     \u2026ntry_gender\n            )"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lrg4;->ic_chevron_right:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v6, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->GENDER:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    move-object v1, v7

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, LnU1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)V

    sget v6, Lhj4;->item_manual_entry_selector:I

    const/4 p2, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, v10

    move-object v5, v7

    move v7, p2

    invoke-direct/range {v4 .. v9}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v10, v0, p2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final g(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Ljava/util/Locale;)LH6;
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getRequireNationality()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    if-nez p2, :cond_1

    iget-object v1, v0, LmU1;->a:Landroid/content/Context;

    sget v3, Lnl4;->manual_entry_validation_nationality_required:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    new-instance v10, LH6;

    const/4 v1, 0x1

    new-array v7, v1, [LG6;

    new-instance v8, LG6;

    new-instance v12, LnU1;

    if-eqz p2, :cond_2

    invoke-virtual/range {p2 .. p2}, Ljava/util/Locale;->getDisplayCountry()Ljava/lang/String;

    move-result-object v2

    :cond_2
    if-nez v2, :cond_3

    iget-object v1, v0, LmU1;->a:Landroid/content/Context;

    sget v2, Lnl4;->manual_entry_nationality:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "context.getString(L.stri\u2026manual_entry_nationality)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    :cond_3
    sget v1, Lrg4;->ic_chevron_right:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v6, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->NATIONALITY:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    move-object v1, v12

    move-object/from16 v5, p2

    invoke-direct/range {v1 .. v6}, LnU1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)V

    sget v13, Lhj4;->item_manual_entry_selector:I

    const/4 v14, 0x0

    const/4 v15, 0x4

    const/16 v16, 0x0

    move-object v11, v8

    invoke-direct/range {v11 .. v16}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    aput-object v8, v7, v1

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v10
.end method
