.class public final Lcom/stripe/android/uicore/elements/AddressController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/SectionFieldErrorController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldComposable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00150\u0014\u00a2\u0006\u0004\u0008\"\u0010#JU\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R#\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00150\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\"\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00148\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0017\u001a\u0004\u0008!\u0010\u0019\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AddressController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldComposable;",
        "",
        "enabled",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "field",
        "LgV2;",
        "modifier",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "hiddenIdentifiers",
        "lastTextFieldIdentifier",
        "Landroidx/compose/ui/focus/c;",
        "nextFocusDirection",
        "previousFocusDirection",
        "",
        "ComposeUI-MxjM1cc",
        "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V",
        "ComposeUI",
        "LEu1;",
        "",
        "fieldsFlowable",
        "LEu1;",
        "getFieldsFlowable",
        "()LEu1;",
        "",
        "label",
        "Ljava/lang/Integer;",
        "getLabel",
        "()Ljava/lang/Integer;",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "error",
        "getError",
        "<init>",
        "(LEu1;)V",
        "stripe-ui-core_release"
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
        "SMAP\nAddressController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressController.kt\ncom/stripe/android/uicore/elements/AddressController\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,50:1\n190#2:51\n*S KotlinDebug\n*F\n+ 1 AddressController.kt\ncom/stripe/android/uicore/elements/AddressController\n*L\n24#1:51\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final error:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldsFlowable:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;>;"
        }
    .end annotation
.end field

.field private final label:Ljava/lang/Integer;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LEu1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEu1<",
            "+",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "fieldsFlowable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressController;->fieldsFlowable:LEu1;

    new-instance v0, Lcom/stripe/android/uicore/elements/AddressController$special$$inlined$flatMapLatest$1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/AddressController$special$$inlined$flatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v0}, LVu1;->Q(LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressController;->error:LEu1;

    return-void
.end method


# virtual methods
.method public ComposeUI-MxjM1cc(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            "LgV2;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "II",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v9, p9

    const-string v0, "field"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenIdentifiers"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2f2fac69

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v6, "com.stripe.android.uicore.elements.AddressController.ComposeUI (AddressController.kt:32)"

    invoke-static {v0, v9, v2, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v0, v9, 0xe

    or-int/lit16 v0, v0, 0x240

    shr-int/lit8 v2, v9, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int v15, v0, v2

    move/from16 v10, p1

    move-object/from16 v11, p0

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    move-object v14, v1

    invoke-static/range {v10 .. v15}, Lcom/stripe/android/uicore/elements/AddressElementUIKt;->AddressElementUI(ZLcom/stripe/android/uicore/elements/AddressController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v10

    if-nez v10, :cond_2

    goto :goto_0

    :cond_2
    new-instance v11, Lcom/stripe/android/uicore/elements/AddressController$ComposeUI$1;

    move-object v0, v11

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/uicore/elements/AddressController$ComposeUI$1;-><init>(Lcom/stripe/android/uicore/elements/AddressController;ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;III)V

    invoke-interface {v10, v11}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public getError()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressController;->error:LEu1;

    return-object v0
.end method

.method public final getFieldsFlowable()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressController;->fieldsFlowable:LEu1;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressController;->label:Ljava/lang/Integer;

    return-object v0
.end method
